package com.food_order.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private Long price;
    @ManyToOne
    private Category foodCategory;
    @ElementCollection
    private List<String> images;

    private Boolean available;
    @ManyToOne
    private Restaurant restaurant;
    private boolean isVegetarian;
    private boolean isSeasonal;
    @ManyToMany
    private List<IngredientsItem> ingredientsItems=new ArrayList<>();
    private Date creationDate;
}
