package com.msl.entity.book;

import java.io.Serializable;

/**
 * @author hxh
 * @date 2019-01-25 15:36
 */
public class Book implements Serializable {
    private String id;
    private String name;
    private String info;
    private boolean isBorrowed;
    public Book(String id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.isBorrowed = false;
    }

    public Book(String id, String name, String info, boolean isBorrowed) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.isBorrowed = isBorrowed;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
