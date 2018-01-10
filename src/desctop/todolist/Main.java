package desctop.todolist;

import desctop.todolist.logic.beans.Task;
import desctop.todolist.logic.enums.Priority;
import desctop.todolist.logic.enums.Status;
import desctop.todolist.logic.utils.TaskConverter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main{
    private static Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        //int id, String text, String endDate, Priority priority, Status status
        log.error(TaskConverter.toCsvLineConvert(new Task(1, "text", "date", Priority.HIGH, Status.DONE)));
        Task task = TaskConverter.toJavaConvert("1,texsdf sdf sdf SDFt,date,proir,status,fsdsd");
        System.out.println();
    }

}
