package com.example.semest21;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализация кнопки "Открыть CallNum"
        Button buttonCallNum = findViewById(R.id.buttonCallNum);
        buttonCallNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCallNumActivity();
            }
        });

        Button buttonOpenMessageActivity = findViewById(R.id.buttonSendMessage);
        buttonOpenMessageActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMessageActivity();
            }
        });
        // Инициализация ImageButton и установка слушателя для него
        ImageButton imageButtonOpenActivity2 = findViewById(R.id.imageButtonOpenActivity2);
        imageButtonOpenActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    private void openActivity2() {
        Intent intent = new Intent(this, CamActivity.class);
        startActivity(intent);
    }

    private void openMessageActivity() {
        Intent intent = new Intent(this, MessageActivity.class);
        startActivity(intent);
    }
    private void openCallNumActivity() {
        Intent intent = new Intent(this, CallNum.class);
        startActivity(intent);
    }



}
