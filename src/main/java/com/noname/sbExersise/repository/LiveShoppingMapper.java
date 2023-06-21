package com.noname.sbExersise.repository;

import com.noname.sbExersise.repository.entity.LiveShoppingItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LiveShoppingMapper {
    List<LiveShoppingItem> getList(
            @Param("pageIndex") Integer pageIndex,
            @Param("pageSize") Integer pageSize,
            @Param("searchText") String searchText);

    String getTest(
            @Param("pageIndex") Integer pageIndex,
            @Param("pageSize") Integer pageSize,
            @Param("searchText") String searchText);
}
