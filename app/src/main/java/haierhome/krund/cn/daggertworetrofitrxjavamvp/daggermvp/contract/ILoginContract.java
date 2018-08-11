package haierhome.krund.cn.daggertworetrofitrxjavamvp.daggermvp.contract;

import android.content.Context;

/**
 * 8考虑页面逻辑和业务逻辑在ILoginContract登录契约接口中
 */

public interface ILoginContract {

    /**
     * 这个就是原来LoginModel的业务接口原来在model包中 google大神都把他们抽出来放在这个契约接口中
     */
    interface ILoginModel {

        /**
         * 远程登录的方法
         */
        void loginToWeb(String userName, String passWord);

        /**
         * 登录信息保存本地的方法 需要上下文
         */
        void loginSave(Context context, String userName, String password);

        /**
         * 设置登录监听
         */
        void setLoginStateListener(ILoginContract.LoginStateListener loginStateListener);

        /**
         * 清楚登录监听
         */
        void clearLoginStateListener();
    }

    /**
     * 登录状态返回的接口
     */
    interface LoginStateListener {

        void success();
        void fail();
    }

    /**
     * 这个就是原来的ILoginView
     */
    interface ILoginView {
        /**
         * 展示toast
         */
        void showToast(String msg);

        /**
         * 获得用户名
         */
        String getUserName();

        /**
         * 获得密码
         */
        String getPassWord();

        /**
         * 展示登录对话框
         */
        void showLoginDialog();

        /**
         * 取消登录对话框
         */
        void dismissLoginDialog();
    }
}
