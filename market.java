import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class market{
    public static void main(String args[]){
        
        freshFood apple = new freshFood("apple", 1.25, 9,3 , 4);
        freshFood lettuce = new freshFood("lettuce", 1.75,3, 5, 6);
        frozenFood iceCream = new frozenFood("iceCream", 1.25, 3, 3, -10.3);
        frozenFood peas = new frozenFood("peas", 1.25, 2,3 , -23.2);
        grocery beans = new grocery("beans", 1.50,3 , 23);

        ArrayList<grocery> clearInv = new ArrayList<>(Arrays.asList());
        System.out.println("a");
        employee e1 = new employee(100, "Gerald", 22, 1.43, 11.32, 6, 3, .43, true, 8);
        System.out.println("b");

        shopper s1 = new shopper(100, "Joe", 25, 19.34, clearInv, 2, .41, true, 8);
        System.out.println(s1.getBalance());
        s1.buy(peas);
        System.out.println(s1.getBalance());
        System.out.println("Grocery store.");
        ArrayList<grocery> list = new ArrayList<>();
        list.add(apple);
        list.add(lettuce);
        list.add(iceCream);
        list.add(peas);
        list.add(beans);
        int s = (int)(Math.random()*4 +1);

        System.out.println(list.get(s).toString());
        s1.attack(e1);
        e1.speak("HEY!");
        
        employee e2 = new employee(100, "Gerald", 22, 1.43, 11.32, 6, 3, .85 ,true, 8);
        employee s2 = new employee(100, "Jimmy", 22, 1.43, 11.32, 6, 3, .85 ,true, 8);
        employee s3 = new employee(100, "Jimmy", 22, 1.43, 11.32, 6, 3, .85 ,true, 8);
        employee s4 = new employee(100, "Jimmy", 22, 1.43, 11.32, 6, 3, .85 ,true, 8);
        employee s5 = new employee(100, "Jimmy", 22, 1.43, 11.32, 6, 3, .85 ,true, 8);
        employee s6 = new employee(100, "Jimmy", 22, 1.43, 11.32, 6, 3, .85 ,true, 8);
        employee s7 = new employee(100, "Jimmy", 22, 1.43, 11.32, 6, 3, .85 ,true, 8);
        employee s8 = new employee(100, "Jimmy", 22, 1.43, 11.32, 6, 3, .85 ,true, 8);
        employee s9 = new employee(100, "Jimmy", 22, 1.43, 11.32, 6, 3, .85 ,true, 8);
        employee s10 = new employee(100, "Jimmy", 22, 1.43, 11.32, 6, 3, .85 ,true, 8);

        System.out.println("stuck");

        TemporalControl t1 = new TemporalControl();

        ArrayList<person> peoples = new ArrayList<person>();
        peoples.add(s1);
        peoples.add(s2);
        peoples.add(e1);
        peoples.add(e2);
        peoples.add(s3);
        peoples.add(s4);
        peoples.add(s5);
        peoples.add(s6);
        peoples.add(s7);
        peoples.add(s8);
        peoples.add(s9);
        peoples.add(s10);
        Floor fl1 = new Floor(true, peoples);
        person p1 = new person(100, "John", 21, 48.8, 2, 23, true, 5);
        person p2 = new person(s, "Steve", 23, 43.3, 2, 12, true, 5);
        ArrayList<person> personz = new ArrayList<person>();
        personz.add(p1);
        personz.add(p2);
        Floor floor1 = new Floor(true, personz);
        Fight fight1 = new Fight(p1, p2, floor1);


        // HashMap<grocery, Integer> stock = new HashMap<>(lettuce,1,iceCream,2);

        // HashMap<grocery, Integer> stock = new HashMap<>(lettuce, iceCream); 
        // Store traderjoes = new Store();

    }
}