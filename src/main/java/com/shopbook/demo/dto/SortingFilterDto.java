package com.shopbook.demo.dto;

public class SortingFilterDto {
    String filter;
    String sort;

    public SortingFilterDto() {
    }

    public SortingFilterDto(String filter, String sort) {
        this.filter = filter;
        this.sort = sort;
    }

    public String getFilter() {
        return filter;
    }

    public String getSort() {
        return sort;
    }
}
