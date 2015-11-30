package core.service;

import core.entity.Note;

import java.util.List;

public interface NoteService {

    void addNote(Note note);

    Note getNoteByName(String name);

    Note getNoteById(int id);

    List<Note> getAllNotes();

    void removeNote(Note brand);

}