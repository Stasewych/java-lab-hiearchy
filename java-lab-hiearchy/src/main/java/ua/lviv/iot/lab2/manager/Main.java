package ua.lviv.iot.lab2.manager;


import ua.lviv.iot.lab2.hierarchy.Machine;
import ua.lviv.iot.lab2.hierarchy.SkippingRope;
import ua.lviv.iot.lab2.hierarchy.StationaryBike;
import ua.lviv.iot.lab2.hierarchy.Treadmill;
import ua.lviv.iot.lab2.manager.Manager;
import ua.lviv.iot.lab2.manager.Gym;

public class Main {

  public static void main(String[] args) {
    Treadmill treadmill1 = new Treadmill(10, 5, 5, 10, "treadmill");
    StationaryBike stationaryBike1 = new StationaryBike(20, 10, 10, 1000, "starionarybike");
    SkippingRope skippingRope1 = new SkippingRope(0, 10, 15, "skakalka", 120);
    Machine[] arrOfMachines = { treadmill1, stationaryBike1, skippingRope1 };
    Manager manager = new Manager(arrOfMachines);
    Gym gym = new Gym(manager);
    manager.sortArrayByCash();
    manager.sortArrayByCashR();
    manager.sortArrayByCalories();
    manager.sortArrayByCaloriesR();
    manager.createExercisePlan();

  }

}
