package haierhome.krund.cn.daggertworetrofitrxjavamvp.contractmvp.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.contractmvp.contract.ILoginContract;

/**
 * 9 实现数据层逻辑
 */

public class LoginModel extends BaseModel implements ILoginContract.ILoginModel {


    private Thread thread;
    private Handler handler = new Handler();
    private ILoginContract.LoginStateListener loginStateListener;

    @Override
    public void loginToWeb(final String userName, final String passWord) {

        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                handler.post(new Runnable() {
                    @Override
                    public void run() {

                        if (loginStateListener != null) {
                            if ("admin".equals(userName) || "admin".equals(passWord)) {
                                loginStateListener.success();
                            } else {
                                loginStateListener.fail();
                            }
                        }
                    }
                });
            }
        });
        thread.start();
    }

    @Override
    public void loginSave(Context context, String userName, String password) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("username", Context.MODE_APPEND);
        sharedPreferences.edit().putString("username", userName);
        sharedPreferences.edit().putString("password", password);
        sharedPreferences.edit().commit();
    }

    @Override
    public void setLoginStateListener(ILoginContract.LoginStateListener loginStateListener) {
        this.loginStateListener = loginStateListener;
    }

    @Override
    public void clearLoginStateListener() {
        this.loginStateListener = null;
    }

    @Override
    public void destroy() {
        super.destroy();
        if (thread != null) {
            thread.interrupt();
        }
        clearLoginStateListener();
    }
}
