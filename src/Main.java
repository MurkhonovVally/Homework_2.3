public class Main {
    public static void main(String[] args) {
        Bicycle[] bicycles = {
                new Bicycle("Моноцикл", 1),
                new Bicycle("Велосипед", 2)
        };
        Car[] cars = {
                new Car("Трицикл", 3),
                new Car("Машина", 4)
        };
        Truck[] trucks = {
                new Truck("Внедорожник", 4),
                new Truck("Трэкол", 6)
        };

        ServiceStation station = new ServiceStation();
        for (Bicycle bicycle : bicycles) {
            station.check(bicycle);
        }
        for (Car car : cars) {
            station.check(car);
        }
        for (Truck truck : trucks) {
            station.check(truck);
        }
    }
}



