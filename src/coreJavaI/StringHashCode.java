package coreJavaI;

public class StringHashCode {
    public static void main(String[] args) {
        String s = "h";
        int hash = 0;
        for (int i=0; i<s.length(); i++) {
            hash = 31 * hash + s.charAt(i);
        }
        System.out.println(hash);
        System.out.println(s.hashCode());
        System.out.println((int)s.charAt(0));
    }
}
