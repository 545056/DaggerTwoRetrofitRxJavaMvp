package haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.activity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.R;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.DependencyPresenter7;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.component.ActivityComponent7;

public class TargetActivity72 extends BaseActivity712 {

    @Inject
    DependencyPresenter7 mDependencyPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Dagger.class","TargetActivity72---mDependencyPresenter地址值-------"+mDependencyPresenter.toString());
    }

    @Override
    public void inject(ActivityComponent7 activityComponent7) {
        activityComponent7.inject(this);
    }
}
