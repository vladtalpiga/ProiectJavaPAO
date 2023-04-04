import Booking.CarBooking;
import Booking.HouseBooking;
import People.Client;
import Properties.Car;
import Service.RentCar;
import Service.RentHouse;
import Properties.House;
import People.Owner;
import Service.myComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        RentCar rentCar = new RentCar();

        Client c1 = new Client("Vlad", 20, "Bucharest", 7000);
        Client c2 = new Client("Alex", 27, "Paris", 5000);
        Client c3 = new Client("Jasmine", 27, "London", 15000);
        Client c4 = new Client("Laura", 27, "Rome", 2000);
        Client c5 = new Client("Gabi", 52, "Budapest", 30000);
        List <Client> clients = new ArrayList<>();
        clients.add(c1);
        clients.add(c2);
        clients.add(c3);
        clients.add(c4);
        clients.add(c5);
        rentCar.setClients(clients);

        Car car1 = new Car(500, "Mercedes", 2023);
        Car car2 = new Car(1200, "Bugatti", 2011);
        Car car3 = new Car(700, "Porsche", 2016);
        Car car4 = new Car(850, "Lamborghini", 2017);
        Car car5 = new Car(1100, "Ferrari", 2009);
        Car car6 = new Car(900, "Aston Martin", 2016);
        Car car7 = new Car(1000, "McLaren", 2022);
        Car car8 = new Car(100, "BMW", 2009);
        Car car9 = new Car(300, "Audi", 2016);
        Car car10 = new Car(250, "Tesla", 2019);
        Car car11 = new Car(1500, "AMG", 2023);
        Car car12 = new Car(1200, "Koenigsegg", 2011);
        Car car13 = new Car(700, "Lexus", 2016);
        List <Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        rentCar.setCars(cars);

        List<CarBooking> carBookings = new ArrayList<>();

        CarBooking cb1 = new CarBooking(c1, 5, car10);
        CarBooking cb2 = new CarBooking(c1, 7, car11);
        CarBooking cb3 = new CarBooking(c2, 10, car12);
        CarBooking cb4 = new CarBooking(c3, 3, car13);
        carBookings.add(cb1);
        carBookings.add(cb2);
        carBookings.add(cb3);
        carBookings.add(cb4);

        rentCar.setCarBookings(carBookings);


        RentHouse rentHouse = new RentHouse();

        Owner o1 = new Owner("David", 37, "Berlin");
        Owner o2 = new Owner("Ionut", 22, "Lisbon");
        Owner o3 = new Owner("Virgil", 25, "Budapest");
        TreeSet <Owner> owners = new TreeSet<>(new myComparator());
        owners.add(o1);
        owners.add(o2);
        owners.add(o3);
        rentHouse.setOwners(owners);

        List <House> houses = new ArrayList<>();
        House h1 = new House(700, o1,200, 5, "Barcelona");
        House h2 = new House(150, o1,30, 1, "Barcelona");
        House h3 = new House(900, o2,200, 7, "Barcelona");
        House h4 = new House(1500, o3,100, 10, "Barcelona");
        House h5 = new House(100, o1, 10, 1, "London");
        House h6 = new House(700, o1, 90, 6, "London");
        House h7 = new House(500, o3, 50, 3, "London");
        House h8 = new House(900, o1, 150, 7, "Rome");
        House h9 = new House(400, o2, 30, 2, "Rome");
        House h10 = new House(300, o2, 40, 2, "Rome");
        House h11 = new House(100, o1, 20, 1, "Paris");
        House h12 = new House(600, o2, 80, 6, "Paris");
        House h13 = new House(900, o3, 150, 10, "Paris");
//        houses.add(h1);
        houses.add(h2);
        houses.add(h3);
        houses.add(h4);
//        houses.add(h5);
        houses.add(h6);
        houses.add(h7);
//        houses.add(h8);
        houses.add(h9);
        houses.add(h10);
        houses.add(h11);
        houses.add(h12);
//        houses.add(h13);
        rentHouse.setHouses(houses);

        List <HouseBooking> houseBookings = new ArrayList<>();

        HouseBooking hb1 = new HouseBooking(c1, 5, h13);
        HouseBooking hb2 = new HouseBooking(c1, 3, h1);
        HouseBooking hb3 = new HouseBooking(c4, 8, h8);
        HouseBooking hb4 = new HouseBooking(c5, 7, h5);
        houseBookings.add(hb1);
        houseBookings.add(hb2);
        houseBookings.add(hb3);
        houseBookings.add(hb4);

        rentHouse.setHouseBookings(houseBookings);


        while (true) {
            System.out.println("\nChoose one of the following actions:");
            System.out.println("1. Car rental");
            System.out.println("2. Real estate rental");
//            System.out.println("3. Rent an apartment");
//            System.out.println("4. Manage people");
            System.out.println("0. Exit");

            Scanner input = new Scanner(System.in);
            int option = Integer.parseInt(input.nextLine());

            switch (option) {
                case 0: {
                    System.exit(0);
                }
                case 1: {
                    rentCar.menuRentCar();
                    break;
                }
                case 2: {
                    rentHouse.menuRentHouse();
                    break;
                }
                default: {
                    System.out.println("\nPlease enter a valid option!");
                }
            }
        }



//        App app = App.getInstance();
//        app.start();
//        Owner o1 = new Owner("David", 77, "pp", 999);
//        Owner o2 = new Owner("Ionut", 77, "pp", 999);
//
//        Car car1 = new Car(580, "Mercedes", 2022);
//        Car car2 = new Car(123, "mmm", 890);
//        Car car3 = new Car(123, "mmm", 890);
//
//        House h1 = new House(200, o1,2, 555, "buh");
//        House h2 = new House(500, o2, 2, 555, "hun");
//
//        Apartment a1 = new Apartment(200, o2, 2, 999, "bcn", 8);
//        Apartment a2 = new Apartment(200, o1, 2, 999, "ppp", 8);
//
//        System.out.println(car1.toString());
//        System.out.println(car2.toString());
//        System.out.println(car3.toString());
//
//        System.out.println(h1.toString());
//        System.out.println(h2.toString());
//
//        System.out.println(a1.toString());
//        System.out.println(a2.toString());
    }
}