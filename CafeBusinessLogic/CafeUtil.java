import java.util.ArrayList;
public class CafeUtil{
    int getStreakGoal(int numWeeks){

        int sum  = 0;
        for(int i=0; i<= numWeeks; i++){
            sum = sum + i;
        }
        return sum;
    }
    double getOrderTotal(double[] prices){
        double sum = 0;
        for(int i=0; i< prices.length; i++){
            sum+= prices[i];
        }
        return sum;
    }
    void displayMenu(ArrayList<String> menuItems){
        for(int i=0; i< menuItems.size(); i++){
            System.out.println(i + ": " + menuItems.get(i));
        }
    }
    void addCustomer(ArrayList<String> customers){
        System.out.println("please enter your name");
        String userName = System.console().readLine();
        System.out.println("hello,"+userName+"!");
        System.out.println ("there are "+ customers.size()+" people in front of you");
        customers.add(userName);
        for (int i=0; i< customers.size(); i++){
            System.out.println(i+1 + ": " + customers.get(i));
        }

    }
    void printPriceChart(String product, double price, int maxQuantity){
        System.out.print(product);
        for(int i=1; i<maxQuantity+1; i++){
            System.out.printf("\n %d- $%.2f",i,price*i);
        }
    }
    boolean displayMenu(ArrayList<String> menuItems, double[] prices){
        if(menuItems.size()!= prices.length) return false;
        else {
            for(int i = 0; i < prices.length; i++){
                    System.out.printf("\n %d: %s -- $%.2f", i, menuItems.get(i),prices[i]);
                
            }
            return true;
           
        }
    }

}