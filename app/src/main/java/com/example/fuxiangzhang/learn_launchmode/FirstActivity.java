package com.example.fuxiangzhang.learn_launchmode;

import android.content.Intent;
import android.support.annotation.IntDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import retrofit2.Retrofit;
import retrofit2.http.Path;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        View view;
        view.setVisibility();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        TextView tv_content= (TextView) findViewById(R.id.tv_content);
        tv_content.setText(this.toString());
        findViewById(R.id.btn_go).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FirstActivity.this,FirstActivity.class);
                startActivity(intent);
            }
        });

    }
}
