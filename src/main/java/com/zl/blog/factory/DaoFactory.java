package com.zl.blog.factory;

import com.zl.blog.dao.ArticleDao;
import com.zl.blog.dao.UserDao;
import com.zl.blog.dao.impl.ArticleDaoImpl;
import com.zl.blog.dao.impl.UserDaoImpl;

public class DaoFactory {
    public static UserDao getUserDaoInstance(){
        return new UserDaoImpl();
    }


    public static ArticleDao getArticleDaoInstance() {
        return new ArticleDaoImpl();
    }
}
