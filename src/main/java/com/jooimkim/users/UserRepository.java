package com.jooimkim.users;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jooimkim on 2019. 1. 12..
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
