package com.crisp_chat_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import im.crisp.client.ChatActivity;
import im.crisp.client.Crisp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Crisp.configure(getApplicationContext(), "WebSite Id");
        try{
            Intent crispIntent = new Intent(this, ChatActivity.class);
            startActivity(crispIntent);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}