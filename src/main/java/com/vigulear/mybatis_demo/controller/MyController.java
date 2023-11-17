package com.vigulear.mybatis_demo.controller;

import com.vigulear.mybatis_demo.mapper.UserMapper;
import com.vigulear.mybatis_demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Constantin Vigulear
 */
@RestController
@RequestMapping("/rest/users")
public class MyController {

  private final UserMapper userMapper;

  public MyController(UserMapper userMapper) {
    this.userMapper = userMapper;
  }

  @GetMapping("/all")
  public List<User> getAll() {
    return userMapper.findAll();
  }

  @PostMapping
  public User addNewUser(@RequestBody User user) {
    userMapper.save(user);
    return user;
  }

  @PutMapping()
  private List<User> updateUsers(@RequestBody User user) {
    userMapper.update(user);

    return userMapper.findAll();
  }

  @DeleteMapping()
  private User deleteUser(@RequestBody User user) {
    userMapper.delete(user);

    return user;
  }
}
