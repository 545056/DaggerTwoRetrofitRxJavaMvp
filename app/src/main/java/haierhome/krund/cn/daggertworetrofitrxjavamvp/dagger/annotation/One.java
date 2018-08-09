package haierhome.krund.cn.daggertworetrofitrxjavamvp.dagger.annotation;

import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Administrator on 2018/8/8.
 */

@Qualifier
@Retention(RUNTIME)
public @interface One {
    //这里没有value
}