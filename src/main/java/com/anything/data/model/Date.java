package com.anything.data.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Setter
@Getter
public class Date {
    private String id;
    private String day;
    private String month;
    private String year;
}
