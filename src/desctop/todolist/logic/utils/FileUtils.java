package desctop.todolist.logic.utils;

import desctop.todolist.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    private static Logger log = LogManager.getLogger(FileUtils.class);
    public static List<String> readTasks (){
        List<String> lines = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader("<путь к файду>"));) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return lines;
    }
}
