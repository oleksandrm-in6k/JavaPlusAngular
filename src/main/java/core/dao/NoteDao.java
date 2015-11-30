package core.dao;

import core.entity.Note;

/**
 * Created by employee on 11/30/15.
 */
public interface NoteDao extends BaseDao<Note> {
    Note getNoteByName(String name);
}
