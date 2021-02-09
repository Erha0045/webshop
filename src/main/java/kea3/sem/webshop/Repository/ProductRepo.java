package kea3.sem.webshop.Repository;

import kea3.sem.webshop.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ProductRepo implements IcrudRepository<Product>{

    @Autowired
    JdbcTemplate template;


    @Override
    public void create(Product product) {
        String sql = "INSERT INTO products (id, name, price) VALUES (?, ?, ?)";
        template.update(sql, product.getId(), product.getName(), product.getPrice());
    }
    @Override
    public List<Product> readAll() {
        String sql = "SELECT * FROM products";
        RowMapper<Product> rowMapper = new BeanPropertyRowMapper<>(Product.class);
        return template.query(sql, rowMapper);
    }
    @Override
    public Product read(long id) {
        String sql = "SELECT * FROM products WHERE id=?";
        RowMapper<Product> rowMapper = new BeanPropertyRowMapper<>(Product.class);
        return template.queryForObject(sql, rowMapper, id);
    }

    @Override
    public void update(Product product){
        String sql = "UPDATE products SET name=?, price=? WHERE id=?";
        template.update(sql, product.getName(), product.getPrice(), product.getId());
    }

    @Override
    public void delete(long id){
        String sql = "DELETE FROM products WHERE id=?";
        template.update(sql, id);
    }
}
