package com.example.responsibility.handler;


import com.example.responsibility.entity.Request;

public  abstract class AbstractHandler {

    //责任链中的下一个对象
    private AbstractHandler nextHandler;

    /**
     * 责任链的下一个对象
     */
    public void setNextHandler(AbstractHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    /**
     * 具体参数拦截逻辑,给子类去实现
     */
    public void filter(Request request) {
        doFilter(request);
        if (getNextHandler() != null) {
            getNextHandler().filter(request);
        }
    }

    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

   abstract void doFilter(Request filterRequest);
}
