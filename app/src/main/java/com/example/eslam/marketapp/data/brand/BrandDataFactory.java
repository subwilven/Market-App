package com.example.eslam.marketapp.data.brand;

import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.DataSource;

import com.example.eslam.marketapp.data.category.CategoryDataSource;

public class BrandDataFactory extends DataSource.Factory {

    private MutableLiveData<BrandDataSource> mutableLiveData;
    private BrandDataSource brandDataSource;

    public BrandDataFactory() {
        this.mutableLiveData = new MutableLiveData<BrandDataSource>();
    }

    @Override
    public DataSource create() {
        brandDataSource = new BrandDataSource();
        mutableLiveData.postValue(brandDataSource);
        return brandDataSource;
    }

    public MutableLiveData<BrandDataSource> getMutableLiveData() {
        return mutableLiveData;
    }
}