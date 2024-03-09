package com.example.semest21;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MessageActivity extends AppCompatActivity {

    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        editTextMessage = findViewById(R.id.editTextMessage);
    }

    public void sendMessageToTelegram(View view) {
        String message = editTextMessage.getText().toString();
        shareTextToTelegram(message);
    }

    public void shareTextToTelegram(String message) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, message);
        intent.setPackage("org.telegram.messenger"); // Укажите пакетное имя приложения Telegram
        startActivity(Intent.createChooser(intent, "Отправить через"));
    }
}

