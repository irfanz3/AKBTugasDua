package me.zaelani.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.zaelani.tugas2.utils.SharedPrefs;


/**
 * Created on Fri Apr 17 2020
 *
 * Made with ❤ Irfan Zaelani
 * 10117911
 * IF-6K
 *
 */
public class RegisterActivity extends AppCompatActivity {

    @BindView(R.id.bloodType)
    Spinner bloodType;

    @BindView(R.id.username)
    EditText username;

    @BindView(R.id.agree)
    CheckBox termCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);

        SharedPrefs.init(getApplicationContext());
    }

    @OnClick(R.id.back)
    void back() {
        finish();
    }

    @OnClick(R.id.btn_register)
    void register() {
        String sureName = username.getText().toString();
        String blood = bloodType.getSelectedItem().toString();
        int position = bloodType.getSelectedItemPosition();

        if (sureName.isEmpty()) {
            Toast.makeText(RegisterActivity.this, "Username tidak boleh kosong", Toast.LENGTH_LONG).show();
            return;
        }

        if (position <= 0) {
            Toast.makeText(RegisterActivity.this, "Harap isi golongan darah anda", Toast.LENGTH_LONG).show();
            return;
        }

        if (!termCheckbox.isChecked()) {
            Toast.makeText(RegisterActivity.this, "Harap setujui term and condition", Toast.LENGTH_LONG).show();
            return;
        }

        SharedPrefs.saveName(sureName);
        SharedPrefs.saveBloodType(blood);

        startActivity(new Intent(RegisterActivity.this, ThanksActivity.class));
        finish();
    }
}
