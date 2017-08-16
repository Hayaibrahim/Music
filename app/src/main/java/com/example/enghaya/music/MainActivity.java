package com.example.enghaya.music;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.support.v7.view.menu.MenuAdapter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalService;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonPay;
    private EditText editTextAmount;

    //Payment Amount
    private String paymentAmount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonPay = (Button) findViewById(R.id.buttonPay);
        editTextAmount = (EditText) findViewById(R.id.editTextAmount);
        Button music = (Button) findViewById(R.id.music);
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Music.class);
                startActivity(i);
            }
        });
        Button abt = (Button) findViewById(R.id.about);
        abt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t = new Intent(MainActivity.this, About.class);
                startActivity(t);
            }
        });
        Button buy = (Button) findViewById(R.id.buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this, Payment.class);
                startActivity(b);
            }
        });
    }
    @Override
    public void onClick(View v) {
    }
}