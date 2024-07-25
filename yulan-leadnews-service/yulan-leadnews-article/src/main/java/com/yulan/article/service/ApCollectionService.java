package com.yulan.article.service;

import com.yulan.model.article.dtos.CollectionBehaviorDto;
import com.yulan.model.common.dtos.ResponseResult;

public interface ApCollectionService {

    /**
     * 收藏
     * @param dto
     * @return
     */
    public ResponseResult collection(CollectionBehaviorDto dto);
}
