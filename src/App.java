import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ejercicio3();
    }

    
    
    public static void ejercicio1() {
        int a = 1;
        while (a < 3){
            System.out.println("a es menor que 10: " + a);
            //No tenemos avance
            a++;
        }
        System.out.println("fuera del ciclo while");
    }

    public static void ejercicio2(){
        var lector = new Scanner(System.in);

        int edad = 0;
        System.out.println("ingrese una edad valida: ");
        int edadDigitada = lector.nextInt();

        while (edadDigitada < 0 ) {
            System.out.println("la edad valida debe ser positiva, intente de nuevo");
            System.out.println("ingrese una edad valida: ");
            edadDigitada = lector.nextInt();
        }
        System.out.println("La edad ingresada es correcta");


    }

    public static void ejercicio3(){
        var lector = new Scanner(System.in);
        String passwordVerdadero = "123";
        System.out.println("ingrese su password");
        String passwordIngresado = lector.nextLine();

        while (!passwordVerdadero.equals(passwordIngresado)) {
            System.out.println("password incorrecto. Intente de nuevo");
            System.out.println("ingrese su password: ");
            passwordIngresado = lector.nextLine();
        }
        System.out.println("Acceso permitido");

    }

    public static void ejercicio4(){
        var lector = new Scanner(System.in);
        String passwordVerdadero = "123";
        String passwordIngresado = "";

        do {
            System.out.println("ingrese su pássword: ");
            passwordIngresado = lector.nextLine();

            if (!passwordVerdadero.equals(passwordIngresado)){
                System.out.println("password incorrecto. Intente de nuevo");
            }

        } while (!passwordVerdadero.equals(passwordIngresado));

        System.out.println( "Acceso permitido");
    }

    public static void ejercicio5(){
        var lector = new Scanner(System.in);
        String passwordVerdadero = "123";
        String passwordIngresado = "";

        while (true){
            System.out.println("ingrese su password: ");
            passwordIngresado = lector.nextLine();

            if (!passwordVerdadero.equals(passwordIngresado)){
                System.out.println("password incorrecto. Intente de nuevo: ");
            }
            else{
                break;
            }
        
        }


        System.out.println("Acceso permitido");
    }
}
