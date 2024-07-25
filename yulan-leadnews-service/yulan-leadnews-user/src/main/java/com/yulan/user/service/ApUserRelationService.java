package com.yulan.user.service;


import com.yulan.model.common.dtos.ResponseResult;
import com.yulan.model.user.dtos.UserRelationDto;



public interface ApUserRelationService {
    /**
     * 用户关注/取消关注
     * @param dto
     * @return
     */
    public ResponseResult follow(UserRelationDto dto);
}