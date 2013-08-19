package com.livvy.appblog.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: GuoZheng
 * Date: 13-8-15
 * Time: 下午12:27
 * To change this template use File | Settings | File Templates.
 */
public class Post implements Serializable {
    private long ID;
    private long postAuthor;
    private Date postDate;
    private Date postDateGmt;
    private String postContent;
    private String postTitle;

}
