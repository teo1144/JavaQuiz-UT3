import java.util.Scanner;

public class JavaQuiz {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int correctas = 0;

        System.out.println();
        System.out.println("========== JAVAQUIZ ==========");
        System.out.println("Concurso de preguntas sobre Java");
        System.out.println("Responde escribiendo A, B o C.");
        System.out.println();
        // INICIO RONDA 1 - Teo

        // FIN RONDA 1 - Teo

        // INICIO RONDA 2 - Iker
        System.out.println();
        System.out.println("--- RONDA 2 ---");
        System.out.println("Pregunta 4. ¿Cuál es el primer índice de un array en Java?");
        System.out.println("A) 1");
        System.out.println("B) -1");
        System.out.println("C) 0");
        System.out.print("Respuesta: ");
        String respuesta4 = teclado.nextLine();
        if (respuesta4.equals("C") || respuesta4.equals("c")) {
            System.out.println("¡Correcto!");
            correctas++;
        } else {
            System.out.println("Incorrecto");
        }
        // FIN RONDA 2 - Iker

        // RESULTADO FINAL - Iker

    }
}