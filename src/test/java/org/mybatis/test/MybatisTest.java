package org.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.entity.Blog;
import org.mybatis.utils.MyBatisUtil;
/**
 * mybatis≤‚ ‘
 * @author lijun
 *
 */
public class MybatisTest {

	public static void main(String[] args) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		Blog blog=sqlSession.selectOne("BlogMapper.selectBlog", 1);
		System.out.println("username="+blog.getUsername()+"  password="+blog.getPassword());

	}

}
