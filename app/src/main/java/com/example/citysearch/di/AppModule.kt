package com.example.citysearch.di

import android.content.Context
import com.example.citysearch.data.repository.CityRepositoryImpl
import com.example.citysearch.data.source.local.CityLocalDataSource
import com.example.citysearch.data.util.JsonParser
import com.example.citysearch.domain.repository.CityRepository
import com.example.citysearch.domain.usecase.SearchCitiesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideJsonParser(): JsonParser {
        return JsonParser()
    }

    @Provides
    @Singleton
    fun provideCityLocalDataSource(
        @ApplicationContext context: Context,
        jsonParser: JsonParser
    ): CityLocalDataSource {
        return CityLocalDataSource(context, jsonParser)
    }

    @Provides
    @Singleton
    fun provideCityRepository(localDataSource: CityLocalDataSource): CityRepository {
        return CityRepositoryImpl(localDataSource)
    }

    @Provides
    @Singleton
    fun provideSearchCitiesUseCase(repository: CityRepository): SearchCitiesUseCase {
        return SearchCitiesUseCase(repository)
    }
}