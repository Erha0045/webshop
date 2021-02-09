/*
package Repository;

import Model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IcrudRepository<Product> {

    private List<Product> products = new ArrayList<>();

    public ProductRepository() {
        this.products.add(new Product(1,"Kaffe",23.95));
        this.products.add(new Product(2,"Te",33.95));
        this.products.add(new Product(1,"Sukker",15.95));
    }



    @Override
    public List<Product> readAll() {
        return products;
    }

    @Override
    public void create(Product product) {
        products.add(product);

    }

    @Override
    public Product read(long id) {
        int i=0;
        while (i<products.size()){
            if (products.get(i).getId()==id)
                return products.get(i);
            i++;
        }
        return null;
    }

    @Override
    public boolean update(Product product) {
        for (int i = 0; i <products.size() ; i++) {
            if (products.get(i).getId()==product.getId()){
                products.set(i,product);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(long id) {
        int i =0;
        while (i<products.size()){
            if (products.get(i).getId()==id){
                products.remove(i);
                return true;
            }
            i++;
        }
        return false;
    }
}
*/
