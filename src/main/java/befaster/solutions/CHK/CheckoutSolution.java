package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        String product = "";
        int totalPrice = 0;
        for(int i = 0; i<skus.length(); i++) {
            product += skus.charAt(i);
            if(Character.isLetter(skus.charAt(i))) {
                
            }
        }
    }
}


