import java.util.*;

public class Milestone2 {
    private final HashMap<String, Stock> stocks = new HashMap<>();

    public static void main(String[] args) {
        Milestone2 manager = new Milestone2();

        // Adding stocks
        manager.addStock("2024-01-01", "Label1", "Toyota", "ENG123", "Available");
        manager.addStock("2024-02-01", "Label2", "Honda", "ENG456", "Sold");
        manager.addStock("2024-03-01", "Label3", "Ford", "ENG789", "Available");

        // Searching stock
        System.out.println(manager.searchStock("ENG123"));

        // Deleting stock
        manager.deleteStock("ENG456");

        // Trying to delete a non-existent stock
        manager.deleteStock("ENG999");
    }

    public void addStock(String dateEntered, String stockLabel, String stockBrand, String engineNumber, String status) {
        // traverse the linked list
        for (Stock currentStock : stocks.values()) {
            // check if the stock already exists based on the engine number
            if (currentStock.engineNumber.equals(engineNumber)) {
                System.out.println("Stock already exists");
                return; // exit the method without adding the stock
            }
        }
        // add the stock if it's not a duplicate
        stocks.put(engineNumber, new Stock(dateEntered, stockLabel, stockBrand, engineNumber, status));
    }

    public void deleteStock(String engineNumber) {
        if (stocks.remove(engineNumber) != null) {
            System.out.println("Stock removed successfully");
        } else {
            System.out.println("Stock not found");
        }
    }

    public HashMap<String, Stock> getStocks() {
        return stocks;
    }

    public static void sortStocksByBrand(ArrayList<Stock> inventory) {
        for (int i = 0; i < inventory.size() - 1; i++) {
            for (int j = 0; j < inventory.size() - i - 1; j++) {
                if (inventory.get(j).brand.compareTo(inventory.get(j + 1).brand) > 0) {
                    // Swap stocks
                    Stock temp = inventory.get(j);
                    inventory.set(j, inventory.get(j + 1));
                    inventory.set(j + 1, temp);

                }
            }
        }
        System.out.println("Sorted Inventory by Brand:");
        for (Stock stock : inventory) {
            System.out.println(stock);
        }
    }

    public Stock searchStock(String engineNumber) {
        if (engineNumber == null) {
            System.out.println("Engine number cannot be null.");
            return null;
        }

        // Use the map's get method to find the stock
        Stock stock = stocks.get(engineNumber);
        if (stock != null) {
            return stock; // Return the matching stock
        } else {
            // If no match is found
            System.out.println("Stock with engine number " + engineNumber + " not found.");
            return null;
        }
    }


    

}
