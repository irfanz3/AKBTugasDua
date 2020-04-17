package me.zaelani.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

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
public class ThanksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks);
        ButterKnife.bind(this);

        TextView thanksWord = findViewById(R.id.thanksWord);
        thanksWord.setText(Html.fromHtml(getResources().getString(R.string.verify_txt_body)));
    }

    @OnClick(R.id.btn_verify)
    void verify() {
        startActivity(new Intent(this, VerifyActivity.class));
    }
}
