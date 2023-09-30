package com.template.setup.resource;

import com.template.setup.entity.TestEntity;
import com.template.setup.resource.builder.ResponseBuilder;
import com.template.setup.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class TestResource {
    private final TestService testService;

    @GetMapping("/test")
    public ResponseBuilder<String> searchByNameAndCategoryName() {
        return ResponseBuilder.<String>getInstance().status(200).data("Hello World!");
    }

    @GetMapping("/database-test")
    public ResponseBuilder<String> saveAndGetData() {
        TestEntity savedData = testService.getData();
        return ResponseBuilder.<String>getInstance().status(200).data(savedData.getFirstName() + " " + savedData.getLastName());
    }
}
