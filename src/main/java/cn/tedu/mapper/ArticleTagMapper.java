package cn.tedu.mapper;

import cn.tedu.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ArticleTagMapper {
    public int insert(Long[] tagsId, Long articleId);
}
