package com.cutety.eloas.entity;

import lombok.Data;
import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
public class UserRetained {
    @Id
    private Date firstday;
    private Integer newUser;
    private String byDay1;
    private String byDay2;
    private String byDay3;
    private String byDay4;
    private String byDay5;
    private String byDay6;
    private String byDay7;
    private String byDay14;
    private String byDay30;
}
