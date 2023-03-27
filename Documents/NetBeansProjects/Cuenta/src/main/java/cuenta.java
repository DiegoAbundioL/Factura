
public class cuenta {
    private double saldo;
    
    public cuenta(double saldoInicial){
        if(saldoInicial>0.0)
            saldo = saldoInicial;
    }
    
    public void abonar(double monto){
        saldo = saldo + monto;
    }
    public void cargar(double monto){
        if(monto<saldo){
            saldo = saldo - monto;
    } else{
    System.out.printf("El monto a cargar excede el saldo d esu cuenta.");
        }
    }  
    public void establecerSaldo(double saldo){
        this.saldo = saldo;
    }
    public double obtenerSaldo(){
        return saldo;
    }

}
