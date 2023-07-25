package com.cc.entire;

import lombok.Data;

@Data
public class SaleProperty {
    private Long id;
    private String name;
    private Long parentId;
    private Long categoryId;
}
