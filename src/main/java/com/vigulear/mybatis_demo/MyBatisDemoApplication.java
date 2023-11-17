package com.vigulear.mybatis_demo;

import com.vigulear.mybatis_demo.model.User;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(User.class)
@MapperScan("com.vigulear.mybatis_demo.mapper")
@SpringBootApplication
public class MyBatisDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(MyBatisDemoApplication.class, args);
  }
}
