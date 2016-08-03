package com.lzy.vo;

/**
 * Created by lvzhouyang on 16/8/3.
 */
public class ProductDetail {

    private Long id;
    private String sku;

    public ProductDetail(Long id, String sku) {
        this.id = id;
        this.sku = sku;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
