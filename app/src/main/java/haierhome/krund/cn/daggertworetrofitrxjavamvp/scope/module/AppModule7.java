package haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.app.App7;


/**
 * Created by Administrator on 2018/8/8.
 */

@Module
public class AppModule7 {

    private App7 app;

    public AppModule7(App7 app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public App7 provideApp() {
        return app;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return app.getApplicationContext();
    }

}

