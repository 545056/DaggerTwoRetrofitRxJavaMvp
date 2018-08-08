package haierhome.krund.cn.daggertworetrofitrxjavamvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.di.LoginCtrl;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.di.LoginOutCtrl;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.di.component.DaggerLoginComponent;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.di.module.LoginModule;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.di.module.LoginOutModule;


public class MainActivity extends AppCompatActivity {

    @Inject
    protected LoginCtrl loginCtrl;
    @Inject
    LoginOutCtrl loginOutCtrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DaggerLoginComponent.builder().
//                loginModule(new LoginModule(this)).
//                loginOutModule(new LoginOutModule(this)).build().inject(this);

        DaggerLoginComponent.builder().loginModule(new LoginModule(this)).loginOutModule(new LoginOutModule(this)).build().inject(this);
//
        //调用方法
        loginCtrl.login("admin", "admin");
        loginOutCtrl.loginOut("admin", "admin");

    }
}
