package greg.financialApp;

import com.sun.source.tree.EnhancedForLoopTree;

import java.util.*;

public class Test2 {



    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        List<String> strList = new ArrayList<>();
        strList.add("1");
        strList.add("3");
        strList.add("5");
        List<Integer> intList = new ArrayList<>();
        Set<Integer> setList = new HashSet<>();
        setList.add(1);
        setList.add(2);
        setList.add(3);
        List<Integer> temp = new ArrayList<>(setList);
        HashMap<String, Integer> hashMapa = new HashMap<>();

        hashMapa.put("pierwszy", 1);
        hashMapa.put("czwarty", 1);
        hashMapa.put("drugi", 2);
        hashMapa.put("trzeci", 3);

        String asdad = "pierwszy";


        if(hashMapa.get("pierwszy").equals(1)){
            System.out.println("password is good");
        }
        else {
            System.out.println("nie pasuje");
        }





    }
}
