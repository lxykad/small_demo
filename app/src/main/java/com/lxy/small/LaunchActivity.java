package com.lxy.small;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import net.wequick.small.Small;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initEvents();
    }

    private void initEvents() {
        Button btMain = (Button) findViewById(R.id.bt_main);
        btMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Small.setUp(LaunchActivity.this, new Small.OnCompleteListener() {
                    @Override
                    public void onComplete() {
                        Toast.makeText(LaunchActivity.this,"test",Toast.LENGTH_SHORT).show();
                        Small.openUri("main", LaunchActivity.this);

                    }
                });

            }
        });


    }
}
