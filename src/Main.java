public class Main {

    public static void main (String[] args){
        ClockDisplay clockDisplay = new ClockDisplay(5,59,59);
        System.out.println(clockDisplay.getTime());

        clockDisplay.timeTick();
        System.out.println(clockDisplay.getTime());

        clockDisplay.secondTick();
        System.out.println(clockDisplay.getTime());

        System.out.println();

        ClockDisplay clockDisplay2 = new ClockDisplay(3,59,59);
        clockDisplay2.secondTick();
        System.out.println(clockDisplay2.getTime());
    }



}
