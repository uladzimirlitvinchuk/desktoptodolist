package desctop.todolist.logic.utils;

import desctop.todolist.logic.beans.Task;

public class TaskConverter {
    public static Task toJavaConvert(String csvLine){
        return null;
    }
    //int id, String text, String endDate, Priority priority, Status status
    public static String toCsvLineConvert (Task task){
        String csvLine = String.format("%d,%s,%s,%s,%s",task.getId(),task.getText(),task.getEndDate()
                ,task.getPriority().toString(),task.getStatus().toString());
        return csvLine;
    }
}
