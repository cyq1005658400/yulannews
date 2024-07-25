package com.yulan.behavior.service;

import com.yulan.model.behavior.dtos.ReadBehaviorDto;
import com.yulan.model.common.dtos.ResponseResult;

public interface ApReadBehaviorService {

    /**
     * 保存阅读行为
     * @param dto
     * @return
     */
    public ResponseResult readBehavior(ReadBehaviorDto dto);
}
