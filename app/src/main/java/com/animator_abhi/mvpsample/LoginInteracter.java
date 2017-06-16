package com.animator_abhi.mvpsample;

/**
 * Created by ANIMATOR ABHI on 15/06/2017.
 */

public interface LoginInteracter {
    interface  onLoginFinishListener{
        void onUserNameError();
        void onPasswordError();
        void onSuccess();
    }

    void login(String username, String password, onLoginFinishListener listener);
}
