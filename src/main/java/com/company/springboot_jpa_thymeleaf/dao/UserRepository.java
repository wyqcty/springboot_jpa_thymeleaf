package com.company.springboot_jpa_thymeleaf.dao;

import com.company.springboot_jpa_thymeleaf.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
