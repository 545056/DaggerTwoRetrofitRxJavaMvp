package haierhome.krund.cn.daggertworetrofitrxjavamvp.basemvp.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.R;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.basemvp.model.Iloginmodel;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.basemvp.presenter.IBasePresenter;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.basemvp.presenter.LoginPresenter;

/**
 * Created by Administrator on 2018/8/9.
 */

public abstract class BaseView<T extends IBasePresenter> extends Activity implements IBasePresenter {

    T presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView();
        initListener();

    }

    /**
     * findView
     */
    public abstract void initView();

    /**
     * initListener
     */

    public abstract void initListener();

}
