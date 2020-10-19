package com.day17.test;

import com.day17.HashMap;
import com.day17.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class HashTablesTest {
    @Test
    public void given_a_string_whenPassed_returnFreq() {
        String str="To be or not to be";
        HashMap<String,Integer> hMap = new HashMap<>();
        String[] sentence=str.toLowerCase().split(" ");
        for(String word:sentence){
            Integer val = hMap.get(word);
            if(val==null)
                val=1;
            else
                val++;
            hMap.add(word,val);
        }
        int freq = hMap.get("to");
        Assert.assertEquals(2,freq);
    }

    @Test
    public void given_a_String_whenPasses_returnsFreq() {
        String str="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        HashMap<String,Integer> hashmap=new HashMap<>();
        String[] words=str.toLowerCase().split(" ");
        for(String sentence:words){
            Integer value = hashmap.get(sentence);
            if(value==null)
                value=1;
            else
                value++;
            hashmap.add(sentence,value);
        }
        int frequency = hashmap.get("paranoid");
        Assert.assertEquals(3,frequency);
    }

    @Test
    public void deleteGivenWord_fromString() {
        String str="avoidable";
        HashMap<String,Integer> hashmap=new HashMap<>();
        String[] words=str.toLowerCase().split(" ");
        for(String s:words){
            Integer value = hashmap.get(s);
            if(value==null)
                value=1;
            else
                value++;
            hashmap.add(s,value);
        }
        LinkedList ll = new LinkedList();
        ll.delete("avoidable");
        Integer frequency = hashmap.get("avoidable");
        Assert.assertEquals(null,frequency);
    }
}
