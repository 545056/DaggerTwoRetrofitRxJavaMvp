package haierhome.krund.cn.daggertworetrofitrxjavamvp.scope;

import android.util.Log;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.app.App7;

/**
 * Created by Administrator on 2018/8/8.
 */

public class DependencyPresenter7 {

    public DependencyPresenter7(App7 app){
        Log.d("Dagger.class","DependencyPresenter7-----构造器被调用--------");
    }

    public void printMethod(){
        Log.d("Dagger.class","DependencyPresenter7-----printMethod()-----");
    }
}
