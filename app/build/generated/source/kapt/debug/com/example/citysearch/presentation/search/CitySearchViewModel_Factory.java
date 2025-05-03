package com.example.citysearch.presentation.search;

import com.example.citysearch.domain.usecase.SearchCitiesUseCase;
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
public final class CitySearchViewModel_Factory implements Factory<CitySearchViewModel> {
  private final Provider<SearchCitiesUseCase> searchCitiesUseCaseProvider;

  public CitySearchViewModel_Factory(Provider<SearchCitiesUseCase> searchCitiesUseCaseProvider) {
    this.searchCitiesUseCaseProvider = searchCitiesUseCaseProvider;
  }

  @Override
  public CitySearchViewModel get() {
    return newInstance(searchCitiesUseCaseProvider.get());
  }

  public static CitySearchViewModel_Factory create(
      Provider<SearchCitiesUseCase> searchCitiesUseCaseProvider) {
    return new CitySearchViewModel_Factory(searchCitiesUseCaseProvider);
  }

  public static CitySearchViewModel newInstance(SearchCitiesUseCase searchCitiesUseCase) {
    return new CitySearchViewModel(searchCitiesUseCase);
  }
}
