package com.usa.ciclo4.retociclo4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "gadget")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gadget {
    @Id
    private String id;
    private String brand;
    private String category;
    private String presentation;
    private String description;
    private boolean availability;
    private Double price;
    private Integer quantity;
    private String photography;


}
