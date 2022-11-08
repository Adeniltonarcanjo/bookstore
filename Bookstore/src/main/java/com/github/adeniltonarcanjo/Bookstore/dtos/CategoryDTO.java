package com.github.adeniltonarcanjo.Bookstore.dtos;

import com.github.adeniltonarcanjo.Bookstore.domain.Category;

import java.io.Serializable;

public class CategoryDTO implements Serializable {

    private static final long serialVersionID = 1L;

    private Integer id;
    private String name;
    private String description;

    public CategoryDTO() {
        super();
    }

    public CategoryDTO(Category obj) {
        this.id = obj.getId();
        this.name = obj.getName();
        this.description = obj.getDescription();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}