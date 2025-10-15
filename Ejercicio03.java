import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una palabra o frase: ");
        String texto = sc.nextLine().toLowerCase().replaceAll(" ", "");

        Pila pila = new Pila();
        Cola cola = new Cola();

        for (char c : texto.toCharArray()) {
            pila.push(c);
            cola.enqueue(String.valueOf(c));
        }

        boolean esPalindromo = true;
        while (!pila.isEmpty()) {
            if (pila.pop() != cola.dequeue().charAt(0)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("Es palíndromo.");
        } else {
            System.out.println("No es palíndromo.");
        }
    }
}