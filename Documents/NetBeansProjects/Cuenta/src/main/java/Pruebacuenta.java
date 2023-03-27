import java.util.*;

public class Pruebacuenta {
    public static void main(String[] args){
        cuenta cuenta1 = new cuenta(50.00);
        cuenta cuenta2 = new cuenta(-7.53);
        
        System.out.printf("Saldo de cuenta1: $%.2f\n",
                cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta2: $%.2f\n",
                cuenta2.obtenerSaldo());
        
        Scanner entrada = new Scanner(System.in);
        double montoDeposito;
        double montoSacar;
        
        System.out.print("Escriba el monto a depositar para cuenta1: ");
        montoDeposito = entrada.nextDouble();
        System.out.printf("\nsumando %2.f al saldo de cuenta1\n\n",
                montoDeposito);
        
        System.out.printf("Escriba el monto a sacar de la cuenta1: ");
        montoSacar = entrada.nextDouble();
        System.out.printf("\nsacando %2.f del saldo de la cuenta1\n\n",
                montoSacar);
        
        System.out.printf("Saldo de cuenta1: $%.2f\n",
                cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta2: $%.2f\n",
                cuenta2.obtenerSaldo());
    }
}
