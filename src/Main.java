public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
int []arr = generateRandomArray();
        for (int j : arr) {
            System.out.println(j);

        }

//task1
        int[] money = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < money.length; index++) {
            sum +=generateRandomArray()[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        //task 2
        int maxSpending = 90000;
        for (int i = 0; i < money.length; i++) {
            if (money[i]>maxSpending) {
                maxSpending = money[i];
            }
        }
        System.out.println(maxSpending);
        int minSpending = 300000;
        for (int i = 0; i < money.length; i++) {
            if (money[i]<minSpending) {
                minSpending = money[i];
            }
        }
        System.out.println(minSpending);
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    }
