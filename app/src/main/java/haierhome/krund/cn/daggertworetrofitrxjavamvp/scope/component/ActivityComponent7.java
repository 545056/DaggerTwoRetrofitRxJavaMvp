package haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.component;

import dagger.Component;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.PreScope;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.activity.TargetActivity71;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.activity.TargetActivity72;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.module.ActivityModule7;


/**
 * Created by Administrator on 2018/8/8.
 */

@PreScope
@Component(modules = ActivityModule7.class,dependencies = AppComponent7.class)
public interface ActivityComponent7 {
    void inject(TargetActivity71 activity71);
    void inject(TargetActivity72 activity72);
}
