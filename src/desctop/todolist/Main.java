package desctop.todolist;

import desctop.todolist.logic.beans.Task;
import desctop.todolist.logic.enums.Priority;
import desctop.todolist.logic.enums.Status;
import desctop.todolist.logic.utils.TaskConverter;
import javafx.scene.control.Button;

public class Main{
    Button button;
    public static void main(String[] args) {
        //int id, String text, String endDate, Priority priority, Status status
        System.out.println(TaskConverter.toCsvLineConvert(new Task(1, "text", "date", Priority.HIGH, Status.DONE)));
    }

}
