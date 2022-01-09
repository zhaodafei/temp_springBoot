package com.example.fei.mapper;

import com.example.fei.domain.User;
import org.apache.ibatis.annotations.Select;

// 这一层常用名字 dao mapper
// 在入口文件中使用 @MapperScan("com.example.*.mapper") 扫描
// @Mapper
public interface UserMapper {
    // 查询一条数据
     User selectUser(long id);

     User selectUserTwo(long id);

     @Select("SELECT * FROM user WHERE id=#{id}")
     User selectUserThree(long id);

     User selectUserFour(User user);

     User selectUserFive(User user);
}
