package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int totalPrice = 0;
        int[] counter = new int[26];
        int[] totalPrices = new int[26];
        if(skus.isEmpty()) {
            return totalPrice;
        }
        else {
            for (int i = 0; i < skus.length(); i++) {
                if (skus.charAt(i) >= 'A' && skus.charAt(i) <= 'Z') {
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
                        case 'F':
                            counter[5]++;
                            break;
                        case 'G':
                            counter[6]++;
                            break;
                        case 'H':
                            counter[7]++;
                            break;
                        case 'I':
                            counter[8]++;
                            break;
                        case 'J':
                            counter[9]++;
                            break;
                        case 'K':
                            counter[10]++;
                            break;
                        case 'L':
                            counter[11]++;
                            break;
                        case 'M':
                            counter[12]++;
                            break;
                        case 'N':
                            counter[13]++;
                            break;
                        case 'O':
                            counter[14]++;
                            break;
                        case 'P':
                            counter[15]++;
                            break;
                        case 'Q':
                            counter[16]++;
                            break;
                        case 'R':
                            counter[17]++;
                            break;
                        case 'S':
                            counter[18]++;
                            break;
                        case 'T':
                            counter[19]++;
                            break;
                        case 'U':
                            counter[20]++;
                            break;
                        case 'V':
                            counter[21]++;
                            break;
                        case 'W':
                            counter[22]++;
                            break;
                        case 'X':
                            counter[23]++;
                            break;
                        case 'Y':
                            counter[24]++;
                            break;
                        case 'Z':
                            counter[25]++;
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
            while(counter[4] >= 2)
            {
                totalPrices[4] = totalPrices[4] + 80;
                counter[4] = counter[4] - 2;
                counter[1] = counter[1] - 1;
            }
            if(counter[1] >= 2){
                totalPrices[1] = totalPrices[1] + 45;
                counter[1] = counter[1] - 2;
            }
            else if(counter[1] == 1){
                totalPrices[1] += 30;
                counter[1] = 0;
            }
        }
        totalPrices[4] = totalPrices[4] + counter[4] * 40;
        totalPrices[2] = counter[2] * 20;
        totalPrices[3] = counter[3] * 15;
        while(counter[5] > 0) {
            if(counter[5] >= 3){
                totalPrices[5] = totalPrices[5] + 20;
                counter[5] = counter[5] - 3;
            }
            else {
                totalPrices[5] += counter[5] * 10;
                counter[5] = 0;
            }
        }
        for(int j = 0; j<6; j++)
        {
            totalPrice = totalPrice + totalPrices[j];
        }
        return totalPrice;
    }
}


