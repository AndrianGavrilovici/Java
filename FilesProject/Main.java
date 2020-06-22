//Написать программу, которая создаст текстовый файл и запишет в него
//список файлов (путь, имя, дата изменения) из заданного каталога.
package Files;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        FilesProcesser filesProcesser = new FilesProcesser();
        System.out.println("Enter your own way? y/n");
        if (enter.nextLine().equals("y")){
            System.out.println("Directory path");
            String folderPath = enter.nextLine();
            System.out.println("Path to file save information");
            String logFilePath = enter.nextLine();
            filesProcesser.processer(folderPath, logFilePath);
        } else
            filesProcesser.processer("C:\\Intel\\Logs", "C:\\Intel\\log.txt");
    }
}
