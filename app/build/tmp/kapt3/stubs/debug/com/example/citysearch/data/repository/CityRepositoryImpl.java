package com.example.citysearch.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/citysearch/data/repository/CityRepositoryImpl;", "Lcom/example/citysearch/domain/repository/CityRepository;", "localDataSource", "Lcom/example/citysearch/data/source/local/CityLocalDataSource;", "(Lcom/example/citysearch/data/source/local/CityLocalDataSource;)V", "getCities", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/citysearch/domain/model/City;", "searchCities", "prefix", "", "app_debug"})
public final class CityRepositoryImpl implements com.example.citysearch.domain.repository.CityRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.citysearch.data.source.local.CityLocalDataSource localDataSource = null;
    
    @javax.inject.Inject()
    public CityRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.citysearch.data.source.local.CityLocalDataSource localDataSource) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.citysearch.domain.model.City>> getCities() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.citysearch.domain.model.City>> searchCities(@org.jetbrains.annotations.NotNull()
    java.lang.String prefix) {
        return null;
    }
}