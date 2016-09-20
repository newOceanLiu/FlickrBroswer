package com.learn.ocean.flickerbrowser;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ocean on 13/09/16.
 */
public class FlickrRecyclerViewAdapter extends RecyclerView.Adapter<FlickrImageViewHolder> {
    private List<Photo> mPhotoList;
    private Context mContext;

    public FlickrRecyclerViewAdapter (Context context, List<Photo> photoList) {
        this.mContext = context;
        this.mPhotoList = photoList;
    }

    @Override
    public int getItemCount() {
        return (null != mPhotoList ? mPhotoList.size() : 0);
    }

    @Override
    public void onBindViewHolder(FlickrImageViewHolder holder, int position) {
        Photo photoItem = mPhotoList.get(position);
        Picasso.with(mContext)
                .load(photoItem.getmImage())
                .error(R.drawable.placeholder)
                .placeholder(R.drawable.placeholder)
                .into(holder.thumbnail);

        holder.title.setText(photoItem.getmTitle());
    }

    @Override
    public FlickrImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.browse, null);
        FlickrImageViewHolder flickrImageViewHolder = new FlickrImageViewHolder(view);
        return flickrImageViewHolder;
    }

    public void loadNewData(List<Photo> newPhotos) {
        mPhotoList = newPhotos;
        notifyDataSetChanged();
    }

    public Photo getPhoto(int position) {
        return (null != mPhotoList ? mPhotoList.get(position) : null);
    }
}
