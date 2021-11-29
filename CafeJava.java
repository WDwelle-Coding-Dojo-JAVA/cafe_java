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
        double dripCoffeePrice = 1.5;
        double latte = 3.0;
        double cappucino = 3.25;
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Noah";
        String customer3 = "Sam";
        String customer4 = "Jimmy";
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        //System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(displayTotalMessage + dripCoffeePrice);
        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage + displayTotalMessage + cappucino);
        }
        else{
            System.out.println(customer2 + pendingMessage);
        }s
        System.out.println(customer3 + displayTotalMessage + latte*2);
        if(isReadyOrder3){
            System.out.println(customer3 + readyMessage);
        }
        else{
            System.out.println(customer3 + pendingMessage);
        }
        System.out.println(customer4 + displayTotalMessage + (latte - dripCoffeePrice));
    }
}
