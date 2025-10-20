public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicios");
    }

    // Ejercicio 15 octubre - 11
    static int binarioADecimal(String numero) {
        return Integer.parseInt(numero, 2);
    }

    // Ejercicio 15 octubre - 12
    static int octalADecimal(String numero) {
        return Integer.parseInt(numero, 8);
    }

    // Ejercicio 15 octubre - 13
    static int hexadecimalADecimal(String numero) {
        return Integer.parseInt(numero, 16);
    }

    // Ejercicio 15 octubre - 14
    static void decimalABinOctHex(int numero) {
        System.out.println(Integer.toBinaryString(numero));
        System.out.println(Integer.toOctalString(numero));
        System.out.println(Integer.toHexString(numero));
    }

    // Ejercicio 16 octubre - 8
    static String decoraTexto(String texto) {
        return "=== " + texto + " ===";
    }

    // Ejercicio 16 octubre - 9
    static String formateaNombre(String nombre, String apellidos) {
        return apellidos + ", " + nombre;
    }

    // Ejercicio 16 octubre - 10
    static boolean aprobado(double nota1, double nota2, double nota3) {
        double media = nota1 + nota2 + nota3 / 3;
        return media >= 5;
    }

    // Ejercicio 16 octubre - 11
    static void alumnoAprobado(String nombre, String apellidos, double nota1, double nota2, double nota3) {
        boolean aprobado = aprobado(nota1, nota2, nota3);
        System.out.println(formateaNombre(nombre, apellidos) + " ha aprobado: " + aprobado);
    }
}