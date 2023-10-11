import java.util.*;

public class Main {
    public static void main(String[] args) {
        //we get a text from user
        Scanner scan = new Scanner(System.in);

        System.out.print("Please write a minimum 20 words of text: ");
        String text = scan.nextLine();

        //dividing the text into words
        String[] arrOfStr = text.trim().toLowerCase().split(" ");

        //creating a HashMap object and increasing repeated words' value
        HashMap<String, Integer> repeatWords = new HashMap<>();
        for (String str : arrOfStr) {
            if (repeatWords.containsKey(str)) {
                repeatWords.put(str, repeatWords.get(str) + 1);
            } else {
                repeatWords.put(str, 1);
            }
        }

        //finding the most popular words
        // Collections.max(repeatWords.entrySet(), Map.Entry.comparingByValue()).getKey();
        int maxValue = 0;
        String popularWord = "";
        for (String str : repeatWords.keySet()) {
            int currentValue = repeatWords.get(str);
            if (currentValue > maxValue) {
                maxValue = currentValue;
                popularWord = str;
            }
        }

        //if there are more popular words than one
        Object[] arr = repeatWords.values().toArray();
        Arrays.sort(arr);
        if ((arr[arr.length - 1]) == (arr[arr.length - 2])) {
            System.out.println("There is more than one popular word.");
        } else {
            System.out.println(popularWord + "----> this is the most repeated word of your text.");
        }
    }
}




