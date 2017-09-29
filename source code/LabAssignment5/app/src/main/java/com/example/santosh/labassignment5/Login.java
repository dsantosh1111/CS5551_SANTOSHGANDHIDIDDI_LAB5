package com.example.santosh.labassignment5;

/**
 * Created by santosh on 9/28/2017.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    Button button_register_page;
    Button button_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        button_register_page = (Button) findViewById(R.id.button5);
        button_register_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Login.this, Register.class);
                startActivity(i2);
            }
        });

        button_login = (Button) findViewById(R.id.button4);
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Login.this, MainActivity.class);
                startActivity(i3);
            }
        });

    }
}
