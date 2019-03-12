package com.example.eslam.marketapp.pojo;

import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;

public class Brand {
    private String imageUrl;

    public static DiffUtil.ItemCallback<Brand> DIFF_CALLBACK = new DiffUtil.ItemCallback<Brand>() {
        @Override
        public boolean areItemsTheSame(@NonNull Brand oldItem, @NonNull Brand newItem) {
            return false;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Brand oldItem, @NonNull Brand newItem) {
            return false;
        }
    };

    public Brand(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
