package com.yulan.behavior.service.impl;

import com.alibaba.fastjson.JSON;
import com.yulan.behavior.service.ApUnlikesBehaviorService;
import com.yulan.common.redis.CacheService;
import com.yulan.model.behavior.dtos.UnLikesBehaviorDto;
import com.yulan.model.common.dtos.ResponseResult;
import com.yulan.model.common.enums.AppHttpCodeEnum;
import com.yulan.model.user.pojos.ApUser;
import com.yulan.utils.thread.AppThreadLocalUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * APP不喜欢行为表 服务实现类
 * </p>
 *
 * @author itheima
 */
@Slf4j
@Service
public class ApUnlikesBehaviorServiceImpl implements ApUnlikesBehaviorService {

    @Autowired
    private CacheService cacheService;

    @Override
    public ResponseResult unLike(UnLikesBehaviorDto dto) {

        if(dto.getArticleId() == null){
            return ResponseResult.errorResult(AppHttpCodeEnum.PARAM_INVALID);
        }

        ApUser user = AppThreadLocalUtil.getUser();
        if(user == null){
            return ResponseResult.errorResult(AppHttpCodeEnum.NEED_LOGIN);
        }

        if(dto.getType()==0){
            log.info("保存当前key:{} ,{}, {}", dto.getArticleId(), user.getId(), dto);
            cacheService.hPut("UNLIKE-BEHAVIOR-"+dto.getArticleId().toString(),user.getId().toString(), JSON.toJSONString(dto));
        }else {
            log.info("删除当前key:{} ,{}, {}", dto.getArticleId(), user.getId(), dto);
            cacheService.hDelete("UNLIKE-BEHAVIOR-"+dto.getArticleId().toString(),user.getId().toString());
        }

        return ResponseResult.okResult(AppHttpCodeEnum.SUCCESS);
    }
}