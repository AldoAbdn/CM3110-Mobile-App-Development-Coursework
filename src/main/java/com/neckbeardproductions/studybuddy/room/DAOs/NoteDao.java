package com.neckbeardproductions.studybuddy.room.DAOs;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.neckbeardproductions.studybuddy.room.Entities.Note;

/**
 * Created by Alistair on 10/11/2017.
 * Room Persistence Library Data Access Object for note
 */

@Dao
public interface NoteDao {

    @Query("SELECT * FROM note WHERE id LIKE :id")
    Note getById(long id);

    @Insert
    void insert(Note note);

    @Update
    void update(Note note);

    @Delete
    void delete(Note note);
}
