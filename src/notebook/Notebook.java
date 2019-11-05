package notebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Notebook {
    private ArrayList<String> notes = new ArrayList<String>();  //  范型类，是一种容器类
    // 容器的类型  ArrayList, 元素的类型<>里面的类型 String
    public void add(String s) {
        notes.add(s);  // ArrayList有一个方法是add()
        // this.size++;  // size++ 也可以
    }

    public void add(String s, int location) {
        notes.add(location, s);
    }

    public int getSize() {
        return notes.size();
    }

    public String getNote(int index) {
        return notes.get(index);
    }

    public void removeNote(int index) {
        notes.remove(index);
    }

    public String[] list() {
        // return a string array
        String[] a = new String[notes.size()]; // 对象数组中，每个元素都是对象的管理者而非对象本身
//        for (int i=0; i<notes.size(); i++) {
//            a[i] = notes.get(i);   // why cannot we use the getNote function?
//        }
        notes.toArray(a);
        return a;
    }

    public static void main(String[] args) {
        Notebook nb = new Notebook();
        nb.add("This is silly!");
        nb.add("What's the time?");
        System.out.println(nb.getSize());
        System.out.println(nb.getNote(1));
        nb.add("Just do it.", 0);
        System.out.println(nb.getNote(0));
        nb.removeNote(0);
        System.out.println(Arrays.toString(nb.list()));

        for (String item : nb.list()) {
            System.out.println(item);
        }
        for (String item : nb.list()) {
            item = "The value was changed";
            System.out.println(item);
        }

        ArrayList<String> a = new ArrayList<String>();
        a.add("Zero");
        a.add("One");
        a.add("Zero");
//        for (String item: a) {
//            System.out.println(item);
//        }
        System.out.println(a);

        HashSet<String> st = new HashSet<String>();  // 集合当中没有重复的元素，并且元素是无序的。
        // 集合元素的三个数学特性：互异性，无序性，确定性
        st.add("zero");
        st.add("one");
        st.add("zero");
//        for (String element : st) {
//            System.out.println(element);
//        }
        System.out.println(st);
    }
}
