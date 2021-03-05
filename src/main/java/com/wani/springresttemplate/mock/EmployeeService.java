package com.wani.springresttemplate.mock;

import com.wani.springresttemplate.restemplate.web.model.Employee;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@RequiredArgsConstructor
public class EmployeeService {
/*
    private static final String EMP_URL_PREFIX = "http://localhost:8080/employee";
    private static final String URL_SEP = "/";

    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    private final RestTemplate restTemplate;

    public Employee getEmployee(String id) {
        ResponseEntity<Employee> response = restTemplate.getForEntity("http://localhost:8080/employee" + id, Employee.class);
        return response.getStatusCode() == HttpStatus.OK ? response.getBody() : null;
    }*/
}
