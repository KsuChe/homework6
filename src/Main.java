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
        for (int j = 0; j < money.length; j++) {
            sum +=generateRandomArray()[j];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        //task 2
        int maxSpending = 90000;
        for (int j : money) {
            if (j > maxSpending) {
                maxSpending = j;
            }
        }
        System.out.println(maxSpending);
        int minSpending = 300000;
        for (int j : money) {
            if (j < minSpending) {
                minSpending = j;
            }
        }
        System.out.println(minSpending);
        System.out.println();

        //task3
        double average = 0;
        if (money.length>0) {
            double Sum = 0;
            for (int j = 0; j < money.length; j++) {
                sum += generateRandomArray()[j];
            }
            average = sum / money.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println();

        //task4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
for (int i = reverseFullName.length-1;i>=0;i--) {
    System.out.print(reverseFullName[i] + " ");
}
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
