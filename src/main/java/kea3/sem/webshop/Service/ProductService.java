package kea3.sem.webshop.Service;

import kea3.sem.webshop.Model.Product;
import kea3.sem.webshop.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    //Til tirsdag (lektie): lav en RestService products.
    // Der skal være to metoder
    // 1. Getmapping("/products") som returnerer alle varer
    // 2. Getmapping("/products/{id}") som returnerer varen med specifik id
    @Autowired
    ProductRepo productRepo;

    public List<Product> readAll(){
        List<Product> products = new ArrayList<>();
        for (Product product: productRepo.readAll()) {
            products.add(product);
        }
        return products;
    }
    public void create(Product product){
        productRepo.create(product);
    }

    public void update(Product product){
        productRepo.update(product);
    }
    public Product read(long id){
        return productRepo.read(id);
    }
    public void delete(long id){
        productRepo.delete(id);
    }
    public Product search(long id){
        return productRepo.read(id);
    }

}
