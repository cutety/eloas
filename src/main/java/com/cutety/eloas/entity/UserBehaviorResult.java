package com.cutety.eloas.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Data
@Entity
public class UserBehaviorResult {
    private Integer pv;
    private Integer cart;
    private Integer fav;
    private Integer buy;
    @Id
    private Date dateMonth;

    public UserBehaviorResult() {
    }

    public UserBehaviorResult(Integer pv, Integer cart, Integer fav, Integer buy, Date dateMonth) {
        this.pv = pv;
        this.cart = cart;
        this.fav = fav;
        this.buy = buy;
        this.dateMonth = dateMonth;
    }
}
