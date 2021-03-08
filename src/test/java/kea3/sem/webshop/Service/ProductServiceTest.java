package kea3.sem.webshop.Service;

import kea3.sem.webshop.Model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProductServiceTest {

    @Autowired
    ProductService productService;

    @BeforeEach
    void setUp() {
        //arrange

    }

    @Test
    void readAll() {
        //act
        List<Product> products;

        //læs fra service
        products    = productService.readAll();
        long result  = products.size();

        //Assert
        //db initialiseret
        assertEquals(8 ,result);
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void read() {
        //act
//        Product result = productService.read(24);
//
//        Product result = productRepo.read(24);
//        assert
//        assertEquals(24, result);
    }

    @Test
    void delete() {
    }
}