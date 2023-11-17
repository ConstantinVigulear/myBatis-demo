package com.vigulear.mybatis_demo.mapper;

import com.vigulear.mybatis_demo.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Constantin Vigulear
 * @date 16-Nov-23 18:03
 */
@Mapper
public interface UserMapper {

  @Select("SELECT * FROM USERS")
  List<User> findAll();

  @Insert("INSERT INTO USERS(id, name, salary) VALUES (#{id}, #{name}, #{salary})")
  @Options(useGeneratedKeys = true, keyProperty = "id")
  void save(User user);

  @Update("update users set salary=#{salary} where name=#{name}")
  void update(User user);

  @Delete("delete from users where name=#{name}")
  void delete(User user);
}
