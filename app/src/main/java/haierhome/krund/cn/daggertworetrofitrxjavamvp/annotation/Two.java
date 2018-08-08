package haierhome.krund.cn.daggertworetrofitrxjavamvp.annotation;

/**
 * Created by Administrator on 2018/8/8.
 */

import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
@Retention(RUNTIME)
public @interface Two {
    //这里没有value
}