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
                System.out.println("--- RONDA 1 ---");

        // Pregunta 1
        System.out.println("Pregunta 1. ¿Qué tipo de dato almacena números enteros?");
        System.out.println("A) double");
        System.out.println("B) int");
        System.out.println("C) String");
        System.out.print("Respuesta: ");
        String respuesta1 = teclado.nextLine();
        if (respuesta1.equalsIgnoreCase("B")) {
            System.out.println("¡Correcto!");
            correctas++;
        } else {
            System.out.println("Incorrecto.");
        }
        System.out.println();

        // Pregunta 2
        System.out.println("Pregunta 2. ¿Qué tipo de dato guarda true o false?");
        System.out.println("A) boolean");
        System.out.println("B) char");
        System.out.println("C) int");
        System.out.print("Respuesta: ");
        String respuesta2 = teclado.nextLine();
        if (respuesta2.equalsIgnoreCase("A")) {
            System.out.println("¡Correcto!");
            correctas++;
        } else {
            System.out.println("Incorrecto.");
        }
        System.out.println();

        // Pregunta 3
        System.out.println("Pregunta 3. ¿Qué palabra se usa para declarar una constante?");
        System.out.println("A) static");
        System.out.println("B) const");
        System.out.println("C) final");
        System.out.print("Respuesta: ");
        String respuesta3 = teclado.nextLine();
        if (respuesta3.equalsIgnoreCase("C")) {
            System.out.println("¡Correcto!");
            correctas++;
        } else {
            System.out.println("Incorrecto.");
        }
        System.out.println();
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

        System.out.println();
        System.out.println("Pregunta 5. ¿Qué estructura repite código mientras se cumple una condición?");
        System.out.println("A) if");
        System.out.println("B) while");
        System.out.println("C) else");
        System.out.print("Respuesta: ");
        String respuesta5 = teclado.nextLine();
        if (respuesta5.equals("B") || respuesta5.equals("b")) {
            System.out.println("¡Correcto!");
            correctas++;
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println();
        System.out.println("Pregunta 6. ¿Qué palabra se usa para ejecutar código cuando el if no se cumple?");
        System.out.println("A) then");
        System.out.println("B) otherwise");
        System.out.println("C) else");
        System.out.print("Respuesta: ");
        String respuesta6 = teclado.nextLine();
        if (respuesta6.equals("C") || respuesta6.equals("c")) {
            System.out.println("¡Correcto!");
            correctas++;
        } else {
            System.out.println("Incorrecto");
        }
        // FIN RONDA 2 - Iker

        // RESULTADO FINAL - Iker

    }
}