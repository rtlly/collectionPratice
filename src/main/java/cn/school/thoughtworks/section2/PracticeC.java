package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.parseInt;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。

        Map<String,Integer> same = new HashMap<>();
        for(int i = 0; i < collection1.size();++i){
            int count = 1;
            if(collection1.get(i).contains("-") || collection1.get(i).contains("[") || collection1.get(i).contains(":")){
                String content = "";
                String parse = "";
                if(collection1.get(i).contains("-")){
                    content = collection1.get(i).substring(0,collection1.get(i).indexOf("-"));
                    parse = collection1.get(i).substring(collection1.get(i).indexOf("-")+1,collection1.get(i).length());
                }
                else if(collection1.get(i).contains("[")){
                    content = collection1.get(i).substring(0,collection1.get(i).indexOf("["));
                    parse = collection1.get(i).substring(collection1.get(i).indexOf("[")+1,collection1.get(i).indexOf("]"));

                }else{
                    content = collection1.get(i).substring(0,collection1.get(i).indexOf(":"));
                    parse = collection1.get(i).substring(collection1.get(i).indexOf(":")+1,collection1.get(i).length());
                }
                count = parseInt(parse);
                collection1.set(i,content);
            }
            if(same.containsKey(collection1.get(i))){
                same.put(collection1.get(i),same.get(collection1.get(i))+count);
            }else{
                same.put(collection1.get(i),count);
            }
        }
        return same;
    }
}
