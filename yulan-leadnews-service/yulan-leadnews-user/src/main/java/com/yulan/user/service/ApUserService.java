package com.yulan.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yulan.model.common.dtos.ResponseResult;
import com.yulan.model.user.dtos.LoginDto;
import com.yulan.model.user.pojos.ApUser;

public interface ApUserService extends IService<ApUser> {
    /**
     * app端登录功能
     * @param dto
     * @return
     */
    public ResponseResult login(LoginDto dto);
}
