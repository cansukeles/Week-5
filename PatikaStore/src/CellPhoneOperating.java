
import java.util.*;

// Comparator that sort elements according to marks in
// Ascending order
class CellPhoneKeyComparator implements Comparator<Integer> {
    public int compare(Integer s1, Integer s2) {
        return s1 - s2;
    }
}

public class CellPhoneOperating {


    static TreeMap<Integer, CellPhone> cellPhones = new TreeMap<>(new CellPhoneKeyComparator());

    static {
        CellPhone p1 = new CellPhone(1, "SAMSUNG GALAXY A51", "3199.0 TL", "Samsung",
                128, 6.5, 32, 4000.0, 6, "Black");
        CellPhone p2 = new CellPhone(2, "IPhone 11 64 GB", "7379.0 TL", "Apple",
                64, 6.1, 5, 3046.0, 6, "Blue");
        CellPhone p3 = new CellPhone(3, "Redmi Note 10 Pro 8GB", "4012.0 TL", "Xiaomi",
                128, 6.5, 35, 4000.0, 12, "White");

        cellPhones.put(1, p1);
        cellPhones.put(3, p3);
        cellPhones.put(2, p2);
    }


    public void listCellPhones(int id, String brandName) {
        System.out.println("Cell Phone List");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-5s %-25s %-13s %-11s %-10s %-5s %-5s %-5s %-5s %-5s\n", "| ID ", "| Product Name ", "| Price ", "| Brand ", "| Storage ", "| Screen Size ", "| Camera ", "| Battery ", "| RAM", "| Color |");

        for (int phoneId : cellPhones.keySet()) {
            CellPhone phone = cellPhones.get(phoneId);

            boolean showCellPhones = false;

            if ((id != -1) && (phoneId == id)) {
                showCellPhones = true;
            }
            if ((!brandName.isEmpty()) && (phone.getBrandInfo().equalsIgnoreCase(brandName.trim()))) {
                showCellPhones = true;
            }
            if ((id == -1) && (brandName.isEmpty())) {
                showCellPhones = true;
            }
            if (showCellPhones) {

                System.out.println("----------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%-3s %-25s %-1s %-2s %-10s %-14s %-9s %-1s %-1s %-5s\n", "| " + phone.getId() + " ", " | " + phone.getName(), " | " + phone.getUnitPrice() + " ", " | "
                        + phone.getBrandInfo() + " ", " | " + phone.getStorage() + " ", " | " + phone.getScreenSize() + "    ", " | " + phone.getCamera() + "    ", " | "
                        + phone.getBatteryPower() + " ", " | " + phone.getRam() + " ", " | " + phone.getColor() + " " + " | ");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------");

            }
        }

    }

    Scanner input = new Scanner(System.in);

    public void addCellPhone() {
        System.out.println("Enter the information below: ");
        boolean addingCellPhone = false;

        while (true) {

            System.out.print("ID: ");
            int id = input.nextInt();
            input.nextLine();

            if (!cellPhones.containsKey(id)) {
                System.out.print("Name: ");
                String name = input.nextLine();

                System.out.print("Price TL: ");
                String unitPrice = input.nextLine();

                System.out.println("----- Brands -----");
                Brand.listBrands();
                System.out.print("Select a brand: ");
                String brandInfo = input.nextLine();
                String brandInfoCapitalized = brandInfo.substring(0, 1).toUpperCase() + brandInfo.substring(1);

                while (!Brand.containsBrand(brandInfoCapitalized)) {
                    System.out.println("Invalid brand name! Please write the brand name again: ");
                    brandInfo = input.nextLine();
                    brandInfoCapitalized = brandInfo.substring(0, 1).toUpperCase() + brandInfo.substring(1);
                }

                System.out.print("Storage: ");
                int storage = input.nextInt();

                System.out.print("Screen Size: ");
                double screenSize = input.nextDouble();

                System.out.print("Camera: ");
                int camera = input.nextInt();

                System.out.print("Battery Power: ");
                double batteryPower = input.nextDouble();

                System.out.print("RAM: ");
                int ram = input.nextInt();
                input.nextLine();

                System.out.print("Color: ");
                String color = input.nextLine();

                CellPhone p4 = new CellPhone(id, name, unitPrice, brandInfoCapitalized, storage, screenSize, camera, batteryPower, ram, color);
                cellPhones.put(id, p4);
                listCellPhones(-1, "");
                break;

            } else {
                System.out.println("ID no must be different from current id's! Please try again.");
            }

        }

    }

    public void removeCellPhone() throws Exception {
        System.out.print("Please enter the id of Cell Phone you want to remove: ");
        int id = input.nextInt();
        if (cellPhones.containsKey(id)) {
            cellPhones.remove(id);
            listCellPhones(-1, "");
        } else {
            throw new Exception("Invalid id!");
        }
    }
}
