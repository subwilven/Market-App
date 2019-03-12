package com.example.eslam.marketapp.data;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.LivePagedListBuilder;
import android.arch.paging.PagedList;

import com.example.eslam.marketapp.data.brand.BrandDataFactory;
import com.example.eslam.marketapp.data.category.CategoryDataFactory;
import com.example.eslam.marketapp.pojo.Brand;
import com.example.eslam.marketapp.pojo.Category;
import com.example.eslam.marketapp.utils.DummyData;

import java.util.List;
import java.util.concurrent.Executors;

public class Repository {
    private static final Repository ourInstance = new Repository();

    public static Repository getInstance() {
        return ourInstance;
    }
    public CategoryDataFactory categoryDataFactory;
    public BrandDataFactory brandDataFactory;
    private Repository() {
    }

    public LiveData<PagedList<Category>> getCategories(){
        categoryDataFactory = new CategoryDataFactory();

        PagedList.Config pagedListConfig =
                new PagedList.Config.Builder()
                        .setEnablePlaceholders(true)
                        .setInitialLoadSizeHint(2)
                        .setPageSize(10).build();

         return new LivePagedListBuilder(categoryDataFactory, pagedListConfig)
                .setFetchExecutor(Executors.newFixedThreadPool(5))
                .build();
    }
    public LiveData<PagedList<Brand>> fetchBrands() {
        brandDataFactory = new BrandDataFactory();

        PagedList.Config pagedListConfig =
                new PagedList.Config.Builder()
                        .setEnablePlaceholders(true)
                        .setInitialLoadSizeHint(2)
                        .setPageSize(15).build();

        return new LivePagedListBuilder(brandDataFactory, pagedListConfig)
                .setFetchExecutor(Executors.newFixedThreadPool(5))
                .build();
    }
}
