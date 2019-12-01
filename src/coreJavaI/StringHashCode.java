package coreJavaI;

public class StringHashCode {
    public static void main(String[] args) {
        String s = new String();
        s = "hello";
        int hash = 0;
        String t = new String();
        t = "hello";
        for (int i=0; i<s.length(); i++) {
            hash = 31 * hash + s.charAt(i);
        }
        System.out.println(hash);
        System.out.println(s.hashCode());
        System.out.println(t.hashCode());
        System.out.println(s==t);
    }
}
