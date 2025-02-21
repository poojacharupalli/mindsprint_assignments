package program.java.collection;
 
import java.util.LinkedHashMap;
import java.util.Map;
 
public class LinkedHashMapDemo {
  public static void main(String[] args) {
	    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(1, new String("Samsung"));
        linkedHashMap.put(2, new String("Mi"));
        linkedHashMap.put(3, new String("Toshiba"));
        linkedHashMap.put(4, new String("HCL"));
        linkedHashMap.put(5, new String("Wipro"));
        linkedHashMap.put(6, "OPPO");
        System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
        System.out.println("\nValues of map after iterating over it : ");
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key + ":\t" + linkedHashMap.get(key));
        }
        System.out.println("\nThe size of the LinkedHashMap is : " + linkedHashMap.size());
        System.out.println("\nIs LinkedHashMap empty? : " + linkedHashMap.isEmpty());
        System.out.println("\nLinkedHashMap contains 2 as key? : " + linkedHashMap.containsKey(2));
        System.out.println("LinkedHashMap contains HCL as value? : " + linkedHashMap.containsValue("HCL"));
        System.out.println("\nRemove entry for key 3 : " + linkedHashMap.remove(3));
        System.out.println("Content of LinkedHashMap after removing key 2: " + linkedHashMap);
        linkedHashMap.replace(4, "DELL");
        System.out.println("After replacing the key 4: " + linkedHashMap);

        Map<Integer, String> salary = new LinkedHashMap<Integer, String>();
        salary.put(101, "Emp-1");
        salary.put(102, "Emp-2");
        salary.put(103, "Emp-3");
        salary.put(104, "Emp-4");
        linkedHashMap.putAll(salary);
        System.out.println("After merging the salary map into the existing map " + linkedHashMap);
        linkedHashMap.clear();
        System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);

    }
}