package haierhome.krund.cn.daggertworetrofitrxjavamvp.contractmvp.view;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.R;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.contractmvp.contract.ILoginContract;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.contractmvp.model.LoginModel;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.contractmvp.presenter.LoginPresenter;

/**
 * 7实现LoginView 页面初始化控件
 * 8考虑页面逻辑和业务逻辑在ILoginContract登录契约接口中
 */

public class LoginView extends BaseView<LoginPresenter> implements ILoginContract.ILoginView {

    private ProgressDialog progressDialog;
    private EditText et_input_username, et_input_password;
    private Button bt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_login_view);
        super.onCreate(savedInstanceState);

        presenter = new LoginPresenter(this, new LoginModel());

    }

    @Override
    protected void initListener() {

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loginToWeb(presenter.getUserName(), presenter.getPassWord());
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
