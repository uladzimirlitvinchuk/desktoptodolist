package desctop.todolist.logic.beans;

import desctop.todolist.logic.enums.Priority;
import desctop.todolist.logic.enums.Status;

public class Task {

    private int id;
    private String text;
    private String endDate;
    private Priority priority;
    private Status status;

    public Task(int id, String text, String endDate, Priority priority, Status status) {
        this.id = id;
        this.text = text;
        this.endDate = endDate;
        this.priority = priority;
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (id != task.id) return false;
        if (!text.equals(task.text)) return false;
        if (endDate != null ? !endDate.equals(task.endDate) : task.endDate != null) return false;
        if (priority != task.priority) return false;
        return status == task.status;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + text.hashCode();
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", endDate='" + endDate + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
