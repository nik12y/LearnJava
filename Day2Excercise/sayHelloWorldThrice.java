package Day2Excercise;

public class sayHelloWorldThrice {
    public static void helloWorld(){
        for (int i=1;i<=3;i++){
            System.out.println("Hello World");
        }
    }

    static void excecuteMethod(){
        System.out.println("I have created my first variable");
        System.out.println("I have created my first method");
        System.out.println("I have created my first loop");
        System.out.println("I am excited to learn java");
    }
    public static void main(String[] args) {
       helloWorld();
        System.out.println("    ");
       excecuteMethod();
        System.out.println("    ");
       printNumber(10);
        System.out.println("    ");
        printSquareOfNumber(6);
    }
    //print number from 1 to n!
    static void printNumber(int n){
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
    }

    //print square of number from 1 to n!
    static void printSquareOfNumber(int n){
        for (int j=1;j<=n;j++){
            System.out.println(j*j);
        }
    }

}
