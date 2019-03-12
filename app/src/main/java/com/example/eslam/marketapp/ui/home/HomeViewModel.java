package com.example.eslam.marketapp.ui.home;

import android.arch.core.util.Function;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Transformations;
import android.arch.lifecycle.ViewModel;
import android.arch.paging.PagedList;

import com.example.eslam.marketapp.data.brand.BrandDataSource;
import com.example.eslam.marketapp.data.category.CategoryDataSource;
import com.example.eslam.marketapp.data.Repository;
import com.example.eslam.marketapp.pojo.Brand;
import com.example.eslam.marketapp.pojo.Category;
import com.example.eslam.marketapp.utils.NetworkState;

import java.util.List;

public class HomeViewModel extends ViewModel {

    private final Repository mRepository;
    private LiveData<NetworkState> brandNetworkState;
    private LiveData<PagedList<Brand>> brandsList;

    private LiveData<NetworkState> categoryNetworkState;
    private LiveData<PagedList<Category>> categoriesList;

    public HomeViewModel(Repository mRepository) {
        this.mRepository = mRepository;
        loadCategories();
        loadBrands();
    }

    private void loadBrands() {
        brandsList =  mRepository.fetchBrands();

        brandNetworkState = Transformations.switchMap(mRepository.brandDataFactory.getMutableLiveData(),
                new Function<BrandDataSource, LiveData<NetworkState>>() {
                    @Override
                    public LiveData<NetworkState> apply(BrandDataSource dataSource) {
                        return dataSource.getNetworkState();
                    }
                });
    }


    private void loadCategories() {

        categoriesList =  mRepository.getCategories();

        categoryNetworkState = Transformations.switchMap(mRepository.categoryDataFactory.getMutableLiveData(),
                new Function<CategoryDataSource, LiveData<NetworkState>>() {
                    @Override
                    public LiveData<NetworkState> apply(CategoryDataSource dataSource) {
                        return dataSource.getNetworkState();
                    }
                });

    }

    public LiveData<PagedList<Brand>> getBrandsList() {
        return brandsList;
    }

    public LiveData<PagedList<Category>> getCategoriesList() {
        return categoriesList;
    }

    public LiveData<NetworkState> getCategoryNetworkState() {
        return categoryNetworkState;
    }

    public LiveData<NetworkState> getBrandNetworkState() {
        return brandNetworkState;
    }
}
