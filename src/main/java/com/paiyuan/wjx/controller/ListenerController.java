package com.paiyuan.wjx.controller;

import com.paiyuan.wjx.service.ListenerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ListenerController {

    private final ListenerService listenerService;

    @RequestMapping("/wjx")
    public void getJson(@RequestBody String s) {
        System.out.println("[info] ListenerController: request got.");
        listenerService.jsonProcess(s);
    }
}
