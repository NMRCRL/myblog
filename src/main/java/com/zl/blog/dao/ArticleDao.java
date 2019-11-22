package com.zl.blog.dao;

import com.zl.blog.entity.Article;


import java.sql.SQLException;
import java.util.List;

/**
 * @author zheng
 * @className ArticleDao
 * @Description TODO
 * @Date 2019/11/10
 * @Version 1.0
 **/
public interface ArticleDao {
    /**
     * 批量新增文章
     * @param articleList
     * @return
     * @throws SQLException
     */
  int [] batchInsert(List<Article> articleList)throws SQLException;

  List<Article> selectAll() throws SQLException;

}
