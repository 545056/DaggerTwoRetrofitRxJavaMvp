package haierhome.krund.cn.daggertworetrofitrxjavamvp.basemvp.view;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import haierhome.krund.cn.daggertworetrofitrxjavamvp.R;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.basemvp.model.Iloginmodel;
import haierhome.krund.cn.daggertworetrofitrxjavamvp.basemvp.presenter.LoginPresenter;

public class LoginView extends BaseView<LoginPresenter> implements IloginView {

    private EditText et_input_username;
    private EditText et_input_password;
    private Button bt_login;
    private ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_base_mvp_show);
        super.onCreate(savedInstanceState);


        presenter = new LoginPresenter(this);
        presenter.setIloginStateListener(new Iloginmodel.IloginState() {
            @Override
            public void loginstate(String loginMsg) {
                presenter.dismissProgressdialog();
                presenter.showToast(loginMsg);
            }
        });

    }

    @Override
    public void initView() {

        et_input_username = (EditText) findViewById(R.id.et_input_username);
        et_input_password = (EditText) (findViewById(R.id.et_input_password));
        bt_login = (Button) findViewById(R.id.bt_login);
    }

    @Override
    public void initListener() {
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.logining(getUserName(),getPassWord());
                showProgressDialog();
            }
        });
    }

    private String getUserName() {

        return et_input_username.getText().toString();
    }

    private String getPassWord() {

        return et_input_password.getText().toString();
    }

    private void showProgressDialog() {
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("登陆中");
        progressDialog.show();
    }

    private void dismissProgressDialog() {
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }


    @Override
    public void showToast(final String msg) {
        Toast.makeText(LoginView.this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void showProgressdialog() {
        showProgressDialog();
    }

    @Override
    public void dismissProgressdialog() {
        dismissProgressDialog();
    }

    @Override
    public void clickLoginBtn() {

    }
}
