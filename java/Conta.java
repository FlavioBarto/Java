public class Conta {
    private double saldo;

    public Conta(){

    }
    public Conta(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double deposito(double valor){
        return saldo += valor;
    }
    public double sacar(double valor) throws ContaExcecao{
        if(saldo < valor){
            throw new ContaExcecao(valor);
        }
        else{
            return saldo -= valor;
        }
    }
}