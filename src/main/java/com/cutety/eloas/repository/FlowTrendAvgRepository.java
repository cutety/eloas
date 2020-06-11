package com.cutety.eloas.repository;

import com.cutety.eloas.entity.FlowTrendAvg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface FlowTrendAvgRepository extends JpaRepository<FlowTrendAvg,String> {
    @Query(value = "SELECT new com.cutety.eloas.entity.FlowTrendAvg(avg(f.pv)  ,avg(f.uv) ,f.dateTime) FROM FlowTrend f WHERE f.dateMonth BETWEEN :startDate AND :endDate group by f.dateTime")
    List<FlowTrendAvg> getAllBetweenDates(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
