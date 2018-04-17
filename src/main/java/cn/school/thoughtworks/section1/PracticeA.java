package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> same = new ArrayList<>();
        for(int i = 0; i < collection1.size();++i){
            int j = 0;
            while(j < collection2.size() && collection1.get(i) != collection2.get(j)){
                ++j;
            }
            if(j < collection2.size()){
                same.add(collection1.get(i));
            }
        }
        return same;
    }
}
