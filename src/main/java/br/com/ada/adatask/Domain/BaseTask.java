package br.com.ada.adatask.Domain;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class BaseTask implements BaseEntity{
    private int id;
    private String title;
    private String description;
    private int priority;
    private LocalDateTime createdAt;
    private LocalDate deadLine;

    public BaseTask(int id, String title, String description, int priority, LocalDateTime createdAt, LocalDate deadLine){
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.createdAt = LocalDateTime.now();
        this.deadLine = deadLine;
    }

    public BaseTask(String title, String description) {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }
}
