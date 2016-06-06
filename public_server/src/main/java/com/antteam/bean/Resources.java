package com.antteam.bean;

import lombok.Data;

@Data 
public class Resources {
    private Integer id;

    private String name;

    private Integer parentId;

    private String resKey;

    private String type;

    private String resUrl;

    private Integer level;

    private String icon;

    private Integer ishide;

    private String description;
}