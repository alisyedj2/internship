import java.util.HashMap;
import java.util.Scanner;

public class RomanToNumber{
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
            RomanToNumber r = new RomanToNumber();
            int ans = r.romanToInt(s);
            if(ans==-1) System.out.print("enter valid roman number");
            else System.out.println(ans);
    }
        public int romanToInt(String s) {
            if(s.contains("LL")||s.contains("DD")||s.contains("VV")) return -1;
            HashMap<Character, Integer> map = new HashMap<>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);
            int sum=0,prev=0,c=1;
            char[] a=s.toCharArray();
            for(int i=a.length-1;i>-1;i--)
            {
                if(!map.containsKey(a[i])) return -1;
                if(prev>map.get(a[i])){
                    sum-=map.get(a[i]);
                    c=1;
                }
                else{
                    if(prev==map.get(a[i])){
                        c++;
                        if(c==4) return -1;
                    }
                    else c=1;
                    sum+=map.get(a[i]);
                }
                prev=map.get(a[i]);
            }
             return sum;
        }
}

