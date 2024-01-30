package br.com.ada.adatask.Service;

import br.com.ada.adatask.Domain.BaseEntity;
import br.com.ada.adatask.Repository.TaskRepository;

import java.util.List;

public class TaskServiceImpl<T extends BaseEntity> implements TaskService<T> {
    private TaskRepository<T> taskRepository;
    public TaskServiceImpl(TaskRepository<T> taskRepository){
        this.taskRepository = taskRepository;
    }

    @Override
    public void createTask(T task) {
        taskRepository.createTask(task);
    }

    @Override
    public void removeTask(int id) {
        taskRepository.removeTask(id);
    }

    @Override
    public void updateTask(T task) {
        taskRepository.updateTask(task);
    }

    @Override
    public T getTaskById(int id) {
        return taskRepository.getTaskById(id);
    }

    @Override
    public List<T> getAllTasks() {
        return taskRepository.getAllTasks();
    }
}
