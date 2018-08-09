package haierhome.krund.cn.daggertworetrofitrxjavamvp.basemvp.http;

import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.Map;

/**
 * Created by Administrator on 2018/2/8.
 */

public class OkhttpUtilHelper {


    public static void get(String url, Map<String, String> map, StringCallback sc, String tag) {

        OkHttpUtils.get().url(url).params(map).tag(tag).build().execute(sc);

    }

    public static void post(String url, Map<String, String> map, StringCallback sc) {

        OkHttpUtils.post().url(url).params(map).build().execute(sc);

    }
}
