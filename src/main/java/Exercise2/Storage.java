package Exercise2;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
Create a class called Storage that will have a private Map field, a public constructor, and following methods:
addToStorage (String key, String value) - adding elements to the storage
printValues (String key) - displaying all elements under a given key
printKey (String value) - displaying all keys that have the given value
The Storage class should allow you to store multiple values under one key.


class Storage
    Map<String, Set<String>> myMap

    # addToStorage(key, value): boolean
        - add to myMap - if success return true else false
               first element -> create list  -> put in map
               non-first element -> myMap.get (key) -> add to list

   #printValues(key)
        - find values from map
        - print values

   #printKey(value)
       - iterate over map and filter set that contains that value
       - if set contains value -> print key


addToStorage('ssss", "123")
addToStorage('ssss", "0")

"ssss" -> listOf("123", "0")
 */
public class Storage {
    private Map<String, Set<String>> elements;

    public Storage(Map<String, Set<String>> elements) {
        this.elements = elements;
    }

    public Map<String, Set<String>> getElements() {
        return elements;
    }

    public void setElements(Map<String, Set<String>> elements) {
        this.elements = elements;
    }

    public boolean addToStorage(String key, String value){
        if (elements.containsKey(key)){
            elements.get(key).add(value);
            return true;
        } else {
            elements.put(key, new HashSet<>());
            return false;
        }
    }
    public void printValues(String key){
        if (elements.containsKey(key)){
            System.out.println(elements.values());
        } else {
            System.out.println("We dont have this key:" + key);
        }
    }
    public void printKey(String value){
        Set<String> keys = new HashSet<>();
        for (Map.Entry<String, Set<String>> entry: elements.entrySet()){
            if (entry.getValue().contains(value)) {
                keys.add(entry.getKey());
            }
        }
        if (!keys.isEmpty()){
            System.out.println(keys);
        } else {
            System.out.println("Values not found");
        }
    }
}
