package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> same = new ArrayList<>();
        for(int i = 0;i < collection1.size();++i){
            int j = 0;
            while(j < collection2.get("value").size() && collection1.get(i) != collection2.get("value").get(j)){
                ++j;
            }
            if(j < collection2.get("value").size()){
                same.add(collection1.get(i));
            }
        }
        return same;
    }
}
