package com.cutety.eloas.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Data
public class Category {
    @Id
    private Integer id;
    private String categoryId;
    private Date dateMonth;
    private Integer pv;
    private Integer cart;
    private Integer fav;
    private Integer buy;
}
