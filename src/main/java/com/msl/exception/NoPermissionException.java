package com.msl.exception;

/**
 * @author hxh
 * @date 2019-01-25 15:54
 */
public class NoPermissionException extends Exception {
    public NoPermissionException(){
        super("no enough permission");
    }
}
