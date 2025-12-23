package com.example.shopapp.data

import kotlinx.coroutines.flow.Flow

class ShoppingListRepositoryImpl(
    private val dao: ShoppingListDao
): ShoppingListRepository {
    override suspend fun insertItem(item: ShoppingListItem) {
        dao.insertItem(item = item)
    }

    override suspend fun deleteItem(item: ShoppingListItem) {
        dao.deleteItem(item = item)
    }

    override fun getAllItems(): Flow<List<ShoppingListItem>> {
        return dao.getAllItems()
    }
}