/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Temp {
    public static void main(final String[] args) {
        int temp = 25;

        if (temp > 25){
            System.out.println("Conditioner is on");
        } else if (temp < 25) {
            System.out.println("Conditioner is off");
        } else {
            System.out.println("Temperature is " + temp);
        }
    }
}
