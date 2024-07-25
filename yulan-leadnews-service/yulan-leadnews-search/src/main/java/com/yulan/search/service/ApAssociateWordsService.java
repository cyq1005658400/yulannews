package com.yulan.search.service;

import com.yulan.model.common.dtos.ResponseResult;
import com.yulan.model.search.dtos.UserSearchDto;

public interface ApAssociateWordsService {

    /**
     * 搜索联想词
     * @param dto
     * @return
     */
    public ResponseResult search(UserSearchDto dto);
}
