class FoodOrder {
    private String itemName;
    private int quantity;

    public FoodOrder() {
        this.itemName = "Burger";
        this.quantity = 1;
    }

    public FoodOrder(String itemName) {
        this.itemName = itemName;
        this.quantity = 1;
    }

    public FoodOrder(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public void showOrder() {
        System.out.println("Order: " + itemName + ", Quantity: " + quantity);
    }

    // Main method for testing FoodOrder class
    public static void main(String[] args) {
        FoodOrder order1 = new FoodOrder(); // Default order
        FoodOrder order2 = new FoodOrder("Pizza"); // Only item name provided
        FoodOrder order3 = new FoodOrder("Pasta", 3); // Both item name and quantity provided

        order1.showOrder();
        order2.showOrder();
        order3.showOrder();
    }
}