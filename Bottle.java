public class Bottle {
    double liters; // implement a double variable named "liters"

    Bottle(double liters){ // "Bottle" class constructor
        this.liters = liters; // assignment "liters" variable to "liters" argument
    }

    double getLiters(){ // getter which return "liters"
        return liters;
    }

    void pour(double liters){ // void method which pour a input liters to the selected bottle
        this.liters += liters; // adding a "liters" variable to "liters" argument
    }

    boolean spill(double liters){ // void method which spill a input liters from the selected bottle
        // if/else statement which checked whether "liters" argument is smaller than "liters" variable
        if(this.liters > liters) {
            this.liters -= liters; // deduction a "liters" argument from "liters" variable
        }
        else {
            return false;
        }
        return true;
    }

    void transfer(double liters, Bottle whichBottle){ // void method which transfer liters to the selected bottle
        // if/else statement which checked whether "spill" method is true
        if(this.spill(liters)){
            whichBottle.pour(liters);
        }
        else {
            System.out.println("Not enough liters.");
        }

    }

    public static void main(String[] args) {
        Bottle[] bottle = new Bottle[3]; // created a 3 element "Bottle" class table

        // sets a liters to the table elements
        bottle[0] = new Bottle(1);
        bottle[1] = new Bottle(2);
        bottle[2] = new Bottle(3);

        // examples operations on bottles
        bottle[0].pour(10);
        bottle[1].spill(5);
        bottle[0].transfer(5, bottle[2]);


        // prints a liters
        System.out.println(bottle[0].getLiters());
        System.out.println(bottle[1].getLiters());
        System.out.println(bottle[2].getLiters());
    }
}
