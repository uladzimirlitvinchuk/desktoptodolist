package desctop.todolist.logic.utils;

import desctop.todolist.Main;
import desctop.todolist.logic.beans.Task;
import desctop.todolist.logic.enums.Priority;
import desctop.todolist.logic.enums.Status;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TaskConverter {
    private static Logger log = LogManager.getLogger(TaskConverter.class);
    public static Task toJavaConvert(String csvLine){
        int id = 0;
        String text = null;
        String date = null;
        Priority priority = null;
        Status status = null;
        try {
            String[] arr = csvLine.split(",", 5);
            int lenght = arr.length;
            id = Integer.parseInt(arr[0]);
            text = arr[1];
            if (lenght > 2) {
                date = arr[2];
            }if (lenght >3){
                priority = Priority.valueOf(arr[3]);
            }if (lenght == 5){
                status = Status.valueOf(arr[4]);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return new Task(id,text,date,priority,status);
    }
    //int id, String text, String endDate, Priority priority, Status status
    public static String toCsvLineConvert (Task task){
        String csvLine = String.format("%d,%s,%s,%s,%s",task.getId(),task.getText(),task.getEndDate()
                ,task.getPriority().toString(),task.getStatus().toString());
        return csvLine;
    }
}
