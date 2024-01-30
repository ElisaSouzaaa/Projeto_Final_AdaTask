package br.com.ada.adatask;

import br.com.ada.adatask.Controller.TaskController;
import br.com.ada.adatask.Controller.TaskControllerImpl;
import br.com.ada.adatask.Domain.BaseTask;
import br.com.ada.adatask.Repository.TaskRepository;
import br.com.ada.adatask.Repository.TaskRepositoryImpl;
import br.com.ada.adatask.Service.Menu;
import br.com.ada.adatask.Service.TaskService;
import br.com.ada.adatask.Service.TaskServiceImpl;

import java.util.Scanner;

import static br.com.ada.adatask.Service.Menu.*;

public class Main {
    public static void main(String[] args) {
        TaskRepository<BaseTask> taskRepository = new TaskRepositoryImpl<>();
        TaskService<BaseTask> taskService = new TaskServiceImpl<>(taskRepository);
        TaskController taskController = new TaskControllerImpl(taskService);


        Scanner scan = new Scanner(System.in);
        int answer;

        System.out.println("Welcome to your tasks!");
        do {
            System.out.println("What do you want to do?");
            System.out.println("1 - create task / 2 - view all tasks / 3 - view for id / 0 - exit");
            answer = scan.nextInt();

            if (answer == 1) {
                System.out.println("Ok! Creating a task right now:");
                System.out.println("1 - Personal task / 2 - Study Task / 3 - Work Task");
                int category = scan.nextInt();
                scan.nextLine();

                BaseTask task = null;
                switch (category) {
                    case 1:
                        task = createPersonalTask(scan);
                        break;
                    case 2:
                        task = createStudyTask(scan);
                        break;
                    case 3:
                        task = createWorkTask(scan);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }

                if (task != null) {
                    taskController.createTask(task);
                    System.out.println("Task created successfully");
                }
            } else if (answer == 2) {
                System.out.println("Ok! Showing all tasks:");
                taskController.viewAllTasks();
            } else if (answer == 3) {
                System.out.println("Ok! Please enter the Task ID: ");
                int id = scan.nextInt();
                taskController.viewTaskById(id);
            }
        } while (answer != 0);
    }
}