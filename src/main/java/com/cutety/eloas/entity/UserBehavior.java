package com.cutety.eloas.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.sql.Date;

/**
 * Description:用户行为
 * Created by cutety on 2020/5/28,21:14.
 **/
@Entity
@Data
public class UserBehavior {
    @Id
    private Integer id;//id
    private String behaviorType;//用户行为类型
    private BigInteger sum;//总和
    private Date dateMonth;//时间
    private String dateTime;//时间段
}
