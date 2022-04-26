package com.example.a10119180latihan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/* Tanggal Pengerjaan  : 26 April 2022
 * NIM                 : 10119180
 * Nama                : Ghea Rizqi N
 * Kelas               : IF5
 */

public class VerifyCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_code);
    }

    public void actIn(View view) {
        Intent intent = new Intent(this, PersonalFormActivity.class);
        startActivity(intent);
    }
}

