package com.cc.dto;

import com.cc.entire.Category;
import com.cc.entire.Goods;
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
    private String categories;
    private String saleInfo;
    private List<CategoryDTO> children = new ArrayList<>();
    private List<Goods> goods = new ArrayList<>();
}
