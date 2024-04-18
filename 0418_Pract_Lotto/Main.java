//이재석
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("[로또 당첨 프로그램]");

        Scanner scanner = new Scanner(System.in);
        System.out.println("로또의 개수를 입력해 주세요(숫자 1~10):");
        int buyNum = scanner.nextInt();

        Random random = new Random();

        int[][] buyLottNums = new int[buyNum][6];


        for (int j = 0; j < buyNum; j++) {

            System.out.print("로또 " + (j + 1) + " 번호: ");

            Set<Integer> uniqueNumbers = new HashSet<>();
            while (uniqueNumbers.size() < 6) {
                int number = random.nextInt(45) + 1;
                if (!uniqueNumbers.contains(number)) {
                    uniqueNumbers.add(number);
                }
            }

            int index = 0;
            for (int number : uniqueNumbers) {
                buyLottNums[j][index++] = number;
                System.out.print(number);
                if (index < 6) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        Set<Integer> uniqueWinNumbers = new HashSet<>();

        System.out.print("[당첨 번호] ");
        while (uniqueWinNumbers.size() < 6) {
            int number = random.nextInt(45) + 1;
            if (!uniqueWinNumbers.contains(number)) {
                uniqueWinNumbers.add(number);
            }
        }
        int index = 0;
        for (int number : uniqueWinNumbers) {
            System.out.print(number);
            if (index < 5) {
                System.out.print(" ");
            }
            index++;
        }
        System.out.println();


        System.out.println("[내 로또 결과]");
        for (int j = 0; j < buyNum; j++) {
            int numRight = 0;
            System.out.print("로또 " + (j + 1) + " 결과: ");
            for (int i = 0; i < 6; i++) {
                if (uniqueWinNumbers.contains(buyLottNums[j][i])) {
                    numRight++;
                }
                System.out.print(buyLottNums[j][i]);
                if (i < 5) {
                    System.out.print(" ");
                }
            }
            System.out.println(" (맞은 숫자: " + numRight + ")");
        }
    }
}