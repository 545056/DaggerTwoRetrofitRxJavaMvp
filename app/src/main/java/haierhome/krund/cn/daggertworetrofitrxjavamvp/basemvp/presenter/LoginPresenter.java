package haierhome.krund.cn.daggertworetrofitrxjavamvp.basemvp.presenter;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.basemvp.model.Iloginmodel;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.basemvp.model.LoginModel;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.basemvp.view.IloginView;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.basemvp.view.LoginView;

/**
 * Presenter中处理业务逻辑 供activity调用;
 */

public class LoginPresenter implements ILoginPresenter, Iloginmodel, IloginView {


    private Iloginmodel loginModel;
    private IloginView loginView;

    public LoginPresenter(LoginView activity) {

        this.loginView = activity;
        this.loginModel = new LoginModel();
    }

    @Override
    public void logining(String username, String password) {
        this.loginModel.logining(username, password);
    }

    @Override
    public void setIloginStateListener(Iloginmodel.IloginState iloginState) {
        this.loginModel.setIloginStateListener(iloginState);
    }

    @Override
    public void clearIloginStateListener() {
        this.loginModel.clearIloginStateListener();
    }

    @Override
    public void destroy() {
        this.loginModel.destroy();
    }

    @Override
    public void showToast(String msg) {
        this.loginView.showToast(msg);
    }

    @Override
    public void showProgressdialog() {
        this.loginView.showProgressdialog();
    }

    @Override
    public void dismissProgressdialog() {
        this.loginView.dismissProgressdialog();
    }

    @Override
    public void clickLoginBtn() {
        this.loginView.clickLoginBtn();
    }
}
