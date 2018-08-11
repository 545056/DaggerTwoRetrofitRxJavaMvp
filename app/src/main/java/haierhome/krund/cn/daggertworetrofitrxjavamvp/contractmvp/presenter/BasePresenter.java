package haierhome.krund.cn.daggertworetrofitrxjavamvp.contractmvp.presenter;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.contractmvp.model.IBaseModel;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.contractmvp.view.IBaseView;

/**
 * 4在写所有Presenter的基类
 * <p>
 * Presenter层处理了中心业务逻辑
 * 所以应该包含数据层,IBsaseModel，View层IBaseView
 * 所以限定是IBaseView，和IBaseModel
 */

public class BasePresenter<V extends IBaseView, M extends IBaseModel> implements IBasePresenter {

    public V view;

    public M model;

    public BasePresenter(V view, M model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void destroy() {
        if (model != null) {
            model.destroy();
            model = null;
        }
    }
}
