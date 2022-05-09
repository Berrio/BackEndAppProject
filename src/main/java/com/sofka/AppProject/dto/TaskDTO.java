package com.sofka.AppProject.dto;

import lombok.Data;

@Data
public class TaskDTO {
    private Long id;

    private String task;

    private Boolean complete;

    private Long fkTasktId;
}
