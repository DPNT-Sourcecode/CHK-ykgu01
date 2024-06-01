package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        String productletter = "";
        int product = 1;
        int totalPrice = 0;
        if (skus.length() == 1 && (skus.charAt(0) == 'A' || skus.charAt(0) == 'B' || skus.charAt(0) == 'C' || skus.charAt(0) == 'D') ) {
            switch (skus.charAt(0)) {
                case 'A':
                    totalPrice = 50;
                    break;
                case 'B':
                    totalPrice = 30;
                    break;
                case 'C':
                    totalPrice = 20;
                    break;
                case 'D':
                    totalPrice = 15;
                    break;
            }
        }
        else if (skus.isEmpty())
        {
            return totalPrice;
        }
        else if(skus.length() > 1){
        for (int i = 0; i < skus.length(); i++) {
            if (Character.isLetter(skus.charAt(i))) {
                switch (skus.charAt(i)) {
                    case 'A':
                        if (product % 3 == 0) {
                            totalPrice = totalPrice + 130 * (product / 3);
                        } else {
                            totalPrice += product * 50;
                        }
                        break;
                    case 'B':
                        if (product % 2 == 0) {
                            totalPrice = totalPrice + 45 * (product / 2);
                        } else {
                            totalPrice += product * 30;
                        }
                        break;
                    case 'C':
                        totalPrice += product * 20;
                        break;
                    case 'D':
                        totalPrice += product * 15;
                        break;
                }
                product = 1;
                productletter = "";
            } else if (Character.isDigit(skus.charAt(i))) {
                productletter += skus.charAt(i);
                product = Integer.parseInt(productletter);
            }
        }
    }
        else {
            return -1;
        }
        return totalPrice;
    }
}









