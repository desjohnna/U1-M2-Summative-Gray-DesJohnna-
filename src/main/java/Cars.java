import java.util.ArrayList;
import java.util.Scanner;

//Setting as abstract to make all sub classes require these variables
public  class Cars  {

    //creating variables
    private String make;
    private String model;
    private int year;
    private String color;
    private double odometerMiles;
    private int carId = 0;

    //making an arrayList holding no elements to begin adding cars to.
    ArrayList<String> carMasterList = new ArrayList<>();




    Cars(){}

    //creating a constructor for all variables
    public Cars(String make, String model, int year, String color, double odometerMiles) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.odometerMiles = odometerMiles;
    }
    //getters and setters for all variables
    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getOdometerMiles() {
        return this.odometerMiles;
    }

    public void setOdometerMiles(double odometerMiles) {
        this.odometerMiles = odometerMiles;
    }


    //interface methods
    public void add(String make, String model, String year, String color, String odometerMiles){
        ArrayList<String> nameVar = new ArrayList<String>();
        nameVar.add(make);
        nameVar.add(model);
        nameVar.add(year);
        nameVar.add(color);
        nameVar.add(odometerMiles);

        System.out.println(nameVar);

        carId++;

        carMasterList.addAll(nameVar);
        System.out.println(carMasterList);

    }

    public void delete(){

    }

    public void list() {

    }

    public void search(){

    }










}

