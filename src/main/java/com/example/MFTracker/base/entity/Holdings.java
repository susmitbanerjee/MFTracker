package com.example.MFTracker.base.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Holdings {
    private String name;
    private float assets;
    private String instrument;
    private String sector;
    private double value;
}
