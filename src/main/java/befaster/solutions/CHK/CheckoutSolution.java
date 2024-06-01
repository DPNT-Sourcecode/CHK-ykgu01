package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int product = 1;
        String sku = "";
        int totalPrice = 0;
        for(int i = 0; i<skus.length(); i++) {
            if(!Character.isLetter(skus.charAt(i))) {
                switch(skus.charAt(i)) {
                    case 'A':
                        if(product % 3 == 0)
                        {
                            totalPrice = totalPrice + 130;
                        }
                        else {
                            totalPrice += product * 50;
                        }
                        break;
                    case 'B':
                        totalPrice += product * 30;
                        break;
                    case 'C':
                        totalPrice += product * 20;
                        break;
                    case 'D':
                        totalPrice += product * 15;
                        break;
                }
                product = 1;
            }
            else {
                product = Integer.parseInt(String.valueOf(skus.charAt(i)));
            }
        }
    }
}





