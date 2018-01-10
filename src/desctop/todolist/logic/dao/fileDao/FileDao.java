package desctop.todolist.logic.dao.fileDao;

import desctop.todolist.logic.beans.Task;
import desctop.todolist.logic.dao.CrudDao;
import desctop.todolist.logic.utils.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class FileDao implements CrudDao{

    private static Logger log = LogManager.getLogger(FileDao.class);

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
