package haierhome.krund.cn.daggertworetrofitrxjavamvp.dagger.business.loginout;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/8/8.
 */

public class LoginOutStore {

    private Context context;

    @Inject
    public LoginOutStore(Context context) {
        this.context=context;
    }

    public void loginOutSave(String username,String password) {
        SharedPreferences.Editor editor = context.getSharedPreferences("login", Context.MODE_PRIVATE).edit();
        editor.putString("username", username);
        editor.putString("password", password);
        editor.commit();
        editor.apply();
        Log.i("@@", "用户数据本地保存成功");
        Log.i("@@","本地的登入退出成功");
    }
}
