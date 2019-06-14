package com.jdktomcat.mybatis.example.mapper;

import com.jdktomcat.mybatis.example.entry.Blog;

/**
 * 接口描述：博客数据访问接口
 *
 * @author 汤旗
 * @date 2019-06-14 14:49
 */
public interface BlogMapper {
    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 博客信息
     */
    Blog selectBlog(int id);
}
