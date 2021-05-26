package src.main.java.test;

import com.sun.prism.impl.Disposer;
import src.main.java.person.Record;

import java.util.*;

public class DuplicateKey {
    public static void main(String[] args) {
        DuplicateKey dk = new DuplicateKey();
        List<Record> testList = dk.getTestList();
        testList.forEach(System.out::println);
        Map<String, Record> noDup = new HashMap<String, Record>();
        for (Record re : testList) {
            if (!noDup.containsKey(re.getKey())) {
                noDup.put(re.getKey(), re);
            } else {
                Record tempRe = noDup.get(re.getKey());
                tempRe.setValue(tempRe.getValue() + re.getValue());
                noDup.put(re.getKey(), tempRe);
            }
        }
        noDup.entrySet().forEach(System.out::println);
    }

    public List<Record> getTestList() {
        List<Record> records = new ArrayList<>();
        Random ra = new Random();
        for (int i = 1; i < 11; i++) {
            Record re = new Record();
                if (i % 2 == 0) {
                    re.setKey("偶数");
                } else {
                re.setKey("奇数");
            }
            re.setValue(ra.nextInt(100));
            records.add(re);
        }
        return records;
    }
}
