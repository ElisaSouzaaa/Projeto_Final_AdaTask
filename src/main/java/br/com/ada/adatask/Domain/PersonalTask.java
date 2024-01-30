package br.com.ada.adatask.Domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PersonalTask <T> extends BaseTask{
    private String category;

    public PersonalTask(int id, String title, String description, int priority, LocalDateTime createdAt, LocalDate deadLine, String category) {
        super(id, title, description, priority, createdAt, deadLine);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}


