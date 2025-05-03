package com.example.citysearch.data.source.local;

import android.content.Context;
import com.example.citysearch.data.util.JsonParser;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class CityLocalDataSource_Factory implements Factory<CityLocalDataSource> {
  private final Provider<Context> contextProvider;

  private final Provider<JsonParser> jsonParserProvider;

  public CityLocalDataSource_Factory(Provider<Context> contextProvider,
      Provider<JsonParser> jsonParserProvider) {
    this.contextProvider = contextProvider;
    this.jsonParserProvider = jsonParserProvider;
  }

  @Override
  public CityLocalDataSource get() {
    return newInstance(contextProvider.get(), jsonParserProvider.get());
  }

  public static CityLocalDataSource_Factory create(Provider<Context> contextProvider,
      Provider<JsonParser> jsonParserProvider) {
    return new CityLocalDataSource_Factory(contextProvider, jsonParserProvider);
  }

  public static CityLocalDataSource newInstance(Context context, JsonParser jsonParser) {
    return new CityLocalDataSource(context, jsonParser);
  }
}
