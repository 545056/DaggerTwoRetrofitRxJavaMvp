package haierhome.krund.cn.daggertworetrofitrxjavamvp.business.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by Administrator on 2018/8/8.
 */

public class LoginStore {

    private Context context;

    public LoginStore(Context context) {
        this.context = context;
    }

    //登录的本地保存用户名密码
    public void loginSave(String username, String password) {
        SharedPreferences.Editor editor = context.getSharedPreferences("login", Context.MODE_PRIVATE).edit();
        editor.putString("username", username);
        editor.putString("password", password);
        editor.commit();
        editor.apply();
        Log.i("@@", "用户数据本地保存成功");
    }
}
