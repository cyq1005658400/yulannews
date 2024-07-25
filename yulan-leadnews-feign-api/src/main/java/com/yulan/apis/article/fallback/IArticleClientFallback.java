package com.yulan.apis.article.fallback;

import com.yulan.apis.article.IArticleClient;
import com.yulan.model.article.dtos.ArticleDto;
import com.yulan.model.common.dtos.ResponseResult;
import com.yulan.model.common.enums.AppHttpCodeEnum;
import org.springframework.stereotype.Component;

@Component
public class IArticleClientFallback implements IArticleClient {
    @Override
    public ResponseResult saveArticle(ArticleDto dto) {
        return ResponseResult.errorResult(AppHttpCodeEnum.SERVER_ERROR,"获取数据失败");
    }
}
