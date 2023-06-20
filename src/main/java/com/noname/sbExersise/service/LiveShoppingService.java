package com.noname.sbExersise.service;

import com.noname.sbExersise.repository.LiveShoppingRepository;
import com.noname.sbExersise.repository.entity.LiveShoppingItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiveShoppingService {
    private final LiveShoppingRepository repository;

    @Autowired
    public LiveShoppingService(LiveShoppingRepository repository)
    {
        this.repository = repository;
    }

    public List<LiveShoppingItem> getTest()
    {
        return repository.getAllTests();
    }
}
