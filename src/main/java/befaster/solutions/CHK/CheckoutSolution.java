package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int totalPrice = 0;
        int[] counter = new int[4];
        for(int i = 0; i<skus.length(); i++)
        {
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

    }
}




