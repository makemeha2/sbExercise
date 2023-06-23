package com.noname.sbExersise.service;

import com.noname.sbExersise.repository.LiveShoppingMapper;
import com.noname.sbExersise.repository.entity.LiveShoppingItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiveShoppingService {
    private final LiveShoppingMapper repository;

    @Autowired
    public LiveShoppingService(LiveShoppingMapper repository)
    {
        this.repository = repository;
    }

    public List<LiveShoppingItem> getList(Integer pageIndex, Integer pageSize, String searchText)
    {
        return repository.getList(pageIndex, pageSize, searchText);
    }
}
