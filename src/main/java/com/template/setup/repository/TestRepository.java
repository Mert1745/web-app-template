package com.template.setup.repository;

import com.template.setup.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Long> {
    List<TestEntity> findByFirstName(String firstName);
}
