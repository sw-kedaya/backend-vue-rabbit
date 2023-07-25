package com.cc.entire;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.List;

@Data
public class Category {
    private Long id;
    private String name;
    private String picture;
    private Long parentId;
    private String parentName;
    private String saleInfo;
    private Long layer;
    private Long brandId;
}
