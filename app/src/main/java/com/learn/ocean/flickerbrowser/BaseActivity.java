package com.learn.ocean.flickerbrowser;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by ocean on 14/09/16.
 */
public class BaseActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    public static final String FLICKR_QUERY = "FLICKR_QUERY";
    public static final String PHOTE_TRANSFER = "PHOTO_TRANSFER";

    protected Toolbar activateToolbar() {
        if(mToolbar == null) {
            mToolbar = (Toolbar) findViewById(R.id.app_bar);
            if(mToolbar != null) {
                setSupportActionBar(mToolbar);
            }
        }
        return mToolbar;
    }

    protected Toolbar activateToolbarWithHomeEnabled() {
        activateToolbar();
        if(mToolbar != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        return mToolbar;
    }
}
