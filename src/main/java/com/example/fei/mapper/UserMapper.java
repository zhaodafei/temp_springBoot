package com.example.fei.mapper;

import com.example.fei.domain.User;
import org.apache.ibatis.annotations.Mapper;

// 在入口文件中使用 @MapperScan("com.example.*.mapper") 扫描
// @Mapper
public interface UserMapper {
    // 查询一条数据
     User selectUser(long id);
}
