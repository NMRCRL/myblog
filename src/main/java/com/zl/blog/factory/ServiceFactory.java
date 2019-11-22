package com.zl.blog.factory;

import com.zl.blog.service.ArticleService;
import com.zl.blog.service.UserService;
import com.zl.blog.service.impl.ArticleServiceImpl;
import com.zl.blog.service.impl.UserServiceImpl;

public class ServiceFactory {
    public static UserService getUserServiceInstance() {
        return new UserServiceImpl();
    }

    public static ArticleService getArticleServiceInstance() {
        return  new ArticleServiceImpl();
    }
}
