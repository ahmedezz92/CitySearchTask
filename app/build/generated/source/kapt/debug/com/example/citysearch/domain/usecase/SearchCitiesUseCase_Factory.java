package com.example.citysearch.domain.usecase;

import com.example.citysearch.domain.repository.CityRepository;
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
public final class SearchCitiesUseCase_Factory implements Factory<SearchCitiesUseCase> {
  private final Provider<CityRepository> repositoryProvider;

  public SearchCitiesUseCase_Factory(Provider<CityRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SearchCitiesUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static SearchCitiesUseCase_Factory create(Provider<CityRepository> repositoryProvider) {
    return new SearchCitiesUseCase_Factory(repositoryProvider);
  }

  public static SearchCitiesUseCase newInstance(CityRepository repository) {
    return new SearchCitiesUseCase(repository);
  }
}
