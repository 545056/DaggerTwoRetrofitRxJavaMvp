package haierhome.krund.cn.daggertworetrofitrxjavamvp.di.component;

import dagger.Component;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.MainActivity;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.di.module.LoginModule;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.di.module.LoginOutModule;


/**
 * 2写组件接口 接口的方法参数 调用时必须对应
 */
@Component(modules = {LoginModule.class, LoginOutModule.class})
public interface LoginComponent {

    void inject(MainActivity mainActivity);

}
