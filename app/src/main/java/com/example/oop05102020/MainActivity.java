package com.example.oop05102020;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity implements OnListenLogin{

    EditText mEdtTk,mEdtMk;
    Button mBtnDangNhap;
    OnListenLogin mOnListenLogin;
    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mBtnDangNhap = findViewById(R.id.buttonDangNhap);
        mEdtTk = findViewById(R.id.editTextTaiKhoan);
        mEdtMk = findViewById(R.id.editTextMatKhau);
        mOnListenLogin = MainActivity.this;
    }

    @Override
    protected void event() {
        mBtnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tk = mEdtTk.getText().toString();
                String mk = mEdtMk.getText().toString();

                if (tk.equals("phat") && mk.equals("123")){
                    mOnListenLogin.onSuccess();
                }else{
                    mOnListenLogin.onFail();
                }
            }
        });
    }

    @Override
    public void onFail() {
        Toast.makeText(this, "Thất bại", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSuccess() {
        Toast.makeText(this, "Thành công", Toast.LENGTH_SHORT).show();
    }
}