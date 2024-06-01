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
        totalPrices[6] += counter[6] * 20; // G
        while(counter[7] > 0) {
            if(counter[7] >= 10)
            {
                totalPrices[7] = totalPrices[7] + 80;
                counter[7] = counter[7] - 10;
            }
            else if(counter[7] >= 5){
                totalPrices[7] = totalPrices[7] + 45;
                counter[7] = counter[7] - 5;
            }
            else {
                totalPrices[7] += counter[7] * 10;
                counter[7] = 0;
            }
        }
        totalPrices[8] = counter[8] * 35; // I
        totalPrices[9] = counter[9] * 60; // J
        while(counter[10] > 0){
            if(counter[10] >= 2){
                totalPrices[10] += 150;
                counter[10] -= 2;
            }
            else {
                totalPrices[10] += counter[10] * 80;
                counter[10] = 0;
            }
        }
        totalPrices[11] = counter[11] * 90; // L

        while(counter[12] > 0){
            while(counter[13] >= 3)
            {
                totalPrices[13] += 120;
                counter[13] -= 3;
                counter[12] -= 1;
            }
            totalPrices[12] += counter[12] * 15;
            counter[12] = 0;

        }
        totalPrices[13] = counter[13] * 40;
        totalPrices[14] = counter[14] * 10; // O
        while(counter[15] > 0)
        {
            if(counter[15] >= 5){
                totalPrices[15] += 200;
                counter[15] -= 5;
            }
            else {
                totalPrices[15] += counter[15] * 50;
                counter[15] = 0;
            }
        }
        totalPrices[16] = counter[16] * 30; // Q (edit)
        while(counter[16] > 0){
            while(counter[17] >= 3)
            {
                totalPrices[17] = totalPrices[17] + 150;
                counter[17] = counter[17] - 3;
                counter[16] = counter[16] - 1;
            }
            if(counter[16] >= 3) {
                totalPrices[16] += 80;
                counter[16] -=3;
            }
            else {
                totalPrices[16] += counter[16] * 30;
                counter[16] = 0;
            }
        }
        totalPrices[17] = counter[17] * 50; // R (edit)


        totalPrices[18] = counter[18] * 30; // S
        totalPrices[19] = counter[19] * 20; // T
        totalPrices[20] = counter[20] * 40; // U (edit)
        while(counter[20] > 0){
            if(counter[20] >= 3)
            {
                totalPrices[20] += 80;
                counter[20] -= 3;
            }
            else {
                totalPrices[20] += counter[20] * 40;
                counter[20] = 0;
            }
        }
        totalPrices[21] = counter[21] * 50; // V (edit)
        while(counter[21] > 0)
        {
            if(counter[21] >= 3){
                totalPrices[21] += 130;
                counter[21] -= 3;
            }
            else if(counter[21] == 2){
                totalPrices[21] += 90;
                counter[21] -=2;
            }
            else {
                totalPrices[21] += 50;
                counter[21] = 0;
            }
        }
        totalPrices[22] = counter[22] * 20; // W
        totalPrices[23] = counter[23] * 90; // X
        totalPrices[24] = counter[24] * 10; // Y
        totalPrices[25] = counter[25] * 50; // Z

        for(int j = 0; j<26; j++)
        {
            totalPrice = totalPrice + totalPrices[j];
        }
        return totalPrice;
    }
}

