package Classes;

public class Gear implements Mechanismable {
    float radius;

    public Gear (float radius){
        this.radius = radius;
    }
    public float Moving(float speed){
        if (speed > 0)
            return (float)(2*3.14*radius)/speed;
        else
            return 0;
    }

    public void Show(float speed){
        System.out.println("Work gear with radius - " + radius + " and speed: " + speed + " moved to " + Moving(speed)+" metres");
    }
}
