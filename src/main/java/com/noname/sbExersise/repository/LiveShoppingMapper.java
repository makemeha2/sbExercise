package com.noname.sbExersise.repository;

import com.noname.sbExersise.repository.entity.LiveShoppingItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LiveShoppingMapper {
    List<LiveShoppingItem> getAllTests();
}
