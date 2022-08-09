package com.example.diplommaket.service;

import com.example.diplommaket.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
@Service
public class ImageService {
    @Autowired
    private ProductService productService;
    public String uploadImage(MultipartFile file, Long id) throws UnsupportedEncodingException {
        byte[] bArray = null;
        try {
            bArray = new byte[file.getBytes().length];
            int i = 0;
            for (byte b : file.getBytes()) {
                bArray[i++] = b;
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        byte[] encodeBase64 = Base64.getEncoder().encode(bArray);
        String base64Encoded = new String(encodeBase64, "UTF-8");
        Product product = productService.findProductById(id);
        product.setImageProduct(base64Encoded);
        productService.save(product);
        return null;
    }
}
