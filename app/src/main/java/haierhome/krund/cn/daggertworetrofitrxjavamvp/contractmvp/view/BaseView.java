package haierhome.krund.cn.daggertworetrofitrxjavamvp.contractmvp.view;

import android.app.Activity;
import android.os.Bundle;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.contractmvp.presenter.IBasePresenter;


/**
 * 6BaseView中需要引入控制层Presenter 所以引入IBasePresenter
 */

public abstract class BaseView<P extends IBasePresenter> extends Activity implements IBaseView {

    P presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        initView();
        initListener();

    }

    /**
     * 初始化监听
     */

    protected abstract void initListener();

    /**
     * 初始化控件
     */
    protected abstract void initView();



    @Override
    protected void onDestroy() {
        super.onDestroy();

        /**
         * presenter销毁
         */
        if (presenter != null) {
            presenter.destroy();
            presenter = null;
        }
    }
}
