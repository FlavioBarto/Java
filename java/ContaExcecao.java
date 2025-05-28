public class ContaExcecao extends Exception {
    private double valor;

    public ContaExcecao(){

    }
    public ContaExcecao(double valor){
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getMessage(){
        return "saque não permitido";
    }
    public String toString(){
        return "voce tentou fazer um saque de: " + valor;
    }
}
