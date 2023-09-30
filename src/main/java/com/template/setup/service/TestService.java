package com.template.setup.service;

import com.template.setup.entity.TestEntity;
import com.template.setup.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    private TestEntity saveData() {
        TestEntity testEntity = new TestEntity();
        testEntity.setFirstName("John");
        testEntity.setLastName("Doe");
        return testRepository.save(testEntity);
    }

    public TestEntity getData() {
        return saveData();
    }
}
