package com.animator_abhi.mvpsample;

/**
 * Created by ANIMATOR ABHI on 15/06/2017.
 */

public class LoginPresenterImp implements LoginPresenter,LoginInteracter.onLoginFinishListener {

    private LoginView  loginView;
    private LoginInteracter loginInteracter;

    public LoginPresenterImp(LoginView loginView)
    {this.loginView=loginView;
      this.loginInteracter=new LoginInteracterImpl();
    }
    @Override
    public void Destroy() {
        loginView=null;

    }

    @Override
    public void validateCredentials(String username, String password) {

        if (loginView!=null)
        {
            loginView.showProgress();
        }

        loginInteracter.login(username,password,this);
    }

    @Override
    public void onUserNameError() {
        if (loginView!=null)
        {
            loginView.showUserNameError();
            loginView.hideProgress();
        }

    }

    @Override
    public void onPasswordError() {

        if (loginView!=null)
        {
            loginView.showPasswordError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onSuccess() {
        if (loginView!=null)
        {
            loginView.navigateToHome();
        }

    }
}
