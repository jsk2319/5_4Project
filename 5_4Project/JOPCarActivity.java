/**
 * @author Jude Kallista-Fitzpatrick
 *Date:11/29/2017
 *Purpose: To have the user input the make, color, engine size, and horsepower of 3 cars. After the info for each car is submitted, the info will be displayed in JOP.
 */

import CarPack.*;
import javax.swing.*;
import java.util.*;

public class JOPCarActivity {
    public static void main(String[] args) {
        //Taking user input for my car
        String myCarInput = JOptionPane.showInputDialog(null,"Enter the make, color, engine size, and horsepower separated by a space. ");
        Scanner carScanner = new Scanner(myCarInput).useDelimiter(" ");
            Car myCar = new Car(carScanner.next(), carScanner.next(), carScanner.nextDouble(), carScanner.nextInt());
            JOptionPane.showMessageDialog(null, "Your car was " + myCar);
        //Taking user input for his car
        String herCarInput = JOptionPane.showInputDialog(null,"Enter the make, color, engine size, and horsepower separated by a space. ");
        Scanner hercarScanner = new Scanner(herCarInput).useDelimiter(" ");
            Car herCar = new Car(hercarScanner.next(), hercarScanner.next(), hercarScanner.nextDouble(), hercarScanner.nextInt());
            JOptionPane.showMessageDialog(null, "Her car was " + herCar);
        //Taking user input for her car
        String hisCarInput = JOptionPane.showInputDialog(null,"Enter the make, color, engine size, and horsepower separated by a space. ");
        Scanner hiscarScanner = new Scanner(hisCarInput).useDelimiter(" ");
            Car hisCar = new Car(hiscarScanner.next(), hiscarScanner.next(), hiscarScanner.nextDouble(), hiscarScanner.nextInt());
            JOptionPane.showMessageDialog(null, "His car was " + hisCar);

    }
}