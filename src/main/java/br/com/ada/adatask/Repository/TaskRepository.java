package br.com.ada.adatask.Repository;

import br.com.ada.adatask.Domain.BaseEntity;

import java.util.List;

public interface TaskRepository<T extends BaseEntity> {
   void createTask(T task);
   void updateTask(T task);
   void removeTask(int id);

   T getTaskById(int id);
   List<T> getAllTasks();
}
