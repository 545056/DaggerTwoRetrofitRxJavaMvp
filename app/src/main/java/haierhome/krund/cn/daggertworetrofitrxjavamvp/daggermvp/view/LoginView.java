package haierhome.krund.cn.daggertworetrofitrxjavamvp.daggermvp.view;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.R;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.daggermvp.contract.ILoginContract;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.daggermvp.di.DaggerLoginComponent;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.daggermvp.di.LoginModule;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.daggermvp.presenter.LoginPresenter;


public class LoginView extends BaseView<LoginPresenter> implements ILoginContract.ILoginView {

    private ProgressDialog progressDialog;
    private EditText et_input_username, et_input_password;
    private Button bt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_login_view);
        super.onCreate(savedInstanceState);

        /**
         * 1首先在父类BaseView中加入inject
         * 2创建 di  LoginComponent
         * 3创建 LoginModule loginModule中没找到LoginPresenter
         * 4去LoginPresenter的构造函数找 发现需要LoginView LoginModel
         * 5在去LoginModule中找LoginView，找到了
         * 6然后去LoginModule中找LoginModel,发现需要参数LoginModel
         * 7去LoginModel的构造函数中找找到后统一创建实例
         */
        DaggerLoginComponent.builder().loginModule(new LoginModule(this)).build().inject(this);

    }

    @Override
    protected void initListener() {

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loginToWeb(LoginView.this, getUserName(), getPassWord());
            }
        });

    }

    private void showProgressDialog() {
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("登陆中");
        progressDialog.setTitle("登录对话框");
        progressDialog.show();
    }

    private void dismissProgressDialog() {
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override
    protected void initView() {
        et_input_username = findViewById(R.id.et_input_username);
        et_input_password = findViewById(R.id.et_input_password);
        bt_login = findViewById(R.id.bt_login);
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public String getUserName() {
        return et_input_username.getText().toString();
    }

    @Override
    public String getPassWord() {
        return et_input_password.getText().toString();
    }

    @Override
    public void showLoginDialog() {
        showProgressDialog();
    }

    @Override
    public void dismissLoginDialog() {
        dismissProgressDialog();
    }
}
