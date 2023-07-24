package com.example.memorydbtojpa.entity;

import lombok.Getter;
import lombok.Setter;


public abstract class Entity implements PrimaryKey{
    @Getter
    @Setter
    public Long id;

}
