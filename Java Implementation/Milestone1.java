import java.util.*;

public class Milestone1 {

    List <Stock> stocks = new LinkedList<>();

    public static void main(String[] args) {

    }

    public void addStock (String dateEntered, String stockLabel, String stockBrand, String engineNumber, String status) {
        // traverse the linked list
        for (Stock currentStock: stocks) {
            // check if the stock already exists based on the engine number
            if (currentStock.engineNumber.equals(engineNumber)) {
                System.out.println("Stock already exists");
                return; // exit the method without adding the stock
            }
        }
        // add the stock if it's not a duplicate
        stocks.add(new Stock(dateEntered, stockLabel, stockBrand, engineNumber, status));
    }

    public void deleteStock(String engineNumber) {
        // Use an iterator to traverse the list and remove items safely
        Iterator<Stock> iterator = stocks.iterator();
        while (iterator.hasNext()) {
            Stock currentStock = iterator.next();
            if (currentStock.engineNumber.equals(engineNumber)) {
                iterator.remove(); // Safely remove the stock
                System.out.println("Stock with engine number " + engineNumber + " deleted.");
                return; // Exit after deletion
            }
        }
        // If no stock is found with the matching engine number
        System.out.println("Stock not found");
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
        // Check if engineNumber is null
        if (engineNumber == null) {
            System.out.println("Engine number cannot be null.");
            return null;
        }

        // Traverse the ArrayList to find the stock
        for (int i = 0; i < stocks.size(); i++) {
            Stock currentStock = stocks.get(i); // Access stock by index
            if (currentStock.engineNumber.equals(engineNumber)) {
                return currentStock; // Return the matching stock
            }
        }
        // If no match is found
        System.out.println("Stock with engine number " + engineNumber + " not found.");
        return null;
    }


}