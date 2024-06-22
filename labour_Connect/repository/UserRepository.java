package com.labours.labour_Connect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long>{

    static org.apache.catalina.User save(org.apache.catalina.User user) {
        return user;
    }
}
