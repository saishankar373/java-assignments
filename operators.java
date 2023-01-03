import java.io.*;

class operators{
    public static void main(String[] args){
        int a = 10;
        int b = 5;

        //arithemetic operators
        int sum = a+b;
        System.out.println("Addition of a and b:"+ sum );
        int sub = a-b;
        System.out.println("Subtraction of a and b:"+ sub);
        int mul = a*b;
        System.out.println("Multiplication of a and b:"+ mul);
        int div = a/b;
        System.out.println("Divison of a and b:"+ div);
        int mod = a%b;
        System.out.println("Modulo of a and b:"+ mod);

        //relational operators
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);

        //logical operators
        int x = 6;
        System.out.println(x<=a && x>=b);
        System.out.println(x<=a || x>=b);
        System.out.println(!(x<=a && x>=b));

        //bitwise operators
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(a << 2);
        System.out.println(a >> 2);

        //assignment operator
        int k = 15;

        //conditional operator
        int n=(k==15)?30:20;
        System.out.println(n);

        //increment or decrement operator
        a++;
        System.out.println(a);
        b--;
        System.out.println(b);

        //compound operator
        a += b;
        System.out.println(a);
        a -= b;
        System.out.println(a);
        a *= b;
        System.out.println(a);
        a /= b;
        System.out.println(a);
        a %= b;
        System.out.println(a);





        


    }
}