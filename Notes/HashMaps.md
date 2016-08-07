# What to know about Java Hash Maps

## Initialization

HashMap`<K,V`> hm = new HashMap`<K,V`>();

where K and V are generics

## Most common functions





## Useful Examples

1. From a populated integer array called arr, map all the elements to its frequency:

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
2. Iterate over a HashMap to find the largest integer value

```
int max = 0;
    for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        max = Math.max(max, entry.getValue());
    }
```

## Random trivia

1. It's roughly the same as hash table except that it's unsynchronized and permits nulls (both null value and null key)
2. Keys and values are meant to be randomized. If you care about values being sorted, try Treemap, which implements the SortedMap interface and sorts it based on natural ordering.


## Helpful links
1. [Difference between HashMap, TreeMap, and Linked HashMap](http://stackoverflow.com/a/17708526)