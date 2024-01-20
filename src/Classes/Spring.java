package Classes;

public class Spring implements Mechanismable{
    float length;

    public Spring (float length){
        if (length > 0)
            this.length = length;
        else
            length = 0;
    }
    public float Moving(float power){
        if (power > 0)
            return length*power;
        else
            return 0;
    }

    public void Show(float power){
        System.out.println("Work spring with length - " + length + " and power: " + power + " moved to " + Moving(power)+" metres");
    }
}
