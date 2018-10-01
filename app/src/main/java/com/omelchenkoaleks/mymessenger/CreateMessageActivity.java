package com.omelchenkoaleks.mymessenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    // метод вызовется при клике на кнопке send
    public void onSendMessage(View view) {
        // используем Интент, чтобы запустить вторую активность
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        startActivity(intent);
    }
}
