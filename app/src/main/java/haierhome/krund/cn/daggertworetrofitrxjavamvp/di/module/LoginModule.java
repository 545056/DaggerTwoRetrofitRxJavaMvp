package haierhome.krund.cn.daggertworetrofitrxjavamvp.di.module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.business.LoginService;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.business.LoginStore;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.di.LoginCtrl;


/**
 * 3写接口的module  提供实例化的对象
 */

@Module
public class LoginModule {

    private Context context;


    public LoginModule(Context context) {
        this.context=context;
    }

    @Provides
    public Context provideContext(){
        return context;
    }

    @Provides
    public LoginCtrl provideLoginCtrl(LoginStore loginStore, LoginService loginService) {
        return new LoginCtrl(loginStore, loginService);
    }
}
