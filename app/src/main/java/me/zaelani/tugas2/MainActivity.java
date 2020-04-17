package me.zaelani.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.zaelani.tugas2.utils.SharedPrefs;

/**
 * Created on Fri Apr 17 2020
 *
 * Made with ❤ By Irfan Zaelani
 * 10117911
 * IF-6K
 *
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.client_name)
    TextView name;

    @BindView(R.id.bloodType)
    TextView blood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        SharedPrefs.init(getApplicationContext());

        String username = SharedPrefs.getName();
        String bloodType = SharedPrefs.getBloodTpe();
        String bloodStatus = getResources().getString(R.string.home_txt_blood_type) + " " + bloodType;

        name.setText(username);
        blood.setText(bloodStatus);
    }
}
