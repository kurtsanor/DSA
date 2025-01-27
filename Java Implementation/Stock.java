public class Stock {
    public String dateEntered;
    public String label;
    public String brand;
    public String engineNumber;
    public String status;

    public Stock (String dateEntered, String label, String brand, String engineNumber, String status) {
        this.dateEntered = dateEntered;
        this.label = label;
        this.brand = brand;
        this.engineNumber = engineNumber;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Date entered: " + dateEntered + " | Stock Label: " + label + " | Brand: " + brand +
                " | Engine Number: " + engineNumber + " | Status: " + status;
    }
}
