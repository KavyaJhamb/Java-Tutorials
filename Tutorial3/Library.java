class Library {
    private int fineAmount;

    public Library() {
        this.fineAmount = 5; // Default fine amount
    }

    public void displayFine() {
        System.out.println("Default fine amount: $" + fineAmount);
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.displayFine();
    }
}