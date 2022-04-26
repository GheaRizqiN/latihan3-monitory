package com.example.a10119180latihan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/* Tanggal Pengerjaan  : 26 April 2022
 * NIM                 : 10119180
 * Nama                : Ghea Rizqi N
 * Kelas               : IF5
 */

public class FinishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        String nickName = getIntent().getStringExtra(PersonalFormActivity.INPUT_NICKNAME);

        TextView textView = findViewById(R.id.finishTextMessage);
        String replace = textView.getText().toString().replace("kamu",nickName).replace("mu",nickName);
        textView.setText(String.valueOf(replace));
    }

    public void actFinish(View view) {
        finishAffinity();
        finishAndRemoveTask();
    }
}
