package com.josecuentas.android_spannable;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spanned;
import android.widget.TextView;

import com.josecuentas.android_spannable.lib.SpanDecorationBuild;

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
        String normal = " ==> normal";


        Spanned ssbUsername = SpanDecorationBuild.builder(this).spanTypeface(username, Typeface.BOLD).append(normal).builder();
        Spanned ssbName = SpanDecorationBuild.builder(this).spanColor(name, R.color.colorAccent).append(normal).builder();
        Spanned ssbLastname= SpanDecorationBuild.builder(this).spanColorAndTypeface(lastname, R.color.colorPrimaryDark, Typeface.BOLD).append(normal).builder();
        Spanned ssbMessage = SpanDecorationBuild
                .builder(this)
                .append("Message: \n========\n")
                .spanColorAndTypeface(username + "\n", R.color.colorPrimary,Typeface.BOLD)
                .spanColor(name + "\n", R.color.colorAccent)
                .spanColorAndTypeface(lastname, R.color.colorPrimaryDark, Typeface.BOLD)
                .append("\n========")
                .builder();
        Spanned ssbEmail = SpanDecorationBuild.builder(this).spanTypeface(email, Typeface.BOLD).append(normal).builder();

        mTviUsername.setText(ssbUsername, TextView.BufferType.SPANNABLE);
        mTviName.setText(ssbName);
        mTviLastName.setText(ssbLastname);
        mTviMessage.setText(ssbMessage);
        mTviEmail.setText(ssbEmail);


    }

    private void injectView() {
        mTviUsername = (TextView) findViewById(R.id.tviUsername);
        mTviName = (TextView) findViewById(R.id.tviName);
        mTviLastName = (TextView) findViewById(R.id.tviLastName);
        mTviMessage = (TextView) findViewById(R.id.tviMessage);
        mTviEmail = (TextView) findViewById(R.id.tviEmail);
    }
}
