package cn.tedu.mapper;

import cn.tedu.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.autoconfigure.security.SecurityProperties;


import java.util.Date;
import java.util.List;

@Mapper
public interface UserMapper {

    public List<Users> selectUserByTime(String beginTime,String endTime);

    int update(Users user);

    int validById(Integer[] ids, Integer status);
}
