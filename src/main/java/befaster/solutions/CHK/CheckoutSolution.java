package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int totalPrice = 0;
        int[] counter = {0, 0, 0, 0, 0};
        int[] totalPrices = {0, 0, 0, 0, 0};
        if(skus.isEmpty()) {
            return totalPrice;
        }
        else {
            for (int i = 0; i < skus.length(); i++) {
                if (skus.charAt(i) == 'A' || skus.charAt(i) == 'B' || skus.charAt(i) == 'C' || skus.charAt(i) == 'D' || skus.charAt(i) == 'E') {
                    switch (skus.charAt(i)) {
                        case 'A':
                            counter[0]++;
                            break;
                        case 'B':
                            counter[1]++;
                            break;
                        case 'C':
                            counter[2]++;
                            break;
                        case 'D':
                            counter[3]++;
                            break;
                        case 'E':
                            counter[4]++;
                            break;
                    }
                } else {
                    return -1;
                }
            }
        }
        while(counter[0] > 0){
            if(counter[0] >= 5){
                totalPrices[0] = totalPrices[0] + 200;
                counter[0] = counter[0] - 5;
            }
            else if(counter[0] >= 3) {
                totalPrices[0] = totalPrices[0] + 130;
                counter[0] = counter[0] - 3;
            }
            else {
                totalPrices[0] += counter[0] * 50;
                counter[0] = 0;
            }
        }

        while(counter[1] > 0){
            if (counter[4] >= 2) {
                counter[1]--;
                totalPrices[4] = totalPrices[4] + 80;
                counter[4] = counter[4] - 2;
            }
            if(counter[1] >= 2){
                totalPrices[1] = totalPrices[1] + 45;
                counter[1] = counter[1] - 2;
            }
            else {
                totalPrices[1] += counter[1] * 30;
                counter[1] = 0;
            }
        }
        totalPrices[4] = totalPrices[4] + counter[4] * 40;
        totalPrices[2] = counter[2] * 20;
        totalPrices[3] = counter[3] * 15;
        for(int j = 0; j<5; j++)
        {
            totalPrice = totalPrice + totalPrices[j];
        }
        return totalPrice;
    }
}






