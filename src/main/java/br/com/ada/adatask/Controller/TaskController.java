package br.com.ada.adatask.Controller;

import br.com.ada.adatask.Domain.BaseTask;

public interface TaskController{
    void createTask();

    void createTask(BaseTask task);

    void updateTask();

    void updateTask(BaseTask task);

    void removeTask();

    void removeTask(BaseTask task);

    void removeTask(int id);

    void viewAllTasks();
    void viewTaskById(int id);
}
