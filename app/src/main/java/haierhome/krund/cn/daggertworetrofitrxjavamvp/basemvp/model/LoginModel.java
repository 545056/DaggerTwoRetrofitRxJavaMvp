package haierhome.krund.cn.daggertworetrofitrxjavamvp.basemvp.model;

import android.os.Handler;
import android.util.Log;

/**
 * Created by Administrator on 2018/8/9.
 */

public class LoginModel implements Iloginmodel {

    private Thread thread;
    private Iloginmodel.IloginState iloginState;
    private Handler handler = new Handler();

    @Override
    public void logining(final String username, final String password) {

        thread = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if ("admin".equals(username) && "123".equals(password)) {
                    Log.i("@@", "使用用户名" + username + "密码" + password + "登录成功");

                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            if (iloginState != null) {
                                iloginState.loginstate("使用用户名" + username + "密码" + password + "登录成功");
                            }
                        }
                    });
                } else {
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            if (iloginState != null) {
                                iloginState.loginstate("使用用户名" + username + "密码" + password + "登录成功");
                            }
                        }
                    });
                    Log.i("@@", "使用用户名" + username + "密码" + password + "登录失败");
                }
            }
        });
        thread.start();
    }

    @Override
    public void setIloginStateListener(IloginState iloginState) {
        this.iloginState = iloginState;
    }

    @Override
    public void clearIloginStateListener() {
        this.iloginState = null;
    }

    @Override
    public void destroy() {
        thread = null;
    }

}
