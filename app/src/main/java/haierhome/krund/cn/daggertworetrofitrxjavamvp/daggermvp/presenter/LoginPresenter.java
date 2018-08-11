package haierhome.krund.cn.daggertworetrofitrxjavamvp.daggermvp.presenter;


import android.content.Context;
import android.os.Handler;

import javax.inject.Inject;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.daggermvp.contract.ILoginContract;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.daggermvp.model.LoginModel;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.daggermvp.view.LoginView;


public class LoginPresenter extends BasePresenter<LoginView, LoginModel> {

    private Handler handler = new Handler();

    @Inject
    public LoginPresenter(LoginView view, LoginModel model) {
        super(view, model);
    }


    public void loginToWeb(final Context context, final String userName, String passWord) {

        model.loginToWeb(userName, passWord);
        model.setLoginStateListener(new ILoginContract.LoginStateListener() {
            @Override
            public void success() {

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        view.showToast("登录成功");
                        model.loginSave(context, userName, userName);
                    }
                });
            }

            @Override
            public void fail() {

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        view.showToast("登录失败");
                    }
                });

            }
        });
    }
}
