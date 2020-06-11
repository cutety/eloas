package com.cutety.eloas.repository;

import com.cutety.eloas.entity.UserBehaviorResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface UserBehaviorResultRepository extends JpaRepository<UserBehaviorResult, Date> {

}
