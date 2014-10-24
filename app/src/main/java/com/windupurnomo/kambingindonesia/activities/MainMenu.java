package com.windupurnomo.kambingindonesia.activities;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.windupurnomo.kambingindonesia.R;

public class MainMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        ImageView ivProfile = (ImageView)findViewById(R.id.ivProfile);
        TextView tvProfile = (TextView)findViewById(R.id.tvProfile);
        ivProfile.setOnClickListener(clickProfile);
        tvProfile.setOnClickListener(clickProfile);


    }

    private View.OnClickListener clickProfile = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}
