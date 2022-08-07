package com.example.diplommaket.testImage;

import com.example.diplommaket.entity.Product;
import com.example.diplommaket.service.ProductService;
import com.fasterxml.classmate.AnnotationConfiguration;
import com.fasterxml.classmate.AnnotationInclusion;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.annotation.Annotation;
@Service
public class HibernateUtil {

@Autowired
  private  ProductService productService;
public void testSave(){
    File file = new File("D://Diplom//src//main//webapp//resources//icons//1.jpg");
    byte[] bFile = new byte[(int) file.length()];

        try {
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.read(bFile);
        fileInputStream.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

        Product product =  productService.findProductById(1L);
        product.setImageProduct(bFile);
        productService.save(product);


}

public void getImage(){
   Product product = productService.findProductById(1L);

        try{
            //FileOutputStream fos = new FileOutputStream("images\\output.jpg");  //windows
            FileOutputStream fos = new FileOutputStream("D://Diplom//src//main//webapp//resources//icons//1.jpg");

            fos.write(product.getImageProduct());
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}





