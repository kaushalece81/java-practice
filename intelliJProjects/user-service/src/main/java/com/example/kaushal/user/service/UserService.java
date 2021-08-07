package com.example.kaushal.user.service;

import com.example.kaushal.user.entity.User;
import com.example.kaushal.user.repository.UserRepository;
import com.example.kaushal.user.vo.Department;
import com.example.kaushal.user.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("inside saveUser of UserService");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartmentByUserId(Long userId) {
        log.info("inside getUserWithDepartmentByUserId of UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Optional<User> userById = userRepository.findById(userId);
        User user= userById.isPresent() ?  userById.get(): null;
        Department department = restTemplate.getForObject("http://localhost:9001/departments/"+user.getDepartmentId(), Department.class);
        vo.setDepartment(department);
        vo.setUser(user);
        return vo;
    }
}
