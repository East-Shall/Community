package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {//相关接口并不需要去进行实现
    User selectById(int id);
    User selectByName(String name);
    User selectByEmail(String email);

    int insertUser(User user);
}
