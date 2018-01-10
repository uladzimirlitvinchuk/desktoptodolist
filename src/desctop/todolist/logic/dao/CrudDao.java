package desctop.todolist.logic.dao;

import desctop.todolist.logic.beans.Task;

import java.util.Map;

public interface CrudDao {
    Map <String,Task> getAllTasks();
    boolean addTask(Task task);
    boolean deleteTask(Task task);
    boolean updateTask(Task task);
    boolean cleanTasks();
    boolean cleanAllTasks();
}
