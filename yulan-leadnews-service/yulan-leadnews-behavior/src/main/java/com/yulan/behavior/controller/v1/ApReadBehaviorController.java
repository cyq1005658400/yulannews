package com.yulan.behavior.controller.v1;

import com.yulan.behavior.service.ApReadBehaviorService;
import com.yulan.model.behavior.dtos.ReadBehaviorDto;
import com.yulan.model.common.dtos.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/read_behavior")
public class ApReadBehaviorController {

    @Autowired
    private ApReadBehaviorService apReadBehaviorService;

    @PostMapping
    public ResponseResult readBehavior(@RequestBody ReadBehaviorDto dto){
        return apReadBehaviorService.readBehavior(dto);
    }
}
