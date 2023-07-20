package com.cc.entire;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class Goods {
    private Long id;
    private Long categoryId;
    private Long categoryPid;
    private String name;
    @TableField(value = "`desc`")
    private String desc;
    private Double price;
    private String picture;
    private String discount;
    private String orderNum;
}
