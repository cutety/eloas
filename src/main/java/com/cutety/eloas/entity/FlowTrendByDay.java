package com.cutety.eloas.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Description:
 * Created by cutety on 2020/5/28,20:51.
 **/
@Entity
@Data
public class FlowTrendByDay {
    @Id
    private Integer id;//id
    private Integer pv;//点击量
    private Integer uv;//独立用户
    private Float avgPv;//每个用户平均点击量
    private Integer newUser;//新用户数
    private String newUserRate;//新用户比例
    private String BounceRate;//跳失率
    private Date dateMonth;//日期
}
