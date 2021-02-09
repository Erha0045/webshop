package Service;

import Model.Product;
import Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> readAll(){
        List<Product> products = new ArrayList<>();
        for (Product product:productRepository.readAll()) {
            products.add(product);
        }
        return products;
    }
    public void create(Product product){
        productRepository.create(product);
    }

    public boolean update(Product product){
        boolean updateOk = productRepository.update(product);
        return updateOk;
    }
    public Product read(long id){
        return productRepository.read(id);
    }
    public boolean delete(Long id){
        return productRepository.delete(id);
    }
}
