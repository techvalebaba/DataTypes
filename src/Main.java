public class Main {
    public static void main(String[] args) {
        byte byte1 = 127; //8 bits //byte1 = 100 - 107 => 0000 1100 min -127 and max=128
        System.out.println("Value of byte1 : "+byte1);

        boolean b = false;  //false 1 bit
        //true - 1
        //false - 0

        System.out.println("Value of boolean variable b :"+b);

        short shrt = -32768; //2 Byte => 16 bits => min =-32,768 and max=32,767

        System.out.println("Value of short variable shrt :"+shrt);

        int a = 10000; //4 bytes data=> 32 bits

        System.out.println("Value for variable a :"+a);
    /* 5. long
        6. float
        7. double
        8. char*/

        long b1 = 1000000; //8 bytes => 64 bits

        float f1 = 34.56766f; // 4 bytes => 32 bits

        double d1 = 76.87676998;  //bytes => 64 bits

        char chr = 'a'; // 2 bytes => 16 bits
        System.out.println("Value of chr : "+chr);

        char chr1 = 97; // b => 98, c=>100

        System.out.println("Value of chr1 : "+chr1);

        Person p = new Person();
    }
}

class Person {
    String name;
    int age;
}