package com.yulan.behavior.service;

import com.yulan.model.behavior.dtos.LikesBehaviorDto;
import com.yulan.model.common.dtos.ResponseResult;

public interface ApLikesBehaviorService {

    /**
     * 存储喜欢数据
     * @param dto
     * @return
     */
    public ResponseResult like(LikesBehaviorDto dto);
}
