package com.noname.sbExersise.repository;

import com.noname.sbExersise.repository.entity.LiveShoppingItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LiveShoppingRepository {
    @Autowired
    private LiveShoppingMapper mapper;
    public List<LiveShoppingItem> getAllTests(){
        return mapper.getAllTests();
    }

}
