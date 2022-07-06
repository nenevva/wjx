package com.paiyuan.wjx.service;

import com.alibaba.fastjson2.JSON;
import com.paiyuan.wjx.entity.Item;
import com.paiyuan.wjx.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListenerService {

    @Autowired
    ItemMapper itemMapper;

    public void jsonProcess(String json) {
        Item item = JSON.parseObject(json, Item.class);
        int ret = itemMapper.itemAdd(item);
        if (ret == 1) {
            System.out.println("[Info] ListenerService: Database writing succeeded!");
        } else {
            System.out.println("[ERROR] ListenerService: Database writing failed.");
        }
    }
}
