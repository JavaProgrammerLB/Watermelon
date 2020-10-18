package com.yitianyigexiangfa.watermelon.entity;

public class LoginResponse {

   private boolean flag;

    public LoginResponse() {
    }

    public LoginResponse(boolean flag) {
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
