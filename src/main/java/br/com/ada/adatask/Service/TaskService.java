package br.com.ada.adatask.Service;

import br.com.ada.adatask.Domain.BaseEntity;

import java.util.List;

public interface TaskService<T extends BaseEntity> {

    void createTask(T task);

    void removeTask(int id);

    void updateTask(T task);

    T getTaskById(int id);

    List<T> getAllTasks();
}