import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter an index: ");
        int index = scan.nextInt();

        try{
            int element = arr[index];
            System.out.println(element);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        } finally {
            System.out.println("This is the final point of code");
        }


    }
}