public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//task1
        int[] money = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < money.length; index++) {
            sum +=generateRandomArray()[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
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
