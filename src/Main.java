import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String nome;
        int idade;

        Scanner teclado = new Scanner(System.in);
        System.out.println("What is your Name?");

        nome = teclado.nextLine();

        System.out.println("olá "+nome+" è um desprazer ter voce aqui");

        System.out.println("How old are you?");

        idade = teclado.nextInt();

        System.out.println("sua idade è: "+idade+" anos");

//       System.out.println("A aula começou a ficar bacana");
//        System.out.println("mentira, esta uma bosta!!!!");

    }
}