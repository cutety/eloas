package com.cutety.eloas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cutety.eloas.entity.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;


/**
 * Description:
 * Created by cutety on 2020/5/28,20:03.
 **/
public interface FlowTrendRepository  extends JpaRepository<FlowTrend,Integer> {
    @Query(value = "SELECT f FROM FlowTrend f WHERE f.dateMonth = :date")
    List<FlowTrend> getAllAtDate(@Param("date") Date date);
    @Query(value = "SELECT new com.cutety.eloas.entity.FlowTrendAvg(avg(f.pv)  ,avg(f.uv) ,f.dateTime) FROM FlowTrend f WHERE f.dateMonth BETWEEN :startDate AND :endDate group by f.dateTime")
    List<FlowTrendAvg> getAllBetweenDates(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

}
