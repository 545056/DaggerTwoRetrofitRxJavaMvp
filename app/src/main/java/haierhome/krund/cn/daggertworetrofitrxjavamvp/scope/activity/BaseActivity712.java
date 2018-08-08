package haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.app.App7;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.component.ActivityComponent7;

public abstract class BaseActivity712 extends AppCompatActivity {

    private ActivityComponent7 mActivityComponent7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App7 app712 = (App7) getApplication();
        mActivityComponent7 = app712.getActivityComponent7();
        inject(mActivityComponent7);
    }

    public abstract void inject(ActivityComponent7 activityComponent7);

}
