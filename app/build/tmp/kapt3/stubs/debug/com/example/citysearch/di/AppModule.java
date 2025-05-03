package com.example.citysearch.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/example/citysearch/di/AppModule;", "", "()V", "provideCityLocalDataSource", "Lcom/example/citysearch/data/source/local/CityLocalDataSource;", "context", "Landroid/content/Context;", "jsonParser", "Lcom/example/citysearch/data/util/JsonParser;", "provideCityRepository", "Lcom/example/citysearch/domain/repository/CityRepository;", "localDataSource", "provideJsonParser", "provideSearchCitiesUseCase", "Lcom/example/citysearch/domain/usecase/SearchCitiesUseCase;", "repository", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.citysearch.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.citysearch.data.util.JsonParser provideJsonParser() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.citysearch.data.source.local.CityLocalDataSource provideCityLocalDataSource(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.citysearch.data.util.JsonParser jsonParser) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.citysearch.domain.repository.CityRepository provideCityRepository(@org.jetbrains.annotations.NotNull()
    com.example.citysearch.data.source.local.CityLocalDataSource localDataSource) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.citysearch.domain.usecase.SearchCitiesUseCase provideSearchCitiesUseCase(@org.jetbrains.annotations.NotNull()
    com.example.citysearch.domain.repository.CityRepository repository) {
        return null;
    }
}