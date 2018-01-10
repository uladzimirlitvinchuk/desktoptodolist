package desctop.todolist.logic.dao.fileDao;

import desctop.todolist.logic.beans.Task;
import desctop.todolist.logic.dao.CrudDao;

import java.util.Map;

public class FileDao implements CrudDao{

    @Override
    public Map<String, Task> getAllTasks() {
        return null;
    }

    @Override
    public boolean addTask(Task task) {
        return false;
    }

    @Override
    public boolean deleteTask(Task task) {
        return false;
    }

    @Override
    public boolean updateTask(Task task) {
        return false;
    }

    @Override
    public boolean cleanTasks() {
        return false;
    }

    @Override
    public boolean cleanAllTasks() {
        return false;
    }
}
