package _03_template.ex02;

public class CSVDataProcessor extends DataProcessor {


    @Override
    protected void loadData(String data) {
        System.out.println("CSVDataProcessor.loadData");
        System.out.println("data = " + data);
    }

    @Override
    protected boolean isValidData(String data) {
        return data != null && data.contains("CSV");
    }

    @Override
    protected void processData(String data) {
        System.out.println("CSVDataProcessor.processData");
        System.out.println("data = " + data);
    }

    @Override
    protected void saveData(String data) {
        System.out.println("CSVDataProcessor.saveData");
        System.out.println("data = " + data);
    }
}
