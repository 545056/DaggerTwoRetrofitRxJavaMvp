package haierhome.krund.cn.daggertworetrofitrxjavamvp.business;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/8/8.
 */

public class LoginService {

    //远程登录的处理方法
    @Inject
    public LoginService() {
    }

    public void logining(String username, String password) {

        Log.i("@@", "用户数据远程登入成功");

    }
}
