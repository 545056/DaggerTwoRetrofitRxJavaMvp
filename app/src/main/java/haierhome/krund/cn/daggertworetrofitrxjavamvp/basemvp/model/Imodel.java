package haierhome.krund.cn.daggertworetrofitrxjavamvp.basemvp.model;

/**
 * model层的数据接口 数据层都需要销毁防止内存泄漏
 */

public interface Imodel {

    void destroy();
}
