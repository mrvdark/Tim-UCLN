
public class Ucln {

    public static void main(String[] args) {
        int a=(int)(Math.random()*1000);
        int b=(int)(Math.random()*1000);
        System.out.println("a = "+a+"\nb = "+b);
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("UCLN la: "+a);
    }

}