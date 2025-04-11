            int temp = num;

            for (int i = 0; i < n; i++) {
                sum2 += temp % 10;
                temp /= 10;
            }

            for (int i = 0; i < n; i++) {
                sum1 += temp % 10;
                temp /= 10;
