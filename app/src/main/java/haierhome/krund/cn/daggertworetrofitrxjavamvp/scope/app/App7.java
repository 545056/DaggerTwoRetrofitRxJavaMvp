package haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.app;

import android.app.Application;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.component.ActivityComponent7;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.component.AppComponent7;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.component.DaggerActivityComponent7;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.component.DaggerAppComponent7;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.module.AppModule7;

/**
 * Created by Administrator on 2018/8/8.
 */

public class App7 extends Application {

    private AppComponent7 mAppComponent7;
    private ActivityComponent7 mActivityComponent7;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent7 = DaggerAppComponent7.builder().appModule7(new AppModule7(this)).build();
        mAppComponent7.inject(this);
        mActivityComponent7 = DaggerActivityComponent7.builder().appComponent7(mAppComponent7).build();
    }

    public AppComponent7 getAppComponent7(){
        return mAppComponent7;
    }

    public ActivityComponent7 getActivityComponent7(){
        return mActivityComponent7;
    }
}
