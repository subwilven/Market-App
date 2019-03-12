package com.example.eslam.marketapp.ui.home;

import android.arch.paging.PagedListAdapter;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eslam.marketapp.R;
import com.example.eslam.marketapp.pojo.Category;
import com.example.eslam.marketapp.utils.ActivityUtils;
import com.example.eslam.marketapp.utils.NetworkState;

public class CategoryAdapter extends PagedListAdapter<Category, RecyclerView.ViewHolder> {

    private static final int TYPE_PROGRESS = 0;
    private static final int TYPE_ITEM = 1;

    private NetworkState networkState;

    public CategoryAdapter() {
        super(Category.DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        switch (i) {
            case TYPE_PROGRESS:
                View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_category_progress, viewGroup, false);
                return new ViewHolder(view);
            default:
                View view1 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_category, viewGroup, false);
                return new ViewHolder(view1);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == TYPE_ITEM) {
            ((ViewHolder) viewHolder).bind(getItem(i));
        }
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
        private final TextView titleTextView;
        private final ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.item_category_tv_title);
            imageView = itemView.findViewById(R.id.item_category_iv_image);
        }

        public void bind(Category category) {
            titleTextView.setText(category.getTitle());
            ActivityUtils.loadImage(imageView, category.getImageUrl());
        }
    }
}
