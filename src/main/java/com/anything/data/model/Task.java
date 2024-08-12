package com.anything.data.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Setter
@Getter
public class Task {
    private String id;
    private String message;
    private Date dateDue;
    private boolean isComplete;
    private boolean isDeleted;

}
