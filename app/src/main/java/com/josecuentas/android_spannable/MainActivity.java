package com.josecuentas.android_spannable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTviUsername;
    private TextView mTviName;
    private TextView mTviLastName;
    private TextView mTviMessage;
    private TextView mTviEmail;

    private String username, name, lastname, message, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        injectView();
        data();

    }

    private void data() {
        username = "PibeDx";
        name = "José Norberto";
        lastname = "Cuentas Turpo";
        message = "";
        email = "jcuentast@gmail.com";

    }

    private void injectView() {
        mTviUsername = (TextView) findViewById(R.id.tviUsername);
        mTviName = (TextView) findViewById(R.id.tviName);
        mTviLastName = (TextView) findViewById(R.id.tviLastName);
        mTviMessage = (TextView) findViewById(R.id.tviMessage);
        mTviEmail = (TextView) findViewById(R.id.tviEmail);
    }
}
