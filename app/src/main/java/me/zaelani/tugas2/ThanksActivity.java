package me.zaelani.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ThanksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks);

        TextView thanksWord = findViewById(R.id.thanksWord);
        thanksWord.setText(Html.fromHtml(getResources().getString(R.string.verify_txt_body)));
    }
}
