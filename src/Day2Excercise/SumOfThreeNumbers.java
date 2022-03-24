package Day2Excercise;

public class SumOfThreeNumbers {
    public static int sumofThreeNumbers(int num1, int num2, int num3){
        int sum=num1+num2+num3;
       // System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
       SumOfThreeNumbers sc=new SumOfThreeNumbers();
        System.out.print(sc.sumofThreeNumbers(3,4,6));
        System.out.println("\n");
        System.out.print(sc.angles(30,40));
    }

    public int angles(int angle1,int angle2){
        int thirdAngle=180-(angle1+angle2);
        return thirdAngle;
    }
}
