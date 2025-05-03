package com.example.citysearch.di;

import android.content.Context;
import com.example.citysearch.data.source.local.CityLocalDataSource;
import com.example.citysearch.data.util.JsonParser;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class AppModule_ProvideCityLocalDataSourceFactory implements Factory<CityLocalDataSource> {
  private final Provider<Context> contextProvider;

  private final Provider<JsonParser> jsonParserProvider;

  public AppModule_ProvideCityLocalDataSourceFactory(Provider<Context> contextProvider,
      Provider<JsonParser> jsonParserProvider) {
    this.contextProvider = contextProvider;
    this.jsonParserProvider = jsonParserProvider;
  }

  @Override
  public CityLocalDataSource get() {
    return provideCityLocalDataSource(contextProvider.get(), jsonParserProvider.get());
  }

  public static AppModule_ProvideCityLocalDataSourceFactory create(
      Provider<Context> contextProvider, Provider<JsonParser> jsonParserProvider) {
    return new AppModule_ProvideCityLocalDataSourceFactory(contextProvider, jsonParserProvider);
  }

  public static CityLocalDataSource provideCityLocalDataSource(Context context,
      JsonParser jsonParser) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideCityLocalDataSource(context, jsonParser));
  }
}
