package com.animator_abhi.mvpsample;

import android.text.TextUtils;

/**
 * Created by ANIMATOR ABHI on 15/06/2017.
 */

public class LoginInteracterImpl implements LoginInteracter {
    @Override
    public void login(String username, String password, onLoginFinishListener listener) {

        boolean error=false;
        if(TextUtils.isEmpty(username)){
            listener.onUserNameError();
            error=true;
            return;
        }
        if(TextUtils.isEmpty(password)){
            listener.onPasswordError();
            error=true;
            return;
        }
        if (!error)
        {
            listener.onSuccess();}
    }
}
