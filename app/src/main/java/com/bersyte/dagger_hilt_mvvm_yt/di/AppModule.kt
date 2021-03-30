package com.bersyte.dagger_hilt_mvvm_yt.di

import android.content.Context
import androidx.room.Room
import com.bersyte.dagger_hilt_mvvm_yt.db.ToDoDatabase
import com.bersyte.dagger_hilt_mvvm_yt.utils.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideToDoDataBase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context, ToDoDatabase::class.java,
        DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideToDoDao(
        db: ToDoDatabase
    ) = db.toDoDao()

}