package persistence.daoimpl;

import core.dao.NoteDao;
import core.entity.Note;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class NoteDaoImpl extends BaseDaoImpl<Note> implements NoteDao {

    @SuppressWarnings("unchecked")
    public List<Note> getAll() {
        return sessionFactory.getCurrentSession()
                .createCriteria(Note.class)
                .list();
    }

    public Note getById(int id) {
        return getSession().load(Note.class, id);
    }


    @SuppressWarnings("unchecked")
    public Note getByName(String name) {
        List<Note> brands = getSession().createCriteria(Note.class).list();
        for (Note brand : brands) {
            if ( brand.getName().toLowerCase().equals(name.toLowerCase().trim()) )
                return brand;
        }
        return null;
    }

    public Note getNoteByName(String name) {
        return getSession().load(Note.class, name);
    }
}