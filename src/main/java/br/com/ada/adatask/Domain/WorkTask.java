package br.com.ada.adatask.Domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WorkTask extends BaseTask{
    private String project;

    public WorkTask(int id, String title, String description, int priority, LocalDateTime createdAt, LocalDate deadLine, String project) {
        super(id, title, description, priority, createdAt, deadLine);
        this.project = project;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
