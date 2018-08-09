package haierhome.krund.cn.daggertworetrofitrxjavamvp.dagger.di;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.dagger.business.loginout.LoginOutService;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.dagger.business.loginout.LoginOutStore;

/**
 * Created by Administrator on 2018/8/8.
 */

public class LoginOutCtrl {

    private LoginOutService loginOutService;
    private LoginOutStore loginOutStore;


    public LoginOutCtrl(LoginOutService loginOutService, LoginOutStore loginOutStore) {
        this.loginOutService = loginOutService;
        this.loginOutStore = loginOutStore;
    }

    public void loginOut(String username,String password){

        this.loginOutStore.loginOutSave(username,password);
        this.loginOutService.loginOuting(username,password);
    }
}
