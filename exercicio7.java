import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double lado, area, dobroArea;

            System.out.print("Digite o tamanho do lado do quadrado: ");
            lado = scanner.nextDouble();

            area = lado * lado;
        }
        String area;
        Object dobroArea = ("area * 2");

        System.out.println("A área do quadrado é " + area);
        System.out.println("O dobro da área do quadrado é " + dobroArea);
    }
}

