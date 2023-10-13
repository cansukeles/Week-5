import java.util.Scanner;
import java.util.TreeSet;


public class PatikaStore {
    Scanner input = new Scanner(System.in);

    public void start() throws Exception {
        boolean quit = false;
        NotebookOperating notebookOperation = new NotebookOperating();
        CellPhoneOperating cellPhoneOperation = new CellPhoneOperating();

        while (!quit) {
            System.out.println();
            System.out.println("Welcome to the Patika Store!");
            System.out.println("This is your control panel. What do you want to do?");
            System.out.println("1- Notebook Operations");
            System.out.println("2- Cell Phone Operations");
            System.out.println("3- Brand Listing");
            System.out.println("4- Quit");
            System.out.println();
            System.out.print("Select: ");

            int select = input.nextInt();


            switch (select) {
                case 1:
                    boolean quitNotebookOperation = false;
                    System.out.println();
                    notebookOperation.listNotebook(-1, "");

                    while(!quitNotebookOperation){
                        System.out.println();
                        System.out.println("What do you want to do?");
                        System.out.println("1- Add a new Notebook");
                        System.out.println("2- Remove a Notebook from the list");
                        System.out.println("3- Filter products by id");
                        System.out.println("4- Filter products by brands");
                        System.out.println("5- Main Menu");
                        System.out.print("Select: ");
                        int selectAction = input.nextInt();
                        input.nextLine();
                        if (selectAction == 1) {
                            notebookOperation.addNotebook();
                        } else if (selectAction == 2) {
                            notebookOperation.removeNotebook();
                        } else if (selectAction == 3) {
                            System.out.print("Please enter the id you want to filter by: ");
                            int id = input.nextInt();
                            input.nextLine();
                            notebookOperation.listNotebook(id, "");
                        } else if (selectAction == 4) {
                            System.out.print("Please enter the brand you want to filter by: ");
                            String brandName = input.nextLine();
                            notebookOperation.listNotebook(-1, brandName);
                        } else {
                            quitNotebookOperation = true;
                        }
                    }

                    break;
                case 2:
                    boolean quitCellPhoneOperation = false;
                    System.out.println();
                    cellPhoneOperation.listCellPhones(-1, "");

                    while(!quitCellPhoneOperation) {
                        System.out.println();
                        System.out.println("What do you want to do?");
                        System.out.println("1- Add a new Cell Phone");
                        System.out.println("2- Remove a Cell Phone from the list");
                        System.out.println("3- Filter products by id");
                        System.out.println("4- Filter products by brands");
                        System.out.println("5- Main Menu");
                        System.out.print("Select: ");
                        int selectAction2 = input.nextInt();
                        input.nextLine();
                        if (selectAction2 == 1) {
                            cellPhoneOperation.addCellPhone();
                        } else if (selectAction2 == 2) {
                            cellPhoneOperation.removeCellPhone();
                        } else if (selectAction2 == 3) {
                            System.out.print("Please enter the id you want to filter by: ");
                            int id = input.nextInt();
                            input.nextLine();
                            cellPhoneOperation.listCellPhones(id, "");
                        } else if (selectAction2 == 4) {
                            System.out.print("Please enter the brand you want to filter by: ");
                            String brandName = input.nextLine();
                            cellPhoneOperation.listCellPhones(-1, brandName);
                        } else {
                            quitCellPhoneOperation = true;
                        }
                    }
                    break;
                case 3:
                    System.out.println("----- Brands -----");
                    Brand.listBrands();
                    System.out.println();
                    break;
                case 4:
                    quit = true;
                    break;
            }
            if (quit) {
                System.out.println("See you later!");
            }

        }
    }
}

