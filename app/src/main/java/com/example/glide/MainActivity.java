package com.example.glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
private ImageView mImgDemo;
private Button button;
private final String url="https://i.pinimg.com/originals/ef/08/23/ef082334e999374dbe5392adf071a949.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImgDemo = (ImageView) findViewById(R.id.imgDemo);
        button = (Button) findViewById(R.id.btnLond);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.with(MainActivity.this).load(url).into(mImgDemo);
            }
        });
    }
}
