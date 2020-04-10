package les_2.task_5;

public class SummarizedRating {

    private double productGood;
    private double productAverage;
    private double productBad;

    public SummarizedRating(double productGood, double productAverage, double productBad) {
        this.productGood = productGood;
        this.productAverage = productAverage;
        this.productBad = productBad;
    }

    public double getProductGood() {
        return productGood;
    }

    public double getProductAverage() {
        return productAverage;
    }

    public double getProductBad() {
        return productBad;
    }

    @Override
    public String toString() {
        return "SummarizedRating{" +
                "productGood=" + productGood +
                ", productAverage=" + productAverage +
                ", productBad=" + productBad +
                '}';
    }
}