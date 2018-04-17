package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> same = new HashMap<>();
        for(int i = 0; i < collectionA.size();++i){
            if(same.containsKey(collectionA.get(i))){
                same.put(collectionA.get(i),same.get(collectionA.get(i))+1);
            }else{
                same.put(collectionA.get(i),1);
            }
        }
        for(String key : same.keySet()){
            int j = 0;
            while(j < object.get("value").size() && !key.equals(object.get("value").get(j))){
                ++j;
            }
            if(j < object.get("value").size()){
                same.replace(key,same.get(key)-same.get(key)/3);
            }
        }
        return same;
    }
}
