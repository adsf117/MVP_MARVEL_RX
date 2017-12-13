package com.puzzlebench.mvp_marvel.adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.puzzlebench.mvp_marvel.ImageLoadedCallback;
import com.puzzlebench.mvp_marvel.R;
import com.puzzlebench.mvp_marvel.models.Result;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CaracterAdapter extends RecyclerView.Adapter<CaracterAdapter.PhotoViewHolder> {

    private ArrayList<Result> items;

    public CaracterAdapter(ArrayList<Result> items) {
        this.items = items;
    }

    @Override
    public PhotoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.caracter_cards_layout, parent, false);
        return new PhotoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final PhotoViewHolder viewHolder, int position) {
        final Result item = items.get(position);
        final String imgeUrl = item.getThumbnail().getPath()+"."+item.getThumbnail().getExtension();
        viewHolder.tv_item.setText(String.valueOf(item.getName()));
        Picasso.with(viewHolder.image.getContext()).load(imgeUrl).fit().centerCrop().into(viewHolder.image);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return items != null ? items.size() : 0;
    }

    public static class PhotoViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.image_thumbnail) ImageView image;
        @BindView(R.id.tv_item) TextView tv_item;

        public PhotoViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @OnClick(R.id.image_thumbnail)
        public void onImageClick(View view) {

            Log.d(CaracterAdapter.class.getName(),"Abrir Fagment");
        }
    }
}