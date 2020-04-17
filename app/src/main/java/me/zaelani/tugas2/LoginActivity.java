package me.zaelani.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.username)
    EditText username;

    @BindView(R.id.password)
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_login)
    void login() {
        String user = username.getText().toString();
        String pass = password.getText().toString();

        if (user.isEmpty() || pass.isEmpty()) {
            Toast.makeText(LoginActivity.this, "Username atau Password tidak boleh kosong", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(LoginActivity.this, "Username tidak terdaftar", Toast.LENGTH_LONG).show();
        }
    }

    @OnClick(R.id.btn_login_facebook)
    void facebookLogin() {
        Toast.makeText(LoginActivity.this, "Silahkan install aplikasi facebook terlebih dahulu", Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.register)
    void register() {
        startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
    }
}
