package com.example.eslam.marketapp.ui.home;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.paging.PagedList;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.eslam.marketapp.R;
import com.example.eslam.marketapp.helpers.StartSnapHelper;
import com.example.eslam.marketapp.pojo.Brand;
import com.example.eslam.marketapp.pojo.Category;
import com.example.eslam.marketapp.utils.NetworkState;
import com.example.eslam.marketapp.utils.ViewModelFactory;

import java.util.List;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    HomeViewModel mViewModel;
    BrandAdapter mBrandAdapter;
    CategoryAdapter mCategoryAdapter;
    ImageView previousImageView;
    ImageView nextImageView;
    RecyclerView brandsRecyclerView;

    GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3,
            GridLayoutManager.HORIZONTAL, false);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewModel = ViewModelProviders.of(this, ViewModelFactory.getInstance()).get(HomeViewModel.class);
        mBrandAdapter = new BrandAdapter();
        mCategoryAdapter = new CategoryAdapter();


        setupUi();
        setupObservers();
    }

    private void setupUi() {

        previousImageView = findViewById(R.id.home_iv_prev);
        nextImageView = findViewById(R.id.home_iv_next);
        nextImageView.setOnClickListener(this);
        previousImageView.setOnClickListener(this);

        brandsRecyclerView = findViewById(R.id.home_rv_brands);
        brandsRecyclerView.setLayoutManager(gridLayoutManager);
        brandsRecyclerView.setAdapter(mBrandAdapter);
        StartSnapHelper snapHelper = new StartSnapHelper();
        snapHelper.attachToRecyclerView(brandsRecyclerView);

        RecyclerView categoriesRecyclerView = findViewById(R.id.home_rv_category);
        categoriesRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        categoriesRecyclerView.setAdapter(mCategoryAdapter);
    }

    private void setupObservers() {
        mViewModel.getBrandsList().observe(this, new Observer<PagedList<Brand>>() {
            @Override
            public void onChanged(@Nullable PagedList<Brand> brands) {
                mBrandAdapter.submitList(brands);
            }
        });
        mViewModel.getCategoriesList().observe(this, new Observer<PagedList<Category>>() {
            @Override
            public void onChanged(@Nullable PagedList<Category> categories) {
                mCategoryAdapter.submitList(categories);
            }
        });

        mViewModel.getCategoryNetworkState().observe(this, new Observer<NetworkState>() {
            @Override
            public void onChanged(@Nullable NetworkState networkState) {
                mCategoryAdapter.setNetworkState(networkState);
            }
        });

        mViewModel.getCategoryNetworkState().observe(this, new Observer<NetworkState>() {
            @Override
            public void onChanged(@Nullable NetworkState networkState) {
                mBrandAdapter.setNetworkState(networkState);
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.home_iv_next:
                brandsRecyclerView.smoothScrollToPosition(gridLayoutManager.findLastVisibleItemPosition() + 1);
                break;
            case R.id.home_iv_prev:
                int newPosition = gridLayoutManager.findFirstVisibleItemPosition() - 1;
                if (newPosition >=0)
                    brandsRecyclerView.smoothScrollToPosition(newPosition);
                break;
        }
    }
}
