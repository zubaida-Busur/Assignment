public class Vehicle {

    int no_of_wheels;
    String colour;


    public Vehicle(int no_of_wheels, String colour) {
        this.no_of_wheels = no_of_wheels;
        this.colour = colour;
    }

    public Vehicle() {
    }

    public Vehicle(int no_of_wheels) {
        this.no_of_wheels = no_of_wheels;
    }

    public int getpass(){
         int no_of_pass = this.no_of_wheels;
         return no_of_pass;
    }
}
