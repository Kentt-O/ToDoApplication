package com.anything.dtos.request;

import com.anything.data.model.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NewTaskRequest {
    private String message;
    private Date date;
}
