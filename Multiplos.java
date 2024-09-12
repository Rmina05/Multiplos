import java.util.Scanner;

public class Multiplos {
     public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        String resultado = verificarmultiplos(num1, num2);
        System.out.println(resultado);

        scanner.close();
    }


    public static String verificarmultiplos(int num1, int num2) {
     
        }
        if (num1 % num2 == 0) {
            return num1 + " es múltiplo de " + num2;
        } else if (num2 % num1 == 0) {
            return num2 + " es múltiplo de " + num1;
        } else {
            return "Ninguno de los dos es múltiplo del otro";
        }
    }
}
