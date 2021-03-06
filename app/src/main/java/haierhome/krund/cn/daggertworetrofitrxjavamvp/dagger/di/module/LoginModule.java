package haierhome.krund.cn.daggertworetrofitrxjavamvp.dagger.di.module;

import android.content.Context;
import android.util.Log;

import dagger.Module;
import dagger.Provides;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.dagger.annotation.One;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.dagger.annotation.Two;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.dagger.business.login.LoginService;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.dagger.business.login.LoginStore;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.dagger.di.LoginCtrl;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.dagger.di.LoginOutCtrl;


/**
 * 3写接口的module  提供实例化的对象
 */

@Module

public class LoginModule {

    private Context context;
    private LoginOutCtrl loginOutCtrl;


    public LoginModule(Context context) {
        this.context = context;
    }

    @Provides
    public LoginStore provideLoginStore() {
        return new LoginStore(context);
    }

    @Provides
    public LoginService provideLoginloginService() {
        return new LoginService();
    }

    @One
    @Provides
    public LoginCtrl provideLoginCtrlOne(LoginStore loginStore, LoginService loginService) {
        Log.i("@@","One");
        return new LoginCtrl(loginStore, loginService);
   }

    @Two
    @Provides
    public LoginCtrl provideLoginCtrlTwo(LoginStore loginStore, LoginService loginService) {
        Log.i("@@","Two");
        return new LoginCtrl(loginStore, loginService);
    }
}
