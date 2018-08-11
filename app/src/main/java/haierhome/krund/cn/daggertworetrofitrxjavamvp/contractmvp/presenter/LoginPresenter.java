package haierhome.krund.cn.daggertworetrofitrxjavamvp.contractmvp.presenter;


import android.content.Context;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.contractmvp.contract.ILoginContract;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.contractmvp.model.LoginModel;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.contractmvp.view.LoginView;

/**
 * 10实现LoginpPresenter 因为此时presenter已经定位服务于
 * LoginView，LoginModel所以泛型确定
 */

public class LoginPresenter extends BasePresenter<LoginView, LoginModel> implements ILoginContract.ILoginModel, ILoginContract.ILoginView {

    public LoginPresenter(LoginView view, LoginModel model) {
        super(view, model);
    }

    @Override
    public void loginToWeb(String userName, String passWord) {
        setLoginStateListener(new ILoginContract.LoginStateListener() {
            @Override
            public void success() {
                showToast("登录成功");
            }

            @Override
            public void fail() {
                showToast("登录失败");
            }
        });
        model.loginToWeb(userName, passWord);
    }

    @Override
    public void loginSave(Context context, String userName, String password) {
        model.loginSave(context, userName, password);
    }

    @Override
    public void setLoginStateListener(ILoginContract.LoginStateListener loginStateListener) {
        model.setLoginStateListener(loginStateListener);
    }

    @Override
    public void clearLoginStateListener() {
        model.clearLoginStateListener();
    }

    @Override
    public void showToast(String msg) {
        view.showToast(msg);
    }

    @Override
    public String getUserName() {
        return view.getUserName();
    }

    @Override
    public String getPassWord() {
        return view.getPassWord();
    }

    @Override
    public void showLoginDialog() {
        view.showLoginDialog();
    }

    @Override
    public void dismissLoginDialog() {
        view.dismissLoginDialog();
    }
}
