package com.icycodes.SpringBootDemo.Repository;

import com.icycodes.SpringBootDemo.Models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface myRepository extends JpaRepository<Department, Long> {
}
