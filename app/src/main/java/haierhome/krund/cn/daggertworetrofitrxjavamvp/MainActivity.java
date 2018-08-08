package haierhome.krund.cn.daggertworetrofitrxjavamvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;
import javax.inject.Named;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.annotation.One;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.annotation.Two;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.di.LoginCtrl;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.di.LoginOutCtrl;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.di.component.DaggerLoginComponent;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.di.module.LoginModule;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.di.module.LoginOutModule;


public class MainActivity extends AppCompatActivity {

    @One
    @Inject
    protected LoginCtrl loginCtrlOne;

    @Two
    @Inject
    protected LoginCtrl loginCtrlTwo;

//    @Inject
//    LoginOutCtrl loginOutCtrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DaggerLoginComponent.builder().
//                loginModule(new LoginModule(this)).
//                loginOutModule(new LoginOutModule(this)).build().inject(this);

        DaggerLoginComponent.builder().
                loginModule(new LoginModule(this)).
                build().inject(this);
//
        //调用方法
        loginCtrlOne.login("admin", "admin");
        loginCtrlTwo.login("guest", "guest");

    }
}
