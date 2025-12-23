package com.example.shopapp.data

import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao
): NoteRepository {
    override suspend fun insertItem(item: NoteItem) {
        dao.insertItem(item = item)
    }

    override suspend fun deleteItem(item: NoteItem) {
        dao.deleteItem(item = item)
    }

    override fun getAllItems(): Flow<List<NoteItem>> {
        return dao.getAllItems()
    }

    override suspend fun getNoteItemById(id: Int): NoteItem {
        return dao.getNoteItemById(id = id)
    }
}