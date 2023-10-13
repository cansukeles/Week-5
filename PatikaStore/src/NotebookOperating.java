
import java.util.*;

// Comparator that sort elements according to marks in
// Ascending order
class NotebookKeyComparator implements Comparator<Integer> {
    public int compare(Integer s1, Integer s2) {
        return s1 - s2;
    }
}

public class NotebookOperating {

    static TreeMap<Integer, Notebook> notebooks = new TreeMap<>(new NotebookKeyComparator());

    static {

        Notebook n1 = new Notebook(1, "HUAWEI Matebook 14", "7000.0 TL", "Huawei",
                512, 14.0, 16);
        Notebook n2 = new Notebook(2, "LENOVO V14 IGL", "3699.0 TL", "Lenovo",
                1024, 14.0, 8);
        Notebook n3 = new Notebook(3, "ASUS Tuf Gaming", "8199.0 TL ", "Asus",
                2048, 15.6, 32);

        notebooks.put(1, n1);
        notebooks.put(2, n2);
        notebooks.put(3, n3);

    }

    //if int id = -1 and brandName is empty whole list is shown
    public void listNotebook(int id, String brandName) {
        System.out.println("Notebook List");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("%-5s %-22s %-13s %-10s %-10s %-5s %-5s\n", "| ID ", "| Product Name ", "| Price ", "| Brand ", "| Storage ", "| Screen Size ", "| RAM |");
        System.out.println("----------------------------------------------------------------------------------------------------");


        for (int notebookId : notebooks.keySet()) {
            Notebook notebook = notebooks.get(notebookId);

            boolean showNotebook = false;

            if ((id != -1) && (notebookId == id)) {
                showNotebook = true;
            }
            if ((!brandName.isEmpty()) && (notebook.getBrandInfo().equalsIgnoreCase(brandName.trim()))) {
                showNotebook = true;
            }
            if ((id == -1) && (brandName.isEmpty())) {
                showNotebook = true;
            }
            if (showNotebook) {
                System.out.printf("%-3s %-22s %-1s %-1s %-10s %-13s %-10s\n", "| " + notebook.getId() + " ", " | " + notebook.getName(), " | " + notebook.getUnitPrice() + " ", " | "
                        + notebook.getBrandInfo() + " ", " | " + notebook.getStorage() + " ", " | " + notebook.getScreenSize() + "    ", " | " + notebook.getRam() + "  " + " | ");
                System.out.println("----------------------------------------------------------------------------------------------------");

            }
        }
    }


    Scanner input = new Scanner(System.in);

    public void addNotebook() {
        System.out.println("Enter the information below: ");
        boolean addingNotebook = false;

        while (true) {

            System.out.print("ID: ");
            int id = input.nextInt();
            input.nextLine();

            if (!notebooks.containsKey(id)) {
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

                System.out.print("RAM: ");
                int ram = input.nextInt();
                input.nextLine();

                Notebook p4 = new Notebook(id, name, unitPrice, brandInfoCapitalized, storage, screenSize, ram);
                notebooks.put(id, p4);
                listNotebook(-1, "");
                break;

            } else {
                System.out.println("ID no must be different from current id's! Please try again.");
            }

        }
    }

    public void removeNotebook() throws Exception {
        System.out.print("Please enter the id of Cell Phone you want to remove: ");
        int id = input.nextInt();
        if (notebooks.containsKey(id)) {
            notebooks.remove(id);
            listNotebook(-1, "");
        } else {
            throw new Exception("Invalid id!");
        }
    }

}
