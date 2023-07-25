package com.cc.entire;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class Brand {
    private Long id;
    private String name;
    private String nameEn;
    private String logo;
    private String picture;
    private String type;
    @TableField(value = "`desc`")
    private String desc;
    private String place;
}
