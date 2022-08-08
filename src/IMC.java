import java.awt.*;
import java.text.DecimalFormat;
import java.util.Optional;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        double peso,altura,imc;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat valor = new DecimalFormat("#0.00");
        System.out.println("Cálculo do IMC");

        System.out.println("Qual o seu peso?: ");
        peso = scanner.nextDouble();
        System.out.println("Qual o sua altura?: ");
        altura = scanner.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("IMC: " + valor.format(imc));
        scanner.close();

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc < 30) {
            System.out.println("Levemente acima do peso");
        } else if (imc < 35) {
            System.out.println("Obesidade grau I");
        } else if (imc < 40) {
            System.out.println("Obesidade grau II (severa)");
        } else  {
            System.out.println("Obesidade grau III (mórbida)");
        }
    }
}
