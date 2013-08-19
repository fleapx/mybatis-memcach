package com.livvy.appblog.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: GuoZheng
 * Date: 13-8-15
 * Time: 下午12:20
 * To change this template use File | Settings | File Templates.
 */
public class User implements Serializable {
    private long id;
    private String userLogin;
    private String userPass;
    private String userNicename;
    private String userEmail;
    private String userUrl;
    private Date userRegistered;
    private String userActivationKey;
    private int userStatus;
    private String displayName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserNicename() {
        return userNicename;
    }

    public void setUserNicename(String userNicename) {
        this.userNicename = userNicename;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public Date getUserRegistered() {
        return userRegistered;
    }

    public void setUserRegistered(Date userRegistered) {
        this.userRegistered = userRegistered;
    }

    public String getUserActivationKey() {
        return userActivationKey;
    }

    public void setUserActivationKey(String userActivationKey) {
        this.userActivationKey = userActivationKey;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
