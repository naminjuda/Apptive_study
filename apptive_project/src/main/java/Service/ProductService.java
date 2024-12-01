package Service;

import Exception.product.ProductNameDuplicationError;
import domain.Product;
import dto.ProductRequest;
import org.springframework.transaction.annotation.Transactional;
import repository.ProductRepository;

public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(String name, Long price, Integer quantity) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setQuantity(quantity);

        return productRepository.save(product);
    }

    @Transactional
    public Product join(ProductRequest productRequest) {
        Product product = new Product();
        product.setName(productRequest.name());
        product.setPrice(productRequest.price());
        product.setQuantity(productRequest.quantity());

        validateDuplicateProduct(product);

        return productRepository.save(product);
    }

    private void validateDuplicateProduct(Product product) {
        productRepository.findByName(product.getName())
                .ifPresent(m -> {
                    throw new ProductNameDuplicationError();
                });
    }
}
