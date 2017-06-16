package com.animator_abhi.mvpsample;

/**
 * Created by ANIMATOR ABHI on 15/06/2017.
 */

public interface LoginView{
    void showProgress();
    void hideProgress();
    void showUserNameError();
    void showPasswordError();
    void navigateToHome();

}
