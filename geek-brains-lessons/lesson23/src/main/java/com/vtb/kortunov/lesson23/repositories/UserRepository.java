package com.vtb.kortunov.lesson23.repositories;

import com.vtb.kortunov.lesson23.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
