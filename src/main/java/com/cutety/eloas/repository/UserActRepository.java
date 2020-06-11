package com.cutety.eloas.repository;

import com.cutety.eloas.entity.FlowTrend;
import com.cutety.eloas.entity.FlowTrendAvg;
import com.cutety.eloas.entity.UserAct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface UserActRepository extends JpaRepository<UserAct,String> {
    @Query(value = "SELECT f FROM UserAct f WHERE f.dateMonth = :date")
    UserAct getAllAtDate(@Param("date") String date);
    @Query(value = "SELECT u FROM UserAct u WHERE u.dateMonth BETWEEN :startDate AND :endDate")
    List<UserAct> getAllBetweenDates(@Param("startDate") String startDate, @Param("endDate") String endDate);
}
