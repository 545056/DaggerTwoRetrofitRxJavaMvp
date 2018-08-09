package haierhome.krund.cn.daggertworetrofitrxjavamvp.basemvp.view;

/**
 * LoginView登录页面功能接口
 */

public interface IloginView {

    /**
     * Toast登录的提示信息
     */
    void showToast(String msg);

    /**
     * 展示登录对话框
     */
    void showProgressdialog();

    /**
     * 取消登录对话框
     */
    void dismissProgressdialog();

    /**
     * 登录按钮点击
     */
    void clickLoginBtn();


}
