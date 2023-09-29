package com.template.setup.resource;

import com.template.setup.resource.builder.ResponseBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestResource {

    @GetMapping("/test")
    public ResponseBuilder<String> searchByNameAndCategoryName() {
        return ResponseBuilder.<String>getInstance().status(200).data("Hello World!");
    }
}
