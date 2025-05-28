public class Predio implements EmissaoCarbono{
    private int pessoas;
    private boolean lampLed;
    private int qtdLampLed;
    private int qtdArCondicionado;
    private boolean EnergiaRenovavel;
    public Predio(){

    }
    public Predio(int pessoas, boolean lampLed, int qtdLampLed, int qtdArCondicionado, boolean EnergiaRenovavel){
        this.pessoas = pessoas;
        this.lampLed = lampLed;
        this.qtdLampLed = qtdLampLed;
        this.qtdArCondicionado = qtdArCondicionado;
        this.EnergiaRenovavel = EnergiaRenovavel;
    }

    public int getPessoas() {
        return pessoas;
    }
    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }
    public boolean isLampLed() {
        return lampLed;
    }
    public void setLampLed(boolean lampLed) {
        this.lampLed = lampLed;
    }
    public int getQtdLampLed() {
        return qtdLampLed;
    }
    public void setQtdLampLed(int qtdLampLed) {
        this.qtdLampLed = qtdLampLed;
    }
    public int getQtdArCondicionado() {
        return qtdArCondicionado;
    }
    public void setQtdArCondicionado(int qtdArCondicionado) {
        this.qtdArCondicionado = qtdArCondicionado;
    }
    public boolean isEnergiaRenovavel() {
        return EnergiaRenovavel;
    }
    public void setEnergiaRenovavel(boolean energiaRenovavel) {
        EnergiaRenovavel = energiaRenovavel;
    }

    public double qtdEmitida(){
        double carbono = 0;
        if(EnergiaRenovavel = false){
        carbono = 14.4 * qtdLampLed + 10*pessoas + 100 * qtdArCondicionado;
            return carbono;
        }else if(EnergiaRenovavel = true){
            carbono = (14.4 * qtdLampLed + 10*pessoas + 100 * qtdArCondicionado) / 2;
            return carbono;
        }
       return 0; 
    }
}
