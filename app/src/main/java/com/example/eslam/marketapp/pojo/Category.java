package com.example.eslam.marketapp.pojo;

import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;

public class Category {
    private String imageUrl;
    private String title;

    public Category(String imageUrl, String title) {
        this.imageUrl = imageUrl;
        this.title = title;
    }

    public static DiffUtil.ItemCallback<Category> DIFF_CALLBACK = new DiffUtil.ItemCallback<Category>() {
        @Override
        public boolean areItemsTheSame(@NonNull Category oldItem, @NonNull Category newItem) {
            return false;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Category oldItem, @NonNull Category newItem) {
            return false;
        }
    };


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
