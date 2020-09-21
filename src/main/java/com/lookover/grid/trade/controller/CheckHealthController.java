package com.lookover.grid.trade.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 服务健康检查程序
 * @author lookover
 * @since jdk 1.8
 * @date 2020/09/21
 */

@RestController
@RequestMapping("/")
public class CheckHealthController {

    @GetMapping(value = "/checkHealth", name ="健康检查接口")
    public String checkHealth() {
        return "The project is very health";
    }
}
