package com.food_order.deo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.List;

@Data
@Embeddable
public class RestaurantDto {

    private String title;
    @Column(length = 1000)
    private List<String> images;
    private Long id;
    private String description;
}
