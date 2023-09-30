package com.template.setup.service;

import com.template.setup.entity.TestEntity;
import com.template.setup.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    private void saveData() {
        TestEntity testEntity = new TestEntity();
        testEntity.setFirstName("John");
        testEntity.setLastName("Doe");
        testRepository.save(testEntity);
    }

    public TestEntity getData() {
        this.saveData();
        return testRepository.findByFirstName("John").stream().findFirst().orElseThrow();
    }
}
