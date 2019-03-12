package com.example.eslam.marketapp.ui.home;

import android.arch.paging.PagedListAdapter;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.eslam.marketapp.R;
import com.example.eslam.marketapp.pojo.Brand;
import com.example.eslam.marketapp.utils.ActivityUtils;
import com.example.eslam.marketapp.utils.NetworkState;

public class BrandAdapter extends PagedListAdapter<Brand, BrandAdapter.ViewHolder> {

    private static final int TYPE_PROGRESS = 0;
    private static final int TYPE_ITEM = 1;

    private NetworkState networkState;


    protected BrandAdapter() {
        super(Brand.DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        switch (i) {
            case TYPE_PROGRESS:
                View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_category_progress, viewGroup, false);
                return new ViewHolder(view);
            default:
                View view1 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_brand, viewGroup, false);
                return new ViewHolder(view1);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull BrandAdapter.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == TYPE_ITEM)
            viewHolder.bind(getItem(i));

    }

    @Override
    public int getItemViewType(int position) {
        if (hasExtraRow() && position == getItemCount() - 1) {
            return TYPE_PROGRESS;
        } else {
            return TYPE_ITEM;
        }
    }

    private boolean hasExtraRow() {
        if (networkState != null && networkState != NetworkState.LOADED) {
            return true;
        } else {
            return false;
        }
    }

    public void setNetworkState(NetworkState newNetworkState) {
        NetworkState previousState = this.networkState;
        boolean previousExtraRow = hasExtraRow();
        this.networkState = newNetworkState;
        boolean newExtraRow = hasExtraRow();
        if (previousExtraRow != newExtraRow) {
            if (previousExtraRow) {
                notifyItemRemoved(getItemCount());
            } else {
                notifyItemInserted(getItemCount());
            }
        } else if (newExtraRow && previousState != newNetworkState) {
            notifyItemChanged(getItemCount() - 1);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_brand_iv_image);

        }

        public void bind(Brand brand) {
            ActivityUtils.loadImage(imageView, brand.getImageUrl());
        }
    }
}
