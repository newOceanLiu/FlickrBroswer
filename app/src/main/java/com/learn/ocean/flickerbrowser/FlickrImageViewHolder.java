package com.learn.ocean.flickerbrowser;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ocean on 13/09/16.
 */
public class FlickrImageViewHolder extends RecyclerView.ViewHolder {
    protected ImageView thumbnail;
    protected TextView title;


    public FlickrImageViewHolder(View view) {
        super(view);
        this.thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
        this.title = (TextView) view.findViewById(R.id.title);
    }
}
