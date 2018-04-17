package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.parseInt;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> same = new HashMap<>();
        for(int i = 0; i < collectionA.size();++i){
            int count = 1;
            if(collectionA.get(i).contains("-") || collectionA.get(i).contains("[")){
                String content = collectionA.get(i).contains("-")?collectionA.get(i).substring(0,collectionA.get(i).indexOf("-")):collectionA.get(i).substring(0,collectionA.get(i).indexOf("["));
                String parse= collectionA.get(i).contains("-")?collectionA.get(i).substring(collectionA.get(i).indexOf("-")+1,collectionA.get(i).length()):collectionA.get(i).substring(collectionA.get(i).indexOf("[")+1,collectionA.get(i).length()-1);
                count = parseInt(parse);
                collectionA.set(i,content);
            }
            if(same.containsKey(collectionA.get(i))){
                same.put(collectionA.get(i),same.get(collectionA.get(i))+1);
            }else{
                same.put(collectionA.get(i),count);
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
