import java.util.Scanner;

public class Main {
    public static int checkArray(int [] array, int index) throws Exception{
        if(index <0 || index > array.length){
            throw new ArrayIndexOutOfBoundsException();
        } else {
            System.out.println("A Valid Action.");
        }
        return array [index];
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an index number: ");
        int index = scan.nextInt();

        try{
            checkArray(arr, index);
            System.out.println("The element of your index: " + arr[index]);
        } catch (Exception e) {
            System.out.println("An Invalid Action! ");
            System.out.println(e.toString());
        }
    }
}