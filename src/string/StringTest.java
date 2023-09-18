package string;

public class StringTest {

    public static void main(String[] args) {

        String test = true + "" + 1;
        System.out.println("test = " + test);

        String test2 = " " + true + " ";
        System.out.println("test2 = " + test2);

        String test3 = null + " " + null;
        System.out.println("test3 = " + test3);

        String test4 = " " + null + null + "   ";
        System.out.println("test4 = " + test4);

        System.out.println((4/(float)3));

        char c1 = 'a';
        char c2 = (char)(c1+1);
        System.out.println("c2 = " + (int)c2);

        String s1 = "Hello World";
        String s2 = "Hello World";

        System.out.println(s1 == s2);  // true

        int a[] = new int[]{1,2,3,4,5};

        int[] b = a.clone();

        System.out.println(a==b);

        int[][] ar = {{1,2,3}, {4,5,6}};

        for (int[] ints : ar) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}
