package com.sc.cartservice.dto;

import lombok.Data;

@Data
public class CartItemDto {
    private String productCode;
    private String productName;
    private double productPrice;
    private int quantity;
}
