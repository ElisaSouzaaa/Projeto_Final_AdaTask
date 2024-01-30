package br.com.ada.adatask.Domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class StudyTask extends BaseTask{
    private String subject;

    public StudyTask(int id, String title, String description, int priority, LocalDateTime createdAt, LocalDate deadLine, String subject) {
        super(id, title, description, priority, createdAt, deadLine);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
