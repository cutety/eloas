package com.cutety.eloas.repository;
import com.cutety.eloas.entity.UserActResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.sql.Date;
import java.util.List;

public interface UserActResultRepository extends JpaRepository<UserActResult, Date> {
    @Query(nativeQuery = true,value="SELECT date_month,dau,wau,mau,dau/mau as 'dau_div_mau' from user_act WHERE date_month BETWEEN ?1 and ?2")
    List<UserActResult> getAllBetweenDates(String sDate,String eDate);

}
