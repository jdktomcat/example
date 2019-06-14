package com.jdktomcat.mybatis.example;

import com.jdktomcat.mybatis.example.entry.ApiDownImeiRecord;
import com.jdktomcat.mybatis.example.entry.Blog;
import com.jdktomcat.mybatis.example.mapper.ApiDownImeiMapper;
import com.jdktomcat.mybatis.example.mapper.BlogMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 类描述：测试MyBatis类
 *
 * @author 汤旗
 * @date 2019-06-14 14:43
 */
public class MyBatisExample {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        try {
            BlogMapper blogMapper1 = sqlSession1.getMapper(BlogMapper.class);
            BlogMapper blogMapper2 = sqlSession2.getMapper(BlogMapper.class);
            Blog blog1 = blogMapper1.selectBlog(1);
//            ApiDownImeiMapper apiDownImeiMapper = sqlSession.getMapper(ApiDownImeiMapper.class);
//            List<ApiDownImeiRecord> dataList = apiDownImeiMapper.queryPage(0,1000);
            System.out.println(blog1.getName());
            sqlSession1.commit();
            Blog blog2 = blogMapper2.selectBlog(1);
            System.out.println(blog2.getName());
        } finally {
            sqlSession1.close();
            sqlSession2.close();
        }
    }
}
