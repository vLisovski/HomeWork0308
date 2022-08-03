import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByTest {

    public static void main(String[] args) {

        TestCars car1= new TestCars("Audi",1800,280,false);
        TestCars car2=new TestCars("Audi",1700,390,true);
        TestCars car3=new TestCars("BMW",1700,320,false);
        TestCars car4=new TestCars("BMW",1900,480,true);
        TestCars car5=new TestCars("Mercedes",1800,180,false);
        TestCars car6=new TestCars("Mercedes",2100,580,true);
        TestCars car7=new TestCars("Ford",1500,180,false);
        TestCars car8=new TestCars("Ford",1600,220,false);
        TestCars car9=new TestCars("Lada",1400,110,false);
        TestCars car10=new TestCars("Daewoo",1100,80,false);


        List<TestCars> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);


        Map<Integer, List<TestCars>> map1 = cars
                .stream()
                .collect(Collectors.groupingBy(TestCars::getPower));

        Map<Integer, List<TestCars>> map2 = cars
                .stream()
                .collect(Collectors.groupingBy(TestCars::getWeigh));

        Map<String, List<TestCars>> map3 = cars
                .stream()
                .collect(Collectors.groupingBy(TestCars::getName));

        Map<Boolean, List<TestCars>> map4 = cars
                .stream()
                .collect(Collectors.groupingBy(TestCars::isTuned));

        Map<String, Double> map5 = cars
                .stream()
                .collect(Collectors.groupingBy(TestCars::getName,
                        Collectors.averagingInt(TestCars::getPower)));



        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);
        System.out.println(map4);
        System.out.println(map5);



    }
}
