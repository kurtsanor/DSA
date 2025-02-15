/**
 * The Stock class represents a stock item with details such as date entered, label, brand, engine number, and status.
 */

public class Stock2 {
    String dateEntered;
    String stockLabel;
    String stockBrand;
    String engineNumber;
    String status;

    public Stock2(String dateEntered, String stockLabel, String stockBrand, String engineNumber, String status) {
        this.dateEntered = dateEntered;
        this.stockLabel = stockLabel;
        this.stockBrand = stockBrand;
        this.engineNumber = engineNumber;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "dateEntered='" + dateEntered + '\'' +
                ", stockLabel='" + stockLabel + '\'' +
                ", stockBrand='" + stockBrand + '\'' +
                ", engineNumber='" + engineNumber + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
