package tasks.task10;

public class Main {
    public static boolean palindrom(String str){
        str=str.toLowerCase();
        if (str.length()<=1)
            return true;
        if (str.charAt(0)!=str.charAt(str.length()-1))
            return false;
        return palindrom(str.substring(1,str.length()-1));
    }
    public static int withoutTwoZero(int a, int b){
        if(a==0){
            return 1;
        }
        else if (a==1){
            return b+1;
        }
        else if (b==0 && a>1){
            return 0;
        }
        else if(a>b+1){
            return 0;
        }
        else {
            return withoutTwoZero(a - 1, b - 1)+withoutTwoZero(a, b - 1);
        }
    }
    public static String reverse(int a, String str){
        if (a%10==0)
            return str;
        return reverse(a/10,str+a%10);
    }
    public static void main(String[] args) {
        // 8 задание
        System.out.print(palindrom("Hello")+"\n");
        System.out.print(palindrom("Woppow")+"\n");
        // 9 задание
        System.out.print(withoutTwoZero(2,3)+"\n");
        System.out.print(withoutTwoZero(3,1)+"\n");
        // 10 задание
        System.out.print(reverse(321,""));
    }
}
