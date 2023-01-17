/*
this program computes the distance light travels using long variables
*/


public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // approximate speed of light in miles per second
        lightspeed =186000;

        days =1000; //specific number of days
        seconds =days*24*60*60; //converting days to seconds
        distance =lightspeed*seconds; //we know that distance= speed*time

        System.out.println("In "+ days);
        System.out.println(" light will travel about ");
        System.out.println(distance + " miles. ");
        
    }
}
