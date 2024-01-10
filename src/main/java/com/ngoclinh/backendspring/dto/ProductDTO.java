package com.ngoclinh.backendspring.dto;

import com.ngoclinh.backendspring.model.Unit;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ProductDTO {
    private Long id;
    private String name;
    private String supplier;
    private double purchasePrice;
    private double salePrice;
    private UnitDTO unitSale;
    private UnitDTO unitPurchase;
    private Integer packing;
    private LocalDateTime expiry;
}
