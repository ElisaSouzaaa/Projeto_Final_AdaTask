package br.com.ada.adatask.Repository;

import br.com.ada.adatask.Domain.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public class TaskRepositoryImpl<T extends BaseEntity> implements TaskRepository<T> {
    private List<T> taskList = new ArrayList<>();

    @Override
    public void createTask(T task) {

        taskList.add(task);
    }

    @Override
    public void updateTask(T task) {
        int index = taskList.indexOf(task);
        if(index != -1){
            taskList.set(index, task);
        }
    }

    @Override
    public void removeTask(int id) {
        taskList.removeIf(task -> task.getId() == id);
    }

    @Override
    public T getTaskById(int id) {
        for(T task : taskList) {
            if(task.getId() == id){
                return task;
            }
        }
        return null;
    }

    @Override
    public List<T> getAllTasks() {
        return taskList;
    }
}