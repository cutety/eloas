package com.cutety.eloas.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class UserValue {
    @Id
    private Integer id;
    private Integer valueUsers;
    private Integer developUsers;
    private Integer keepUsers;
    private Integer retainUsers;
}
