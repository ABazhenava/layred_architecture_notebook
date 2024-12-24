package java_layred_architecture_notebook_02.src.edu.examples.java_classes.dao.impl;

import java.util.List;

import edu.examples.java_classes.dao.NoteBookDao;
import edu.examples.java_classes.entity.Note;
import java_layred_architecture_notebook_01.src.edu.examples.java_classes.entity.Note;

public class FileNoteBookDao implements NoteBookDao {

    private List<Note> notes;

    public NoteBook() {

        notes = new ArrayList<>();
        initializeNotes();
    }

    private void initializeNotes() {
        notes.add(new Note(1, "Подобрать материалы", "JAva - Layred architecture", new Date()));
        notes.add(new Note(2, "Лечение", "Записаться к стомотологу", new Date()));
        notes.add(new Note(3, "Отдых", "Сходить в бассейн", new Date()));
        notes.add(new Note(4, "Отдых", "Позаниматься в спорт. зале", new Date()));
        notes.add(new Note(5, "Продукты", "Закупиться продуктами", new Date()));
    }

    public static void add(Note n) {
        notes.add(n);
    }

    public static List<Note> get() {
        return notes;
    }

    @Override
    public void save(Note n) {
        add(n);
    }

    @Override
    public List<Note> allNotes() {
        return get();
    }

}
