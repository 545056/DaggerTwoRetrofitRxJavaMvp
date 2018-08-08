package haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.R;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.DependencyPresenter7;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.scope.component.ActivityComponent7;

public class TargetActivity71 extends BaseActivity712 {

    @Inject
    DependencyPresenter7 mDependencyPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Dagger.class", "TargetActivity71---mDependencyPresenter地址值-------" + mDependencyPresenter.toString());

        findViewById(R.id.jump).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump(v);
            }
        });
    }

    @Override
    public void inject(ActivityComponent7 activityComponent7) {
        activityComponent7.inject(this);
    }

    public void jump(View v) {
        startActivity(new Intent(this, TargetActivity72.class));
    }
}
