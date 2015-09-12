package cn.xxx.service;

import cn.xxx.listener.CallbackListener;

/**
 * Created with IntelliJ IDEA.
 * User: baowp
 * Date: 11/13/13
 * Time: 5:21 PM
 * To change this template use File | Settings | File Templates.
 */
public interface CallbackService {


    Object addListener(String key, CallbackListener listener);
}
