public class Methods {

    public static int addNumbers(int numberA, int numberB) { // definimos el método
        // int numberA e int numberB son parámetros. Cualquier int que nos llegue cuando llamamos al método
        return numberA + numberB;
    }

    public static int subNumbers(int numberA, int numberB) { // definimos el método
        return numberA - numberB;
    }

    public static double calculateArea(double radius) {
        double pi = Math.PI;
        // to calculate a radius we need to multiply pi by the radius squared
        return pi * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        System.out.println(addNumbers(10, 10)); // ejecutamos el método
        System.out.println(addNumbers(30, 12));
        System.out.println(subNumbers(20,10));
    }

}
