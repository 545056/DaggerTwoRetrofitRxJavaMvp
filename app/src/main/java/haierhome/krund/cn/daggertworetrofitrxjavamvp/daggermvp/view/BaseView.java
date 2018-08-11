package haierhome.krund.cn.daggertworetrofitrxjavamvp.daggermvp.view;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.daggermvp.presenter.IBasePresenter;




public abstract class BaseView<P extends IBasePresenter> extends Activity implements IBaseView {

    @Inject
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
