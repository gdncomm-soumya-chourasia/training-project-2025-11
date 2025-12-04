package com.sc.productservice.dto;

import lombok.Data;

@Data
public class ProductDto {
    private String productCode;
    private String productName;
    private double productPrice;
}
