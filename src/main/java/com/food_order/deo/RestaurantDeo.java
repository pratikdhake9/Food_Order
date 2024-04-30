package com.food_order.deo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.List;

@Data
@Embeddable
public class RestaurantDeo {
    private String title;

    @Column(length = 1000)
    private List<String>  image;

    private String description;

    private Long id;
}
