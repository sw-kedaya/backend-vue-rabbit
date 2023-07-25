package com.cc.dto;

import com.cc.entire.Brand;
import com.cc.entire.Category;
import com.cc.entire.Goods;
import com.cc.entire.SaleProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CategoryDTO {
    private Long id;
    private String name;
    private String picture;
    private Long parentId;
    private String parentName;
    private String saleInfo;
    private List<CategoryDTO> children;
    private List<Goods> goods;
    private List<Category> categories;
    private Long brandId;
    private List<Brand> brands;
    private List<SalePropertyDTO> saleProperties;

    public CategoryDTO() {
        this.children = new ArrayList<>();
        this.goods = new ArrayList<>();
        this.categories = new ArrayList<>();
        this.brands = new ArrayList<>();
        this.saleProperties = new ArrayList<>();
    }
}
