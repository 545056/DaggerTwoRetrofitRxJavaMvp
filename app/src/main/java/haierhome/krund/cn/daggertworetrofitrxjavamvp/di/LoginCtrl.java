package haierhome.krund.cn.daggertworetrofitrxjavamvp.di;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.business.LoginService;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.business.LoginStore;

/**
 * 1写需要实例化的对象的类
 */

public class LoginCtrl {

    //登录本地保存逻辑
    private LoginStore loginStore;
    //远程登录逻辑
    private LoginService loginService;

    public LoginCtrl(LoginStore loginStore, LoginService loginService) {
        this.loginStore = loginStore;
        this.loginService = loginService;
    }

    public void login(String username, String password) {
        this.loginStore.loginSave(username, password);
        this.loginService.logining(username, password);
    }
}
