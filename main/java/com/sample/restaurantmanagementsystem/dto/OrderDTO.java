package com.sample.restaurantmanagementsystem.dto;

import com.sample.restaurantmanagementsystem.data.entity.RestaurantTable;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {
    private List<OrderItemDTO> items;
    private double totalPrice;
    private RestaurantTable table;
    private Date orderDate;
}
