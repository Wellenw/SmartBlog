package cn.tedu.mapper;

import cn.tedu.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {

    public int insert(Article article);
}
