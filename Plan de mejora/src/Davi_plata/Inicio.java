package Davi_plata;
import java.util.Scanner;
public class Inicio {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String nombre, nombreUsuario;
        int Contraseña;

        Login login=new Login();

        System.out.println("Digite Su Nombre: ");
        nombre=teclado.next();
        System.out.println("Escribe tu Nombre de Usuario: ");
        nombreUsuario=teclado.next();
        System.out.println("Escribe tu Contraseña: ");
        Contraseña=teclado.nextInt();

        login.ingresar();
        
        System.out.println("Nombre: " +nombre);
        System.out.println("nombreUsuario: " +nombreUsuario);
        System.out.println("Contraseña: " +Contraseña);
// -------------------------------------------------------------------------------------------------------------- //
        int eleccion=1;
        int decisionUsuario=1;

        if (decisionUsuario==1) {

        while (decisionUsuario==1) {    
        
        System.out.println("Marca 1 Para Retirar Dinero. Marca 2 Para Depositar Dinero. Marca 3 Para Consultar tu saldo. Marca 4 Para Recargar.");
        eleccion=teclado. nextInt();
        int dineroTotal=0, dineroSacar, dineroRest=0;
        switch (eleccion) {
            case 1:

            SacarDinero sacarDinero=new SacarDinero();
    
            System.out.println("¿Cuanto es el total de Dinero que tienes en tu Cuenta?");
            dineroTotal=teclado.nextInt();
            System.out.println("¿Cuanto Dinero desea Retirar?");
            dineroSacar=teclado.nextInt();
    
            sacarDinero.retirarDinero();
    
            dineroRest=dineroTotal-dineroSacar;
    
            if (dineroSacar>dineroTotal){
                System.out.println("Lo sentimos, La operacion no puede ser realizada, fondos insufucientes");
            } else {
                System.out.println("Su dinero se ha retirado correctamente, su saldo es:" +dineroRest);
            }
            break;
            case 2:
            int dineroInt, dineroNew;
            
            System.out.println("¿Cuanto Dinero Desea Dpositar?");
            dineroInt=teclado.nextInt();
            
            dineroNew=dineroRest+dineroInt;
            
            
            System.out.println("El valor de su cuenta se ha actualizado correctamente, Su total ahora es:" +dineroNew);
            break;
            case 3:
            int saldo=50000;
            
            ConsultarSaldo consultarSaldo=new ConsultarSaldo();
            
            System.out.println("Tu saldo es: " +saldo);
            
            consultarSaldo.consultaSaldo();
            break;
            case 4:
            int recarga, numero, valorRec;

            Recargas recargas=new Recargas();

            System.out.println("Numero a hacer recarga: ");
            numero=teclado.nextInt();
            System.out.println("Valor de la recarga: ");
            valorRec=teclado.nextInt();

            recarga=valorRec;
            System.out.println("La recarga fue de: " +recarga);
            System.out.println("¡¡¡MUCHAS GRACIAS POR USAR NUESTROS SERVICIOS!!!");
            break;
        }
        System.out.println("Quieres hacer alguna accion mas? 1=si 0=no");
        decisionUsuario=teclado.nextInt();
        
    }
} else {
    System.out.println("Graciaaas");
}
    teclado.close(); 
    }
}