public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double drip_coffee = 2.5;
        double latte = 2.8;
        double cappuccino = 4.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";  
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(customer1 + pendingMessage);
    	// ** Your customer interaction print statements will go here ** //
        
        if (isReadyOrder2){
            System.out.println (customer2 + readyMessage);
            System.out.println(displayTotalMessage + cappuccino);
        }else{System.out.println(customer2 + pendingMessage);}

        System.out.println(generalGreeting + customer3);
        double total = latte *2;
        System.out.println(displayTotalMessage + total); 
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage); 
        } else {
            System.out.println(customer3 + pendingMessage); 
        }
        isReadyOrder3 = !isReadyOrder3;
                if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
        } else {
            System.out.println(customer3 + pendingMessage); 
        }


        System.out.println(generalGreeting + customer4); 
        double correctedTotal = latte - drip_coffee;
        System.out.println(displayTotalMessage + correctedTotal);
        
    }
}
