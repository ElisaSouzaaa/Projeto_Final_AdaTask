package br.com.ada.adatask.Service;

import br.com.ada.adatask.Domain.BaseTask;
import br.com.ada.adatask.Domain.PersonalTask;
import br.com.ada.adatask.Domain.StudyTask;
import br.com.ada.adatask.Domain.WorkTask;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu {
    public static BaseTask createWorkTask(Scanner scan) {
        WorkTask workTask = new WorkTask(0, null,null,0,null,null,null);
        System.out.println("Title: ");
        workTask.setTitle(scan.nextLine());
        System.out.println("Description: ");
        workTask.setDescription(scan.nextLine());
        System.out.println("Priority: ");
        workTask.setPriority(scan.nextInt());
        System.out.println("Subject: ");
        workTask.setProject(scan.nextLine());
        workTask.setCreatedAt(LocalDateTime.now());
        System.out.println("Deadline (DD/MM/YYYY): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate deadline = LocalDate.parse(scan.nextLine(), formatter);
        workTask.setDeadLine(LocalDate.from(deadline.atStartOfDay()));
        return workTask;
    }

    public static BaseTask createStudyTask(Scanner scan) {
        StudyTask studyTask = new StudyTask(0, null, null,0,null,null,null);
        System.out.println("Title: ");
        studyTask.setTitle(scan.nextLine());
        System.out.println("Description: ");
        studyTask.setDescription(scan.nextLine());
        System.out.println("Priority: ");
        studyTask.setPriority(scan.nextInt());
        System.out.println("Subject: ");
        studyTask.setSubject(scan.nextLine());
        studyTask.setCreatedAt(LocalDateTime.now());
        System.out.println("Deadline (DD/MM/YYYY): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate deadline = LocalDate.parse(scan.nextLine(), formatter);
        studyTask.setDeadLine(LocalDate.from(deadline.atStartOfDay()));
        return studyTask;
    }

    public static BaseTask createPersonalTask(Scanner scan) {
        PersonalTask personalTask = new PersonalTask(0, null, null, 0, null, null, null);
        System.out.println("Title: ");
        personalTask.setTitle(scan.nextLine());
        System.out.println("Description: ");
        personalTask.setDescription(scan.nextLine());
        System.out.println("Priority: ");
        personalTask.setPriority(scan.nextInt());
        System.out.println("Category: ");
        scan.nextLine();
        personalTask.setCategory(scan.nextLine());
        personalTask.setCreatedAt(LocalDateTime.now());
        System.out.println("Deadline (DD/MM/YYYY): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate deadline = LocalDate.parse(scan.nextLine(), formatter);
        personalTask.setDeadLine(LocalDate.from(deadline.atStartOfDay()));
        return personalTask;
    }
}
