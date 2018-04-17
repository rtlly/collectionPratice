package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> same = new HashMap<>();
        for(int i = 0; i < collection1.size();++i){
            if(same.containsKey(collection1.get(i))){
                same.put(collection1.get(i),same.get(collection1.get(i))+1);
            }else{
                same.put(collection1.get(i),1);
            }
        }
        return same;
    }
}
