public class ForLoop {
    public static void main(String[] args) {
        String[] names = {"Cristina", "Paul", "Maria", "John"};
        // Uso más común, recorrer arrays
        for (int i=0; i < names.length; i++){
            // puedo parar el código añadiendo breakpoints pulsando el número de la línea en intelliJ
            // el código se ejecuta en debug cuando pulsamos 🪲
            System.out.println(names[i]);
        }

        // O bien ejecutar el mismo código múltiples veces

        for (int i=0; i< 10; i++){
            System.out.println("El índice es: "+i);
        }

    }




}
