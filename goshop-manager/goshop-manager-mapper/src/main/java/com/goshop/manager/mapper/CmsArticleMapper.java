package com.goshop.manager.mapper;

import com.goshop.manager.pojo.CmsArticle;
import com.goshop.manager.pojo.CmsArticleWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsArticleMapper {
    int deleteByPrimaryKey(Long articleId);

    int insert(CmsArticleWithBLOBs record);

    int insertSelective(CmsArticleWithBLOBs record);

    CmsArticleWithBLOBs selectByPrimaryKey(Long articleId);

    int updateByPrimaryKeySelective(CmsArticleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CmsArticleWithBLOBs record);

    int updateByPrimaryKey(CmsArticle record);

    List<CmsArticle> findBaseByArticleState(@Param("articleState")Integer articleState);

    int updateByArticleCommendFlag(@Param("articleId")Long articleId, @Param("articleCommendFlag")Integer articleCommendFlag);

    int updateByArticleCommendImageFlag(@Param("articleId")Long articleId, @Param("articleCommendImageFlag")Integer articleCommendImageFlag);

    int updateByArticleAttitudeFlag(@Param("articleId")Long articleId, @Param("articleAttitudeFlag")Integer articleAttitudeFlag);

    int updateByArticleCommentFlag(@Param("articleId")Long articleId, @Param("articleCommentFlag")Integer articleCommentFlag);

    int updateByArticleSort(@Param("articleId")Long articleId, @Param("articleSort")Integer articleSort);

    int updateByArticleClick(@Param("articleId")Long articleId, @Param("articleClick")Integer articleClick);
}