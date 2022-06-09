import java.time.LocalDate;

public class Cuenta {
    private double saldo;
    private String numero;
    private LocalDate fechaApertura;

    public Cuenta(double saldo, String numero) {
        this.saldo = saldo;
        this.numero=numero;
        fechaApertura = LocalDate.now();
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void depositar (double saldo){

    }
    private  boolean validarSaldoNegativo(double saldo){
        if(saldo>0){
        return true;
        }else {
            return IllegalStateException;
        }
    }
}
