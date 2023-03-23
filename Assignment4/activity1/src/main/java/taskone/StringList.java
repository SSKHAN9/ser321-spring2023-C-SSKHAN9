package taskone;

import java.util.List;
import java.util.ArrayList;

class StringList {
    
    List<String> strings = new ArrayList<String>();

    public void add(String str) {
        int pos = strings.indexOf(str);
        if (pos < 0) {
            strings.add(str);
        }
    }


    public String toString() {

        return strings.toString();
    }

    public void clear() {

        if (!strings.isEmpty()) {
            strings.clear();
        }
    }

    public String find(String str) {
        int index = -1;
        if (!strings.isEmpty()) {
            index = strings.indexOf(str);
        }
        return Integer.toString(index);
    }

    public String prepend(int i, String sb){
        strings.add(i-1, sb);
        return strings.toString();
    }

    public String delete(int index){
        strings.remove(index);
        return strings.toString();
    }
}