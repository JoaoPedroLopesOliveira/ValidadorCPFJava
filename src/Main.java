import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ValidadorCPF validador = new ValidadorCPF();
        System.out.println("Informe o seu CPF ( somente os números): ");
        if (validador.validarCPF(scanner.nextLine())){
            System.out.println("CPF validado com sucesso!");
        }else {
            System.out.println("CPF invalido!");
        }
        scanner.close();
    }
}
