package backend.ecom.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "products")
@Data
public class Product {
    @Id
    private String id; // MongoDB uses String for IDs
    private String name;
    private String description;
    private double price;
    private int stock;
    private String category;
}
