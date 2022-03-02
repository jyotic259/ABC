package com.sample.restaurantmanagementsystem.dto;

import com.sample.restaurantmanagementsystem.data.entity.Product;
import lombok.Data;

@Data
public class OrderItemDTO {
    private Product product;
    private int quantity;
}
