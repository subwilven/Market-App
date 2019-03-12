package com.example.eslam.marketapp.utils;

import android.widget.ImageView;

import com.example.eslam.marketapp.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

public final class ActivityUtils {

    private ActivityUtils() {
    }


    public static void loadImage(ImageView imageView,
                                 String Url) {
        if (Url != null && !Url.isEmpty()) {
            RequestCreator creator = initPicasso(Url);
            creator.into(imageView);
        }
    }

    private static RequestCreator initPicasso(String Url) {

        RequestCreator creator = Picasso.get().load(Url);
        creator.placeholder(R.drawable.placeholder);
        creator.error(R.drawable.placeholder);
        creator.resize(200,200);
        return creator;
    }
}
