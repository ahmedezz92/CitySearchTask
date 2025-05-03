package com.example.citysearch.data.source.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/citysearch/data/source/local/CityLocalDataSource;", "", "context", "Landroid/content/Context;", "jsonParser", "Lcom/example/citysearch/data/util/JsonParser;", "(Landroid/content/Context;Lcom/example/citysearch/data/util/JsonParser;)V", "getCities", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/citysearch/data/source/model/CityEntity;", "app_debug"})
public final class CityLocalDataSource {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.citysearch.data.util.JsonParser jsonParser = null;
    
    @javax.inject.Inject()
    public CityLocalDataSource(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.citysearch.data.util.JsonParser jsonParser) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.citysearch.data.source.model.CityEntity>> getCities() {
        return null;
    }
}