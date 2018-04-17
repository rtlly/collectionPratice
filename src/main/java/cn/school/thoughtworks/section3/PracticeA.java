package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        for(String key : collectionA.keySet()){
            int j = 0;
            while(j < object.get("value").size() && !key.equals(object.get("value").get(j))){
                ++j;
            }
            if(j < object.get("value").size()){
                collectionA.replace(key,collectionA.get(key)-1);
            }
        }
        return collectionA;
    }
}
