# What to know about Java hash maps

## Instantiation

HashMap`<K,V`> map = new HashMap`<K,V`>();

..where K and V are generics.
For the rest of the md, were going to assume that we have a hash map called "map"

## Most common functions, plucked from the [docs](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)

| Function | Returns |
| --- | --- |
| map.size() | returns how many key value entries/mappings there are |
| map.put(whatev,whatev) | puts that shit into the hashmap as a key value pair |
| map.putAll(map2) | copies everything from map2 into map |






## Useful Examples

* From a populated integer array called arr, map all the elements to its frequency:

```
HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
for(int num: arr){
    if(map.containsKey(num)){
        map.put(num, map.get(num)+1);
    }else{
        map.put(num, 1);
    }
}
```
* Iterate over a HashMap to find the largest integer value

```
int max = 0;
for(Map.Entry<Integer, Integer> entry: map.entrySet()){
    max = Math.max(max, entry.getValue());
}
```

## Random trivia

* It's roughly the same as hash table except that it's unsynchronized and permits nulls (both null value and null key)
* Keys and values are meant to be randomized. If you care about values being sorted, try Treemap, which implements the SortedMap interface and sorts it based on natural ordering.


## Helpful links
* [Difference between HashMap, TreeMap, and Linked HashMap](http://stackoverflow.com/a/17708526)