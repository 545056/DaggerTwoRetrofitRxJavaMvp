package haierhome.krund.cn.daggertworetrofitrxjavamvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.di.LoginCtrl;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.di.component.DaggerLoginComponent;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.di.module.LoginModule;


public class MainActivity extends AppCompatActivity {

    @Inject
    protected LoginCtrl loginCtrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        //初始化对象
//        DaggerLoginComponent.
//        //调用方法
//        loginCtrl.login("admin","admin");

        DaggerLoginComponent.builder().loginModule(new LoginModule(this)).build().inject(this);
        //调用方法
        loginCtrl.login("admin", "admin");

    }
}
