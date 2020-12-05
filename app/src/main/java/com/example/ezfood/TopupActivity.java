package com.example.ezfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.*;

public class TopupActivity extends AppCompatActivity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topup);
        Button confirm = null;
        Button cancel  = null;

    }

    public void confirm(View view) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            Toast.makeText(context,"Topup Successful", LENGTH_SHORT).show();
        }

        public void cancel(View view) {
            finish();
            Toast.makeText(context,"Cancelled Topup", LENGTH_SHORT).show();
        }
    }

