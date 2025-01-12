package _03_template.ex02;

import _03_template.ex01.Coffee;
import _03_template.ex01.Tea;

public class Main {


    /**
     * Template Pattern
     * 구현할 알고리즘의 구조는 고정되어 있되, 그 세부 과정 각각은 변경하거나 확장될 수 있는 경우에 유용하게 활용
     */
    public static void main(String[] args) {
        CSVDataProcessor csvDataProcessor = new CSVDataProcessor();
        csvDataProcessor.process("CSV Data");

        JSONDataProcessor jsonDataProcessor = new JSONDataProcessor();
        jsonDataProcessor.process("XML Data");
    }

}