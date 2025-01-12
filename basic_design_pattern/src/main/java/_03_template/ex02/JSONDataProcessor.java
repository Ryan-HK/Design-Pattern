package _03_template.ex02;

public class JSONDataProcessor extends DataProcessor {

    @Override
    protected boolean isValidData(String data) {
        return data != null && data.contains("JSON");
    }

    @Override
    protected void loadData(String data) {
        System.out.println("JSONDataProcessor.loadData");
        System.out.println("data = " + data);
    }

    @Override
    protected void processData(String data) {
        System.out.println("JSONDataProcessor.processData");
        System.out.println("data = " + data);
    }

    @Override
    protected void saveData(String data) {
        System.out.println("JSONDataProcessor.saveData");
        System.out.println("data = " + data);
    }
}
