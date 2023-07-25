package com.cc.dto;

import com.cc.entire.SaleProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SalePropertyDTO {
    private Long id;
    private String name;
    private Long parentId;
    private Long categoryId;
    private List<SaleProperty> properties;

    public SalePropertyDTO() {
        this.properties = new ArrayList<>();
    }
}
