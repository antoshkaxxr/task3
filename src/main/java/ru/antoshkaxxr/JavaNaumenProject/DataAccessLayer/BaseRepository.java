package ru.antoshkaxxr.JavaNaumenProject.DataAccessLayer;

import java.util.List;

public interface BaseRepository<T, D> {
    void add(T entity);

    List<T> getInDate(D date);

    List<T> getInInterval(D from, D to);
}
