package motorbike;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        ducati.setSpeed(100);

        ducati.increaseSpeed(50);

        System.out.println(ducati.getSpeed());

        ducati.decreaseSpeed(40);
        System.out.println(ducati.getSpeed());
    }
}
