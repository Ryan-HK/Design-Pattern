package _01_facade.ex02;

import _01_facade.ex01.CoffeeMaker;
import _01_facade.ex01.Lights;
import _01_facade.ex01.SmartHomeFacade;
import _01_facade.ex01.Thermostat;

public class Main {


    /**
     * Facade Pattern
     * -. 여러 기능으로 이루어진 서브시스템을 하나의 Facade 클래스에서 사용할 수 있는 패턴이다.
     */
    public static void main(String[] args) {

        FileSystemFacade fs = new FileSystemFacade();

        // Write to file
        boolean writeSuccess = fs.writeFile(
                "test.txt", "Hello Facade Pattern"
        );
        System.out.println("writeSuccess = " + writeSuccess);

        // Read from file
        String content = fs.readFile("test.txt");
        System.out.println("content = " + content);

        // Delete file
        boolean deleteSuccess = fs.deleteFile("test.txt");
        System.out.println("deleteSuccess = " + deleteSuccess);

    }
}