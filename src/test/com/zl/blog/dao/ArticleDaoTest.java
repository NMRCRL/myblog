package com.zl.blog.dao;


import com.zl.blog.factory.DaoFactory;
import com.zl.blog.util.JSoupSpider;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;

public class ArticleDaoTest {
    private static Logger logger =LoggerFactory.getLogger(ArticleDaoTest.class);
    private ArticleDao articleDao = DaoFactory.getArticleDaoInstance();
    @Test
    public void batchInsert() {
        try {
            int[] result = articleDao.batchInsert(JSoupSpider.getArticle());
            if(result.length!=0){
                logger.info("成功新增"+result.length+"个用户");
            }
        } catch (SQLException e) {
           logger.error("异常");
        }
    }
}