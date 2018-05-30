package com.jy.common.ajax;

import java.io.*;

public class AjaxRes implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int res;
    private String resMsg;
    private Object obj;
    
    public AjaxRes() {
        this.res = 0;
    }
    
    public int getRes() {
        return this.res;
    }
    
    public void setRes(final int res) {
        this.res = res;
    }
    
    public String getResMsg() {
        return this.resMsg;
    }
    
    public void setResMsg(final String resMsg) {
        this.resMsg = resMsg;
    }
    
    public Object getObj() {
        return this.obj;
    }
    
    public void setObj(final Object obj) {
        this.obj = obj;
    }
    
    public boolean setNoAuth(final boolean auth) {
        if (!auth) {
            this.obj = null;
            this.setRes(100);
            this.setResMsg("\u5f53\u524d\u89d2\u8272\u6ca1\u6709\u6743\u9650");
        }
        return auth;
    }
    
    public void setSucceed(final Object obj, final String resMsg) {
        this.setResMsg(resMsg);
        this.setSucceed(obj);
    }
    
    public void setSucceed(final Object obj) {
        this.obj = obj;
        this.setRes(1);
    }
    
    public void setSucceedMsg(final String resMsg) {
        this.setRes(1);
        this.setResMsg(resMsg);
    }
    
    public void setFailMsg(final String resMsg) {
        this.obj = null;
        this.setRes(0);
        this.setResMsg(resMsg);
    }
    
    @Override
    public String toString() {
        return "AjaxRes [res=" + this.res + ", resMsg=" + this.resMsg + ", obj=" + this.obj + "]";
    }
}
