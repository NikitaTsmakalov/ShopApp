package com.example.shopapp.di

import android.app.Application
import androidx.room.Room
import com.example.shopapp.data.AddItemRepository
import com.example.shopapp.data.AddItemRepositoryImpl
import com.example.shopapp.data.MainDb
import com.example.shopapp.data.NoteRepository
import com.example.shopapp.data.NoteRepositoryImpl
import com.example.shopapp.data.ShoppingListRepository
import com.example.shopapp.data.ShoppingListRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton

    fun provideMainDb(app: Application): MainDb{
        return Room.databaseBuilder(
            app,
            MainDb::class.java,
            "shop_list"
            ).build()
    }

    @Provides
    @Singleton
    fun provideShopRepository(db: MainDb): ShoppingListRepository{
        return ShoppingListRepositoryImpl(db.shoppingListDao)
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: MainDb): NoteRepository{
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideAddItemRepository(db: MainDb): AddItemRepository{
        return AddItemRepositoryImpl(db.addItemDao)
    }
}