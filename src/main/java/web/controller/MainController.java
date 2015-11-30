package web.controller;

import core.entity.Note;
import core.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")

public class MainController {

    @Autowired
    private NoteService noteService;

    public static List<Note> notes = new ArrayList<Note>();


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Note> index() {
        return noteService.getAllNotes();
    }


    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Note note) {
        noteService.addNote(note);
    }

}
