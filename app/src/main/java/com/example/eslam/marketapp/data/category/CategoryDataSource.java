package com.example.eslam.marketapp.data.category;

import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.PageKeyedDataSource;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.NonNull;

import com.example.eslam.marketapp.pojo.Brand;
import com.example.eslam.marketapp.pojo.Category;
import com.example.eslam.marketapp.utils.DummyData;
import com.example.eslam.marketapp.utils.NetworkState;

public class CategoryDataSource extends PageKeyedDataSource<Long, Category> {

    private MutableLiveData<NetworkState> networkState;
    private MutableLiveData initialLoading;

    public CategoryDataSource() {
        networkState = new MutableLiveData<NetworkState>();
        initialLoading = new MutableLiveData();
    }

    @Override
    public void loadInitial(@NonNull LoadInitialParams<Long> params, @NonNull final LoadInitialCallback<Long, Category> callback) {

        initialLoading.postValue(NetworkState.LOADING);
        networkState.postValue(NetworkState.LOADING);

        initialLoading.postValue(NetworkState.LOADED);
        networkState.postValue(NetworkState.LOADED);
        callback.onResult(DummyData.getCategories(1), null, 1L);

    }


    @Override
    public void loadBefore(@NonNull LoadParams<Long> params, @NonNull LoadCallback<Long, Category> callback) {

    }


    @Override
    public void loadAfter(@NonNull LoadParams<Long> params, @NonNull LoadCallback<Long, Category> callback) {
        networkState.postValue(NetworkState.LOADING);
        SystemClock.sleep(5000);
        long nextKey =  params.key+1;
        networkState.postValue(NetworkState.LOADED);
        callback.onResult(DummyData.getCategories(nextKey),nextKey);

    }

    public MutableLiveData getNetworkState() {
        return networkState;
    }

    public MutableLiveData getInitialLoading() {
        return initialLoading;
    }

}
