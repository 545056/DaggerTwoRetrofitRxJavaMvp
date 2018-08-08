package haierhome.krund.cn.daggertworetrofitrxjavamvp.component;

import dagger.Component;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.MainActivity;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.dl.LoginCtrl;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.module.LoginModule;

/**
 * 2写组件接口 接口的方法参数 调用时必须对应
 */
@Component(modules = LoginModule.class)
public interface LoginComponent {

    void inject(MainActivity mainActivity);
}
