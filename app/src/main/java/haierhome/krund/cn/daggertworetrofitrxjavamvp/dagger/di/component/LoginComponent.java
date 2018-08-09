package haierhome.krund.cn.daggertworetrofitrxjavamvp.dagger.di.component;

import dagger.Component;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.dagger.MainActivity;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.dagger.di.module.LoginModule;


/**
 * 2写组件接口 接口的方法参数 调用时必须对应
 */
@Component(modules = {LoginModule.class})
public interface LoginComponent {

    void inject(MainActivity mainActivity);

}
