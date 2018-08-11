package haierhome.krund.cn.daggertworetrofitrxjavamvp.daggermvp.di;

import dagger.Module;
import dagger.Provides;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.daggermvp.view.LoginView;

/**
 * Created by Administrator on 2018/8/11.
 */
@Module
public class LoginModule {

    private LoginView loginView;

    public LoginModule(LoginView loginView) {
        this.loginView = loginView;
    }

    @Provides
    public LoginView provideLoginView() {
        return this.loginView;
    }


}
