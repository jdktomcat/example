package com.jdktomcat.mybatis.example.mapper;

import com.jdktomcat.mybatis.example.entry.ApiDownImeiRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 接口描述：下载IMEI数据访问接口
 *
 * @author 汤旗
 * @date 2019-06-14 17:51
 */
public interface ApiDownImeiMapper {
    /**
     * 分页查询
     *
     * @param startIndex 起始索引
     * @param pageSize   页大小
     * @return 列表
     */
    List<ApiDownImeiRecord> queryPage(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);
}
