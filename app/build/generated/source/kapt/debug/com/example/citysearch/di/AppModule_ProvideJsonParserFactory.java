package com.example.citysearch.di;

import com.example.citysearch.data.util.JsonParser;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AppModule_ProvideJsonParserFactory implements Factory<JsonParser> {
  @Override
  public JsonParser get() {
    return provideJsonParser();
  }

  public static AppModule_ProvideJsonParserFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static JsonParser provideJsonParser() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideJsonParser());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideJsonParserFactory INSTANCE = new AppModule_ProvideJsonParserFactory();
  }
}
