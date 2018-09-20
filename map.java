import java.util.*;
class map {
  public static void main(String[] args) {
     Scanner Scan= new Scanner (System.in);
    HashMap<String, Integer> hm= new HashMap<String, Integer>();
         hm.put("abcc", 123); 
        hm.put("deff", 124); 
        hm.put("ghii", 567);
 if (hm.isEmpty())  
        { 
            System.out.println("HM is empty"); 
        } 
          
        else
        { 
            System.out.println(hm); 
        } 
   
  }
}