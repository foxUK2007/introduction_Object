public class Main {
    public static void main(String[] args) {

        Human human1 = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        Human human2 = new Human(1993, "Анна", "Москва", "методист образовательных программ");
        Human human3 = new Human(1992, "Екатерина", "Калининград", "продакт-менеджер");
        Human human4 = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());

        System.out.println();
        System.out.println(" Автомобили ");
        System.out.println();

        Car car1 = new Car("Lada", "Granta", 1.7,"желтый", 2015, "Сборка в России");
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0,"черный", 2020, "Сборка в Германии");
        Car car3 = new Car("BMW", "Z8", 3.0,"черный", 2021, "Сборка в Германии");
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4,"красный", 2018, "Сборка в Южной Корее");
        Car car5 = new Car("Hyundai", "Avante", 1.6,"оранжевый", 2016, "Сборка в Южной Корее");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());
    }
}