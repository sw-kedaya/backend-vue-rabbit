package com.cc.vo;

import lombok.Data;

@Data
public class RequestForSubCategory {
    private Long id;
    private Integer page;
    private Integer pageSize;
    private String sortField;
}
