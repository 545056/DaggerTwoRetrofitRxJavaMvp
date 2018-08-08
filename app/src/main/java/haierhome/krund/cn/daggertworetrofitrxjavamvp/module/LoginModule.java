package haierhome.krund.cn.daggertworetrofitrxjavamvp.module;

import dagger.Module;
import dagger.Provides;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.dl.LoginCtrl;

/**
 * 3写接口的module  提供实例化的对象
 */

@Module
public class LoginModule {

    @Provides
    public LoginCtrl provideLoginCtrl(){
        return new LoginCtrl();
    }
}
