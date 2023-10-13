public abstract class Product {
    private int id;
    private String unitPrice;
    private int discountRate;
    private int amountOfStock;
    private int storage;
    private String name;
    private String brandInfo;
    private double screenSize;
    private int ram;

    public Product(int id, String name, String unitPrice, String brandInfo, int storage, double screenSize, int ram){
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.brandInfo = brandInfo;
        this.storage = storage;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public int getId(){
        return id;
    }
    public String getUnitPrice(){
        return unitPrice;
    }
    public int getStorage(){
        return storage;
    }
    public String getName(){
        return name;
    }
    public String getBrandInfo(){
        return brandInfo;
    }
    public double getScreenSize(){
        return screenSize;
    }
    public int getRam(){
        return ram;
    }


}
