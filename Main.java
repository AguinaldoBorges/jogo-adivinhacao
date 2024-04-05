import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentNumber = 0, lastNumber = 0, playerChoose = 1;
        double randomNumber = (Math.random() * 6) + 1;
        currentNumber = (int) randomNumber;
        Scanner scanner = new Scanner(System.in);

        inicio: while (lastNumber == 0) {
            System.out.println("Numero: " + currentNumber);
            System.out.println("O proximo numero sera maior ou menor?");
            System.out.println("1 =maior e 2 =menor");
            playerChoose = scanner.nextInt();

            double randomLastNumber = (Math.random() * 6) + 1;
            lastNumber = (int) randomLastNumber;

            if (playerChoose == 1) {
                System.out.println("");
                System.out.println("Escolha: MAIOR");
                if (currentNumber < lastNumber) {
                    System.out.println(lastNumber + " maior que " + currentNumber);
                    System.out.println("GANHOU!");
                } else if (currentNumber > lastNumber) {
                    System.out.println(lastNumber + " menor que " + currentNumber);
                    System.out.println("PERDEU!");
                } else {
                    System.out.println(lastNumber + " igual a " + currentNumber);
                    System.out.println("EMPATE");
                    continue inicio;
                }
            } else if (playerChoose == 2) {
                System.out.println("");
                System.out.println("Escolha: MENOR");
                if (currentNumber > lastNumber) {
                    System.out.println(lastNumber + " menor que " + currentNumber);
                    System.out.println("GANHOU!");
                } else if (currentNumber < lastNumber) {
                    System.out.println(lastNumber + " maior que " + currentNumber);
                    System.out.println("PERDEU!");
                } else {
                    System.out.println(lastNumber + " igual a " + currentNumber);
                    System.out.println("EMPATE");
                    continue inicio;
                }
            } else {
                lastNumber = 0;
                System.out.println("Numero invalido!");
                continue inicio;
            }
        }

        scanner.close();

    }

}