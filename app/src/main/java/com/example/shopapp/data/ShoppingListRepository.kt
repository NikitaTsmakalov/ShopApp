package com.example.shopapp.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface ShoppingListRepository {

    suspend fun insertItem(item: ShoppingListItem)
    suspend fun deleteItem(item: ShoppingListItem)
    fun getAllItems(): Flow<List<ShoppingListItem>>
}