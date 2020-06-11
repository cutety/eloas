package com.cutety.eloas.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Description:
 * Created by cutety on 2020/5/28,20:24.
 **/
@Entity
@Data
public class NewUserTrendByDay {
    @Id
    private Integer id;//id
    private Date dateMonth;//最早登陆时间
    private Integer newUser;
    private String newUserRate;
    private Integer oldUser;
    private String oldUserRate;
}
