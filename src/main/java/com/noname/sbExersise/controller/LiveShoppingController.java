package com.noname.sbExersise.controller;

import com.noname.sbExersise.repository.entity.LiveShoppingItem;
import com.noname.sbExersise.service.LiveShoppingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Slf4j
@Controller
public class LiveShoppingController {
    @Autowired
    private final LiveShoppingService service;

    public LiveShoppingController(LiveShoppingService service) {
        this.service = service;
    }

    @GetMapping("/live")
    public String index(Model model)
    {
        List<LiveShoppingItem> list = service.getTest();

        list.stream().forEach(item -> { log.info(item.getTitle()); });

        model.addAttribute("test", "test 문자열 입니다.");
        return "live";
    }
}