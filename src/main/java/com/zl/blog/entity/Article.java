package com.zl.blog.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author zheng
 * @className Article
 * @Description TODO
 * @Date 2019/11/10
 * @Version 1.0
 **/
@Data
public class Article {
    private Long id;
    private String title;
    private String content;
    private String cover;
    private Integer diamond;
    private String nickname;
    private Integer comments;
    private Integer likes;
    private LocalDateTime publishTime;
}
