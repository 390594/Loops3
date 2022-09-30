public class loops1

{
    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println(" 1 is " + i + " but is less than 15 ");
            i += 1;
        }
    }

    public static void main(String[] args)
    {
        loops1 hw = new loops1();
        hw.run();
    }
}
