package dto;

import domain.Product;

public record ProductResponse(
        String name,
        Long price,
        Integer quantity
) {
    public static ProductResponse from (Product product) {return new ProductResponse(product.getName(), product.getPrice(), product.getQuantity());}
}
