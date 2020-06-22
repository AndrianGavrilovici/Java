package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FilesProcesser {
    public void processer(String folderPath, String logFilePath) {
        File folder = new File(folderPath);
        File logfile = new File(logFilePath);
        if (!folder.exists()) {
            throw new IllegalArgumentException("Folder does not exist!");
        } else {
            System.out.println("Folder name: " + folder.getName());
        }
        try {
            if (logfile.createNewFile())
                System.out.println("File created: " + logfile.getName());
            else
                System.out.println("File already exists: " + logfile.getName());
            try (FileOutputStream wr = new FileOutputStream(logfile)){
                wr.write(execute(folderPath).getBytes());
            } catch (IOException e) {
                throw e;
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    private String execute(String folderPath){
        StringBuilder fileInfo = new StringBuilder();
        File[] folderFiles = new File(folderPath).listFiles();
        for (File file : folderFiles) {
            fileInfo.append("Path->  " + file.getAbsolutePath());
            fileInfo.append("\r\n\t");
            fileInfo.append("Name->  " +  file.getName());
            fileInfo.append("\r\n\t");
            fileInfo.append("Date Of Change->  " + new SimpleDateFormat().format(new Date(file.lastModified())));
            fileInfo.append("\r\n");
        }
        return fileInfo.toString();
    }

}