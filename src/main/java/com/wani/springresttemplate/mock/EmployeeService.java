package com.wani.springresttemplate.mock;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@RequiredArgsConstructor
public class EmployeeService {

    private static final String EMP_URL_PREFIX = "http://localhost:8080/employee";
    private static final String URL_SEP = "/";

    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    private final RestTemplate restTemplate;

}
