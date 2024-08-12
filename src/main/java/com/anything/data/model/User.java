package com.anything.data.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Setter
@Getter
public class User {
    private String id;
    private String password;
    private String username;
}
