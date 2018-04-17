package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> same = new ArrayList<>();
        for(int i = 0; i < collection1.size();++i){
            for(int k = 0;k < collection2.size();++k){
                for(int j = 0; j < collection2.get(k).size();++j){
                    if(collection1.get(i) == collection2.get(k).get(j)){
                        same.add(collection1.get(i));
                    }
                }
            }
        }
        return same;
    }
}
