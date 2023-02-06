import java.util.ArrayList;
public class CafeUtil {

    int getStreakGoal(){
        int sum = 0;
        for(int i = 1 ; i < 11;i++){
            sum += i;
        }
        return sum;
    }

    double getOrderTotal(double[]prices){
        double sum = 0 ;
        for(int i = 0; i < prices.length;i++){
            sum += prices[i];
        }
        return sum;
    }

    void displayMenu(ArrayList<String>menuitems){
        for(int i = 0; i < menuitems.size();i++){
            System.out.println(menuitems.get(i));
        }
    }

    void addCustomer(ArrayList<String>customers){
        System.out.println("Please Enter your name: ");
        String userName = System.console().readLine();
        System.out.printf("hello %s there are %d customers in front of you",userName,customers.size());
        customers.add(userName);
    }









}
