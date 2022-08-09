package com.example.diplommaket.service;

import com.example.diplommaket.entity.Group;
import com.example.diplommaket.entity.Item;
import com.example.diplommaket.entity.Product;
import com.example.diplommaket.repository.GroupRepository;
import com.example.diplommaket.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private ItemService itemService;
    public void writeImageToRespose(Long id, HttpServletResponse response) {
        //store image in browser cache

        response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
        response.setHeader("Cache-Control", "max-age=2628000");

        //obtaining bytes from DB
        byte[] imageData = productRepository.findProductById(id).getImageProduct();

        //Some conversion
        //Maybe to base64 string or something else
        //Pay attention to encoding (UTF-8, etc)

        //write result to http response
        try (OutputStream out = response.getOutputStream()) {


            out.write(imageData);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean addProduct(Product product) {
        Optional<Group> group = groupRepository.findById(product.getGroups().getId());
        Item item = new Item();
        item.setGroup(group.get());
        itemService.save(item);
        product.setItems(item);
        product.setGroups(group.get());
        productRepository.save(product);
        item.setProduct(product);
        itemService.save(item);
        return true;
    }
    public void delete(Long id){
        productRepository.deleteById(id);
    }
    public Product findProductById(Long id) {
        return productRepository.findProductById(id);
    }
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    public void save(Product product){
        productRepository.save(product);
    }
}
