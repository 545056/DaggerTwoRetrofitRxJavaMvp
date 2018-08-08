package haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.component;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.app.App7;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.module.AppModule7;


/**
 * Created by Administrator on 2018/8/8.
 */

@Singleton
@Component(modules = {AppModule7.class})
public interface AppComponent7 {
    void inject(App7 app);

    //因为AppComponent会被dependencies，所以此处Module中提供的内容，我们需要在此处声明一下
    App7 getApp();
    Context getApplicationContext();
}