package haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.module;

import dagger.Module;
import dagger.Provides;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.DependencyPresenter7;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.PreScope;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.app.App7;

/**
 * Created by Administrator on 2018/8/8.
 */

@Module
public class ActivityModule7 {

    @Provides
    @PreScope
    public DependencyPresenter7 getDependencyPresenter(App7 app){
        return new DependencyPresenter7(app);
    }
}






