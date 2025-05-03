package com.example.citysearch.di;

import com.example.citysearch.data.source.local.CityLocalDataSource;
import com.example.citysearch.domain.repository.CityRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideCityRepositoryFactory implements Factory<CityRepository> {
  private final Provider<CityLocalDataSource> localDataSourceProvider;

  public AppModule_ProvideCityRepositoryFactory(
      Provider<CityLocalDataSource> localDataSourceProvider) {
    this.localDataSourceProvider = localDataSourceProvider;
  }

  @Override
  public CityRepository get() {
    return provideCityRepository(localDataSourceProvider.get());
  }

  public static AppModule_ProvideCityRepositoryFactory create(
      Provider<CityLocalDataSource> localDataSourceProvider) {
    return new AppModule_ProvideCityRepositoryFactory(localDataSourceProvider);
  }

  public static CityRepository provideCityRepository(CityLocalDataSource localDataSource) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideCityRepository(localDataSource));
  }
}
