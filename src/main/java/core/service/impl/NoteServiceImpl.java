package core.service.impl;

import core.dao.NoteDao;
import core.entity.Note;
import core.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteDao noteDao;

    public NoteServiceImpl(NoteDao noteDao) {
        this.noteDao = noteDao;
    }

    public void addNote(Note note) {
        this.noteDao.add(note);
    }

    public Note getNoteByName(String name) {
        return this.noteDao.getNoteByName(name);
    }

    public Note getNoteById(int id) {
        return this.noteDao.getById(id);
    }

    public List<Note> getAllNotes() {
        return this.noteDao.getAll();
    }

    public void removeNote(Note note) {
        this.noteDao.delete(note);
    }
}