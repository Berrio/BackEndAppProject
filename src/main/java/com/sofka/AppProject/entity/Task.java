package com.sofka.AppProject.entity;

import javax.persistence.*;
import lombok.Data;


@Entity(name="Task")
@Table(name="task")
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String task;

    private Long fkTasktId;
}
