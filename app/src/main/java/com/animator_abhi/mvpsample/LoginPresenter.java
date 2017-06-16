package com.animator_abhi.mvpsample;

/**
 * Created by ANIMATOR ABHI on 15/06/2017.
 */

public interface LoginPresenter {
    void Destroy();
    void validateCredentials(String username,String password);
}
