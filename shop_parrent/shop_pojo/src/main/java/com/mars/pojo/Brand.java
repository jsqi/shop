package com.mars.pojo;

import java.io.Serializable;

/**
 * 品牌
 */
public class Brand implements Serializable {

    private long id;

    private String name;

    private String firstChar;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }
}
