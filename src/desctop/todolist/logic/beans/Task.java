package desctop.todolist.logic.beans;

import desctop.todolist.logic.enums.Priority;
import desctop.todolist.logic.enums.Status;

public class Task {

    private String text;
    private String startDate;
    private String endDate;
    private Priority priority;
    private Status status;

    public Task(String text, String startDate, String endDate, Priority priority, Status status) {
        this.text = text;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priority = priority;
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
