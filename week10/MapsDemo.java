import java.util.*;

class MapsDemo{
    public static void main(String[] args) {
        Map<String,Double>  students=new HashMap();
        
        System.out.println("Checkig map is empty or not initially : "+students.isEmpty());
       
        students.put("21331A0567",80.0);
        students.put("21331A0568",81.0);
        students.put("21331A0569",82.0);
        students.put("21331A0570",83.0);
        students.put("21331A0571",84.0);

        System.out.println("After inserting few pairs : "+students);
        System.out.println("Size of the map  : "+students.size());
        
        System.out.println("Checking '21331A0570' as key is present in the map : "+students.containsKey("21331A0570"));
        
        students.remove("21331A0571");//removing 21331A0571 from the map
        System.out.println("after removing  '21331A0571', map is : "+students);
        
        System.out.println("Getting the value of  21331A0568 : "+students.get("21331A0568"));

        System.out.println(students.keySet());
        System.out.println(students.values());
        
        students.clear();//clearing the map
        System.out.println("After using the clear method : "+students);

    }
}