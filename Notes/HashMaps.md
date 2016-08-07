# What to know about Hash Maps

## Initialization

HashMap<K,V> hm = new HashMap<K,V>();

## Useful Examples

From an integer array map all the elements to its frequency:

```
HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
for(int num: nums){
    if(map.containsKey(num)){
        map.put(num, map.get(num)+1);
    }else{
        map.put(num, 1);
    }
}
```

##
