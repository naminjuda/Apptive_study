package domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private Long price;
    private Integer quantity;

    public String getName(){ return name; }
    public Long getPrice(){ return price; }
    public Integer getQuantity(){ return quantity; }

    public void setName(String name){ this.name = name;}
    public void setPrice(Long price){ this.price = price;}
    public void setQuantity(Integer name){ this.quantity = quantity;}
}
