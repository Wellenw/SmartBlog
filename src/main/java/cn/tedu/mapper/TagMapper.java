package cn.tedu.mapper;

import cn.tedu.pojo.Tags;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TagMapper {


    public int insert(Tags tags);
}
