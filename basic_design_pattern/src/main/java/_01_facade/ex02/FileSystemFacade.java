package _01_facade.ex02;

import java.io.IOException;

public class FileSystemFacade {

    private FileReader fileReader;
    private FileWriter fileWriter;
    private FileDeleter fileDeleter;


    public FileSystemFacade() {
        this.fileDeleter = new FileDeleter();
        this.fileReader = new FileReader();
        this.fileWriter = new FileWriter();
    }

    public String readFile(String filePath) {
        try {
            return fileReader.readFile(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean writeFile(String filePath, String content) {

        try {
            fileWriter.writeFile(filePath, content);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean deleteFile(String filePath) {
        try {
            fileDeleter.deleteFile(filePath);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
