/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class FastFood {
    public static void main(final String[] args) {
        int money = 8;

        if (money > 15){
            System.out.println("I'll buy pizza");
        } else if (money < 10) {
            System.out.println("I'll buy hot-dog");
        } else {
            System.out.println("I'll buy kebab");
        }
    }
}
