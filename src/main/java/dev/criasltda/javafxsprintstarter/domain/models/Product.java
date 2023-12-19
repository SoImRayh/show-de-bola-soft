package dev.criasltda.javafxsprintstarter.domain.models;

import dev.criasltda.javafxsprintstarter.domain.models.base.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@NoArgsConstructor
@Getter
@Setter
public class Product extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String obs;
    private Integer price;
    private Integer stock;

}
