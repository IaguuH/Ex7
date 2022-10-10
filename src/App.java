import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double lado, area, dobro;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Coloque o valor de um lado do quadrado - ");

        lado = teclado.nextDouble();
        area = lado * 4;

        System.out.println("A área é = "+ area);
        dobro = area * 2;
        
        System.out.println("O dobro da área é = "+ dobro);
    }
}