package an.E_com.web.config;

import an.E_com.web.Category;
import an.E_com.web.CategoryRepository;
import an.E_com.web.Product;
import an.E_com.web.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataSeeder(ProductRepository productRepository,
                      CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) {

        if (productRepository.count() > 0) {
            return;
        }

        Category electronics = new Category("Electronics");
        Category fashion = new Category("Fashion");

        categoryRepository.saveAll(List.of(electronics, fashion));

        List<Product> products = List.of(
                new Product(
                        "iPhone 15 Pro",
                        new BigDecimal("129999"),
                        "https://example.com/images/iphone15pro.jpg",
                        electronics
                ),
                new Product(
                        "Samsung Galaxy S24 Ultra",
                        new BigDecimal("119999"),
                        "https://example.com/images/s24ultra.jpg",
                        electronics
                ),
                new Product(
                        "MacBook Air M3",
                        new BigDecimal("149999"),
                        "https://example.com/images/macbookm3.jpg",
                        electronics
                ),
                new Product(
                        "Nike Air Max",
                        new BigDecimal("9999"),
                        "https://example.com/images/nikeairmax.jpg",
                        fashion
                )
        );

        productRepository.saveAll(products);

        System.out.println("DataSeeder: Products with images inserted");
    }
}

