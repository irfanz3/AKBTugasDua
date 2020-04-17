package me.zaelani.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created on Fri Apr 17 2020
 *
 * Made with ❤ Irfan Zaelani
 * 10117911
 * IF-6K
 *
 */
public class VerifyActivity extends AppCompatActivity {

    @BindView(R.id.verification_code)
    EditText verificationCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_send)
    void verificationCode() {
        String code = verificationCode.getText().toString();
        if (code.isEmpty()) {
            Toast.makeText(this, "Kode Verifikasi tidak boleh kosong", Toast.LENGTH_LONG).show();
            return;
        }

        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
