
import javax.swing.JOptionPane;
public class RPGCharacter {

    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */
    public static void main(String[] args) {

        String name;
        String strength;
        String dexterity;
        String spirit;

        name= JOptionPane.showInputDialog("What is you characters name ");
        strength = JOptionPane.showInputDialog("How much strength does your character have ");
        dexterity = JOptionPane.showInputDialog("How much dexterity does your character have" );
        spirit = JOptionPane.showInputDialog("How much spirit does your character have" );


        System.out.println(name);
        System.out.println("Strength=" + strength);
        System.out.println("Dexterity=" + dexterity);
        System.out.println("Spirit=" + spirit);














    }

}
