package haierhome.krund.cn.daggertworetrofitrxjavamvp.daggermvp.di;

import dagger.Component;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.daggermvp.view.LoginView;

/**
 * Created by Administrator on 2018/8/11.
 */

@Component(modules = LoginModule.class)
public interface LoginComponent {

    void inject(LoginView loginView);
}
