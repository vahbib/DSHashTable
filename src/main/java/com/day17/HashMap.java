package com.day17;

public class HashMap {
    LinkedList<K,V> list;

    public HashMap(){
        list=new LinkedList();
    }

    public V get(K key) {
        nodeMap<K,V> mapNode = (nodeMap<K, V>) list.search(key);
        return (mapNode == null) ? null : mapNode.getValue();
    }

    public void add(K key, V value) {
        nodeMap<K,V> mapNode = (nodeMap<K, V>) list.search(key);
        if(mapNode==null){
            mapNode = new NodeMap<>(key,value);
            list.append(mapNode);
        }
        else
            mapNode.setValue(value);
    }

    @Override
    public String toString() {
        return "HashNodes {"+ list + "}";
    }

}
