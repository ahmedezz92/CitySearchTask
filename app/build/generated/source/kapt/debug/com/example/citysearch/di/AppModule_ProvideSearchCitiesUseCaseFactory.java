package com.example.citysearch.di;

import com.example.citysearch.domain.repository.CityRepository;
import com.example.citysearch.domain.usecase.SearchCitiesUseCase;
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
public final class AppModule_ProvideSearchCitiesUseCaseFactory implements Factory<SearchCitiesUseCase> {
  private final Provider<CityRepository> repositoryProvider;

  public AppModule_ProvideSearchCitiesUseCaseFactory(Provider<CityRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SearchCitiesUseCase get() {
    return provideSearchCitiesUseCase(repositoryProvider.get());
  }

  public static AppModule_ProvideSearchCitiesUseCaseFactory create(
      Provider<CityRepository> repositoryProvider) {
    return new AppModule_ProvideSearchCitiesUseCaseFactory(repositoryProvider);
  }

  public static SearchCitiesUseCase provideSearchCitiesUseCase(CityRepository repository) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSearchCitiesUseCase(repository));
  }
}
