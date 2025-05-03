package com.example.citysearch.data.util;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class JsonParser_Factory implements Factory<JsonParser> {
  @Override
  public JsonParser get() {
    return newInstance();
  }

  public static JsonParser_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static JsonParser newInstance() {
    return new JsonParser();
  }

  private static final class InstanceHolder {
    private static final JsonParser_Factory INSTANCE = new JsonParser_Factory();
  }
}
