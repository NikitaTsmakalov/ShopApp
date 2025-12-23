package com.example.shopapp.data

import kotlinx.coroutines.flow.Flow

class AddItemRepositoryImpl(
    private val dao: AddItemDao
): AddItemRepository {
    override suspend fun insertItem(item: AddItem) {
        dao.insertItem(item = item)
    }

    override suspend fun deleteItem(item: AddItem) {
        dao.deleteItem(item = item)
    }

    override fun getAllItemsById(listId: Int): Flow<List<AddItem>> {
        return dao.getAllItemsById(listId = listId)
    }

    override suspend fun getListItemById(listId: Int): ShoppingListItem {
        return dao.getListItemById(listId = listId)
    }

    override suspend fun insertItem(item: ShoppingListItem) {
        dao.insertItem(item = item)
    }
}