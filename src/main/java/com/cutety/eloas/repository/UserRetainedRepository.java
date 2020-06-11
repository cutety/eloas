package com.cutety.eloas.repository;

import com.cutety.eloas.entity.UserRetained;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;

public interface UserRetainedRepository extends JpaRepository<UserRetained, Date> {
}
