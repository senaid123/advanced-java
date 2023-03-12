public class Main {
    public static void main(String[] args) {
        int i = 10;

        //Autobox
        Integer obj = Integer.valueOf(i);
        System.out.println("Value of integer obj :" + obj);

        //Unboxing
        int i1 = obj;
        System.out.println("Value of int is : " + i1 );

        char a = 's';
        Character objS = Character.valueOf(a);
        System.out.println("Value of Character : " + objS);

        char a1 = objS;
        System.out.println("value of char is " + a1);
    }
}