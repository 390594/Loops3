
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arrays
{
    public static void main(String[] args) {
        String [] strArray = {"Alpha", "Bravo", "Charlie", "Delta", "Echo"};
        for (int z= 0; z < strArray.length; z++) {
            System.out.println(strArray[z]);
        }
        for (int z= 0; z < strArray.length; z++) {
            System.out.print(strArray[z]);
        }
        System.out.println();
        for (int z= 0; z < strArray.length; z++) {
            System.out.print("-" + strArray[z]);
        }
    }
}

