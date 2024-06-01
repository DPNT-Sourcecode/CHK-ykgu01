package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int totalPrice = 0;
        int[] counter = new int[4];
        int[] totalPrices = new int[4];
        for(int i = 0; i<skus.length(); i++)
        {
            if(skus.isEmpty())
            {
                totalPrice = 0;
                break;
            }
            if(skus.charAt(i)== 'A' || skus.charAt(i) == 'B' || skus.charAt(i) == 'C' || skus.charAt(i) == 'D')
            {
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
                }
            }
            else {
                return -1;
            }
        }
        while(counter[0] == 0){
        if(counter[0] > 3) {
            totalPrices[0] = totalPrices[0] + 130 * (counter[0] / 3);
            counter[0] = counter[0] - 3;
        }
        else {
            totalPrices[0] = counter[0] * 50;
        }}
        if(counter[1] % 2 == 0){
            totalPrices[1] = totalPrices[1] + 45 * (counter[1] / 2);
        }
        else {
            totalPrices[1] = counter[1] * 30;
        }
        totalPrices[2] = counter[2] * 20;
        totalPrices[3] = counter[3] * 15;
        for(int j = 0; j<4; j++)
        {
            totalPrice = totalPrice + totalPrices[j];
        }
        return totalPrice;
    }
}







