package com.windupurnomo.kambingindonesia.activities;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.windupurnomo.kambingindonesia.R;

public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btnSignIn = (Button) findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(signInOC);
    }

    private View.OnClickListener signInOC = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Login.this, MainActivity.class);
            startActivity(i);
        }
    };


}
