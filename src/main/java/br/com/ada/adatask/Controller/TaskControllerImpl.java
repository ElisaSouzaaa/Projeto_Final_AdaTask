package br.com.ada.adatask.Controller;

import br.com.ada.adatask.Domain.BaseTask;
import br.com.ada.adatask.Service.TaskService;

import java.util.List;

public class TaskControllerImpl implements TaskController{
    private TaskService<BaseTask> taskService;
    public TaskControllerImpl(TaskService<BaseTask> taskService){
        this.taskService = taskService;
    }

    @Override
    public void createTask() {

    }

    @Override
    public void createTask(BaseTask task) {
        taskService.createTask(task);
    }

    @Override
    public void updateTask() {

    }

    @Override
    public void updateTask(BaseTask task) {
        taskService.updateTask(task);
    }

    @Override
    public void removeTask() {

    }

    @Override
    public void removeTask(BaseTask task) {

    }

    @Override
    public void removeTask(int id) {
        taskService.removeTask(id);
    }

    @Override
    public void viewAllTasks() {
        List<BaseTask> tasks = taskService.getAllTasks();
        if(tasks != null) {
            for (BaseTask task : tasks){
                System.out.println(task.getTitle() + ": " + task.getDescription());
            }
        }else {
            System.out.println("Any task was registered yet");
        }

        System.out.println("If you need to see more info, please select the specific task by id");
    }

    @Override
    public void viewTaskById(int id) {
        BaseTask task = taskService.getTaskById(id);
        if(task != null){
            System.out.println(task.getTitle() + "\n" + task.getDescription() + "\n" + task.getPriority() + "\n" + task.getCreatedAt() + "\n" + task.getDeadLine());
        }else {
            System.out.println("ERROR: Task not found");
        }
    }
}