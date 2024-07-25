package com.yulan.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yulan.model.common.dtos.ResponseResult;
import com.yulan.model.wemedia.dtos.WmLoginDto;
import com.yulan.model.wemedia.pojos.WmUser;

public interface WmUserService extends IService<WmUser> {

    /**
     * 自媒体端登录
     * @param dto
     * @return
     */
    public ResponseResult login(WmLoginDto dto);

}