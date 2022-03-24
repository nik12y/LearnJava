package motorbike;

public class MotorBike {

    //Performing Encapsulation;
    private int speed;
    MotorBike(){
        this.decreaseSpeed(50);
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed>0)
        this.speed = speed;
//        System.out.println(speed);
//        System.out.println(this.speed);

    }

    public void increaseSpeed(int howmuch){
        this.speed=this.speed+howmuch;
    }
    public void decreaseSpeed(int howmuch){
        this.speed=this.speed-howmuch;
    }
}
//

