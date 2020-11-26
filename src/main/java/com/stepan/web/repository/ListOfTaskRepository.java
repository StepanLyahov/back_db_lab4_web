package com.stepan.web.repository;

import com.stepan.web.entity.ListOfTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListOfTaskRepository extends JpaRepository<ListOfTask, Long> {
}
