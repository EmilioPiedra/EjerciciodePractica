public class Ahorro extends Cuenta{
    private double interesAnual;

    public Ahorro (double saldo, String numero){
        super(saldo,numero);
    }

    public void retirar (double monto){
        super.setSaldo(super.getSaldo()-monto);
    }

    @Override
    public String getNumero() {
        return super.getNumero();
    }

    public double getInteresAnual() {
        return interesAnual;
    }
    boolean montoValido (){
    return true;
    }
}
