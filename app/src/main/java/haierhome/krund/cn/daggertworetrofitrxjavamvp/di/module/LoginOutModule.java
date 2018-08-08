package haierhome.krund.cn.daggertworetrofitrxjavamvp.di.module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.business.loginout.LoginOutService;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.business.loginout.LoginOutStore;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.di.LoginOutCtrl;

/**
 * Created by Administrator on 2018/8/8.
 */

@Module
public class LoginOutModule {

    private Context context;

    public LoginOutModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context  provideContext(){
        return this.context;
    }

    @Provides
    public LoginOutCtrl provideLoginoutControl(LoginOutStore loginOutStore, LoginOutService loginOutService){
        return new LoginOutCtrl(loginOutService,loginOutStore);
    }
}
