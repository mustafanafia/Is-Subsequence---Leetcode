import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Main o = new Main();

        System.out.println(o.isSubsequence("", ""));


    }

    public boolean isSubsequence(String s, String t) {

        int pt1 =0;
        int pt2 =0;

        while(pt1 < s.length() && pt2 < t.length() ){

        if(s.charAt(pt1) == t.charAt(pt2)){
            pt1++;
            pt2++;
        }
        else{
            pt2++;
        }
    }
        return (pt1 == s.length());

    }

}



/*

    public boolean isSubsequence(String s, String t) {


        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(a);
        System.out.println(b);

        if(t.isEmpty()) return false;


        int pt1 = 0;
        int pt2 = 0;
        int count = 0;

        while(count < a.length){
            if(a[pt1] == b[pt2]){
                pt1++;
                pt2++;
                count++;
            }
            else{
                return false;
            }

        }
        return true;


    }
    */