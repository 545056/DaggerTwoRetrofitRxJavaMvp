package haierhome.krund.cn.daggertworetrofitrxjavamvp.dagger.business.loginout;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/8/8.
 */

public class LoginOutService {

    @Inject
    public LoginOutService() {

    }

    public void loginOuting(String username,String password){
        //远程登出
        Log.i("@@","网络的登入退出成功");
    }
}
