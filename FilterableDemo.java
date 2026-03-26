interface Filterable {
    void applyFilter(String filterType);
    void resetFilter();
}

class ImageProcessor implements Filterable {
    private String imageName;
    private String currentFilter;

    public ImageProcessor(String imageName) {
        this.imageName = imageName;
        this.currentFilter = "None";
    }

    @Override
    public void applyFilter(String filterType) {
        currentFilter = filterType;
        System.out.println("Applied " + filterType + " filter to " + imageName);
    }

    @Override
    public void resetFilter() {
        currentFilter = "None";
        System.out.println("Filter reset for " + imageName);
    }

    public void displayStatus() {
        System.out.println("Image: " + imageName + ", Current Filter: " + currentFilter);
    }
}

class DataAnalyzer implements Filterable {
    private String dataSet;
    private String currentFilter;

    public DataAnalyzer(String dataSet) {
        this.dataSet = dataSet;
        this.currentFilter = "None";
    }

    @Override
    public void applyFilter(String filterType) {
        currentFilter = filterType;
        System.out.println("Applied " + filterType + " filter to " + dataSet);
    }

    @Override
    public void resetFilter() {
        currentFilter = "None";
        System.out.println("Filter reset for " + dataSet);
    }

    public void displayStatus() {
        System.out.println("DataSet: " + dataSet + ", Current Filter: " + currentFilter);
    }
}

public class FilterableDemo {
    public static void main(String[] args) {
        System.out.println("=== Image Processor ===");
        ImageProcessor imgProcessor = new ImageProcessor("photo.jpg");
        imgProcessor.displayStatus();
        imgProcessor.applyFilter("Blur");
        imgProcessor.displayStatus();
        imgProcessor.resetFilter();
        imgProcessor.displayStatus();

        System.out.println("\n=== Data Analyzer ===");
        DataAnalyzer dataAnalyzer = new DataAnalyzer("Sales Data");
        dataAnalyzer.displayStatus();
        dataAnalyzer.applyFilter("Outlier Detection");
        dataAnalyzer.displayStatus();
        dataAnalyzer.resetFilter();
        dataAnalyzer.displayStatus();
    }
}
