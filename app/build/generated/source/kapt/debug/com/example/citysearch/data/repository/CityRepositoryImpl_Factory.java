package com.example.citysearch.data.repository;

import com.example.citysearch.data.source.local.CityLocalDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class CityRepositoryImpl_Factory implements Factory<CityRepositoryImpl> {
  private final Provider<CityLocalDataSource> localDataSourceProvider;

  public CityRepositoryImpl_Factory(Provider<CityLocalDataSource> localDataSourceProvider) {
    this.localDataSourceProvider = localDataSourceProvider;
  }

  @Override
  public CityRepositoryImpl get() {
    return newInstance(localDataSourceProvider.get());
  }

  public static CityRepositoryImpl_Factory create(
      Provider<CityLocalDataSource> localDataSourceProvider) {
    return new CityRepositoryImpl_Factory(localDataSourceProvider);
  }

  public static CityRepositoryImpl newInstance(CityLocalDataSource localDataSource) {
    return new CityRepositoryImpl(localDataSource);
  }
}
