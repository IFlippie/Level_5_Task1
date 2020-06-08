package com.iflippie.level_5_task1

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.iflippie.level_5_task1.database.NoteRepository

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    private val noteRepository = NoteRepository(application.applicationContext)
    val note = noteRepository.getNotepad()
}