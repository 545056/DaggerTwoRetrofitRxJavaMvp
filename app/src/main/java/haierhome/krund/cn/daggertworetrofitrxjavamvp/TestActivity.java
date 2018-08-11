package haierhome.krund.cn.daggertworetrofitrxjavamvp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.basemvp.view.LoginView;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.dagger.MainActivity;


public class TestActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt_dagger2, bt_basemvp, bt_contractmvp, bt_dagger2mvp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        bt_dagger2 = (Button) findViewById(R.id.bt_dagger2);
        bt_dagger2.setOnClickListener(this);
        bt_basemvp = (Button) findViewById(R.id.bt_basemvp);
        bt_basemvp.setOnClickListener(this);
        bt_contractmvp = (Button) findViewById(R.id.bt_contractmvp);
        bt_contractmvp.setOnClickListener(this);
        bt_dagger2mvp = (Button) findViewById(R.id.bt_dagger2mvp);
        bt_dagger2mvp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_dagger2:
                startActivity(new Intent(TestActivity.this, MainActivity.class));
                break;
            case R.id.bt_basemvp:
                startActivity(new Intent(TestActivity.this, LoginView.class));
                break;
            case R.id.bt_contractmvp:
                startActivity(new Intent(TestActivity.this, haierhome.krund.cn.
                        daggertworetrofitrxjavamvp.contractmvp.view.LoginView.class));
                break;
            case R.id.bt_dagger2mvp:
                startActivity(new Intent(TestActivity.this, MainActivity.class));
                break;
        }
    }
}
