package haierhome.krund.cn.daggertworetrofitrxjavamvp.basemvp.model;

/**
 * Created by Administrator on 2018/8/9.
 */

public interface Iloginmodel extends Imodel {

    /**
     * 定义登录请求
     */
    void logining(String username, String password);

    /**
     * 定义登录信息的回调接口
     */
    interface IloginState {
        void loginstate(String loginMsg);
    }
    /**
     * 注册登录接口
     */
     void setIloginStateListener(Iloginmodel.IloginState iloginState);
    /**
     * 解绑登录接口
     */
    void clearIloginStateListener();
}
