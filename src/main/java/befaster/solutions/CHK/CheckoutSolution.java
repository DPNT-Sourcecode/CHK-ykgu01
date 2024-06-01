package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int totalPrice = 0;
        int counter[4];
        for(int i = 0; i<skus.length(); i++)
        {
            if(skus.charAt(i)== 'A' || skus.charAt(i) == 'B' || skus.charAt(i) == 'C' || skus.charAt(i) == 'D')
            {
                if(skus.charAt(i) == skus.charAt(i+1))
                {
                    counter++;
                }
                switch (skus.charAt(i)) {
                    case 'A':

                        break;
                    case 'B':

                        break;
                    case 'C':

                        break;
                    case 'D':

                        break;
                }

            }
            else {
                return -1;
            }
        }

    }
}



