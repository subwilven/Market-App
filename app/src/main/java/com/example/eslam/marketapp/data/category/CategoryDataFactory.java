package com.example.eslam.marketapp.data.category;

import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.DataSource;

public class CategoryDataFactory extends DataSource.Factory {

    private MutableLiveData<CategoryDataSource> mutableLiveData;
    private CategoryDataSource categoryDataSource;

    public CategoryDataFactory() {
        this.mutableLiveData = new MutableLiveData<CategoryDataSource>();
    }

    @Override
    public DataSource create() {
        categoryDataSource = new CategoryDataSource();
        mutableLiveData.postValue(categoryDataSource);
        return categoryDataSource;
    }

    public MutableLiveData<CategoryDataSource> getMutableLiveData() {
        return mutableLiveData;
    }
}
