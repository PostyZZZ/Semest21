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

        ImageButton imagebuttonCallNum = findViewById(R.id.imagebuttonCallNum);
        imagebuttonCallNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCallNumActivity();
            }
        });

        ImageButton imagebuttonSendMessage = findViewById(R.id.imagebuttonSendMessage);
        imagebuttonSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMessageActivity();
            }
        });

        ImageButton imageButtonOpenActivity2 = findViewById(R.id.imageButtonOpenActivity2);
        imageButtonOpenActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        ImageButton imagebuttonOpenWebActivity = findViewById(R.id.imagebuttonOpenWebActivity);
        imagebuttonOpenWebActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebActivity();
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
    private void openWebActivity() {
        Intent intent = new Intent(this, WebActivity.class);
        startActivity(intent);
    }
}
