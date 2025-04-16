 interface House {
    @Deprecated
    void open();
    void openFrontDoor();
    void openBackDoor();
    }
  class MyHouse implements House {
    @SuppressWarnings("deprecation") // Suppresses the warning for using a deprecated method
    public void open() {}
    public void openFrontDoor() {}
    public void openBackDoor() {}
    }