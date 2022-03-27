package Day1Excercise;

public class PrintNumbers {
    public static void main(String[] args) {
        System.out.println("print from 1 to 10");
        for (int i=1;i<=10;i++){
            System.out.println(i);

        }
        System.out.println("    ");
        System.out.println("print from 10 to 1");
        for (int j=10;j>0;j--){
            System.out.println(j);
        }
        System.out.println("    ");
        System.out.println("print square of first 10 numbers ");
        for (int i=1;i<=10;i++){
            System.out.println(i*i);
       }
        System.out.println("    ");
        System.out.println("print square of first 10 Even numbers");
        for (int i=1;i<=10;i++){
            if(i%2==0)
                System.out.println(i*i);
        }
        System.out.println("    ");
        System.out.println("print square of first 10 Odd Numbers");
        for (int i=1;i<=10;i++){
            if(i%2==1)
                System.out.println(i*i);
        }
    }
}
