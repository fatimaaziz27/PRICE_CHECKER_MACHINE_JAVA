import java.util.*;
public class PRICE_CHECKING_MACHINE {
    public static void main(String[] args) {
        
        // create a dictionary to store product names and their prices
        
        HashMap<String, Integer> PRODUCT_DICTIONARY = new HashMap<>();
        PRODUCT_DICTIONARY.put("PRODUCT_1", 1);
        PRODUCT_DICTIONARY.put("PRODUCT_2", 2);
        PRODUCT_DICTIONARY.put("PRODUCT_3", 3);
        PRODUCT_DICTIONARY.put("PRODUCT_4", 4);
        PRODUCT_DICTIONARY.put("PRODUCT_5", 5);
        PRODUCT_DICTIONARY.put("PRODUCT_6", 6);
        
        // WHILE LOOP TO CONTINUOUSLY ASK FOR PRODUCT NAMES

        while (true) {
        
            // TAKE INPUT FROM THE USER

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter product name (or 'quit' to stop):");
            String p_n = scanner.nextLine();
            
            // CHECK IF THE USER WANTS TO QUIT
            
            if (p_n.equals("quit") || p_n.equals("stop")) {
                break;
            }
            
            // CHECK IF THE PRODUCT EXISTS IN THE DICTIONARY AND PRINT THE PRICE OR A NOT AVAILABLE MESSAGE
            
            else if (PRODUCT_DICTIONARY.containsKey(p_n)) {
                System.out.println("Product:" + p_n + "\nProduct Price:" + PRODUCT_DICTIONARY.get(p_n));
            }
            
            // IF THE PRODUCT DOESN'T EXIST
            
            else {
                System.out.println("Product is not available");
            }
        }
    }
}
