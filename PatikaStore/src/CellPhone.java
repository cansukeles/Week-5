public class CellPhone extends Product {

    private double batteryPower;
    private String color;
    private int camera;

    public CellPhone(int id, String name, String unitPrice, String brandInfo, int storage,
                     double screenSize, int camera, double batteryPower, int ram, String color) {
        super(id, name, unitPrice, brandInfo, storage, screenSize, ram);
        this.camera = camera;
        this.batteryPower = batteryPower;
        this.color = color;
    }

    public double getBatteryPower() {
        return batteryPower;
    }

    public String getColor() {
        return color;
    }

    public int getCamera() {
        return camera;
    }


}
