package haierhome.krund.cn.daggertworetrofitrxjavamvp.daggermvp.presenter;


import haierhome.krund.cn.daggertworetrofitrxjavamvp.daggermvp.model.IBaseModel;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.daggermvp.view.IBaseView;


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
