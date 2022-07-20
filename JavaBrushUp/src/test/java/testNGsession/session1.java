import java.util.*;

public class Main {
    public static void main(String[] args) {
       HashMap < String, Integer > hash_map = new HashMap < String, Integer > ();
  hash_map.put("Red", 1);
  hash_map.put("Black", 2);
  hash_map.put("White", 3);
  hash_map.put("Blue", 4);
  
  Scanner sc = new Scanner(System.in);
  String color = sc.nextLine();
  
  if (hash_map.containsKey(color)) {
   
   System.out.println("Yes" );
  } else {
   
   System.out.println("No");
  }

  }
}
