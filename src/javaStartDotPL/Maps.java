package javaStartDotPL;

import java.util.Map;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Maps { 
    public static void main(String[] args) {
        Map<Integer, String> employees = new TreeMap<>();

        employees.put(111, "Bart");
        employees.put(112, "Bart2");
        employees.put(113, "Bart3");
        employees.put(114, "Bart4");

        System.out.println("Amount of employees = " + employees.size());

        Set<Integer> setOfKeys = employees.keySet();
        System.out.println("Keys = " + setOfKeys);

        Collection<String> collectionOfValues = employees.values();
        System.out.println(collectionOfValues);

        Set<Entry<Integer, String>> setOfEntry = employees.entrySet();
        for (Entry<Integer, String> entry : setOfEntry) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
    }
}