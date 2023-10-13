package cn.tedu;


import cn.tedu.mapper.ArticleMapper;
import cn.tedu.mapper.ArticleTagMapper;
import cn.tedu.mapper.UserMapper;
import cn.tedu.pojo.Article;
import cn.tedu.pojo.Users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class SmartBlogApplicationTests {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ArticleMapper articleMapper;
	@Autowired
	private ArticleTagMapper articleTagMapper;
	@Test
	void contextLoads() {
		List<Users> users = userMapper.selectUserByTime(null,"2023-04-16 23:59:59");
		for(Users user:users){
			System.out.println(user);
		}
	}
	@Test
	public void validById() {
		Integer[] ids = new Integer[]{3, 4};
		int rows = userMapper.validById(ids, 0);
		System.out.println(rows > 0 ? "修改成功" + rows + "条!" : "修改失败!");
	}

	@Test
	public void insert() {
		Article article = new Article();
		article.setTitle("Spring Boot");
		article.setContent("Very Good");
		article.setType("1");
		article.setStatus("1");
		article.setUserId(1L);
		article.setCreatedTime(new Date());
		article.setModifiedTime(new Date());
		//将文章自身信息写入到数据库
		int rows = articleMapper.insert(article);
		System.out.println(rows > 0 ? "新增文章成功!" : "新增文章失败!");
		//将文章和标签关系数据写入到数据
		rows = articleTagMapper.insert(new Long[]{1L, 3L},article.getId());
		System.out.println(rows > 0 ? "新增文章标签关系成功!" : "新增文章标签失败!");
	}

}
