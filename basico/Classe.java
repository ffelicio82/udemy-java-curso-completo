package basico;

import java.util.Scanner;

class Classe {
    public static void main(String[] args) {
        Media media = new Media();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        media.setX(scanner.nextDouble());

        System.out.println("Digite o segundo número: ");
        media.setY(scanner.nextDouble());

        System.out.println("Media (objeto): " + media);
        System.out.println("A média é: " + media.calcular());

        scanner.close();
    }
}
