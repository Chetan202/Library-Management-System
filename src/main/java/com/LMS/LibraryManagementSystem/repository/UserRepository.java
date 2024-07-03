package com.LMS.LibraryManagementSystem.repository;

import com.LMS.LibraryManagementSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}