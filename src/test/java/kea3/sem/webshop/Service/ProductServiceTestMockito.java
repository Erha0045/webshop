package kea3.sem.webshop.Service;

import kea3.sem.webshop.Model.Product;
import kea3.sem.webshop.Repository.ProductRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ProductServiceTestMockito {

    private static final long PRODUCT_ID = 4;
    @InjectMocks
    ProductService productService;//initialize Service to test with Mocks

    @Mock
    ProductRepo mockedproductRepo;//Mocked repository that will return testdata


    @BeforeEach
    void setUp() {
        //Instantiate mock repository
        MockitoAnnotations.openMocks(this);

        //arrange
        //definer dummydata
        Product product = new Product(PRODUCT_ID,"Kattemad",26);

        //Define what is returned when mock repository is called
        Mockito.when(mockedproductRepo.read(PRODUCT_ID)).thenReturn(product);
    }

    @Test
    void readAll() {
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
        String name = productService.read(PRODUCT_ID).getName();

        //assert
        //simple assertion on name - test service with mock injected
        assertEquals("Kattemad",name);

        //Test that read gets called exactly once when service is called
        Mockito.verify(mockedproductRepo,Mockito.times(1)).read(PRODUCT_ID);

    }

    @Test
    void delete() {
    }
}