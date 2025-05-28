public class Carro implements EmissaoCarbono{
    private String veiculo;
    private String combustivel;
    private int KMrodado;

    public Carro(){

    }
    public Carro( String combustivel, int KMrodado){
        this.KMrodado = KMrodado;
        this.combustivel = combustivel;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public int getKMrodado() {
        return KMrodado;
    }
    public void setKMrodado(int kMrodado) {
        KMrodado = kMrodado;
    }

    public double qtdEmitida(){
        double carbono = 0;
        if (getCombustivel().equalsIgnoreCase("alcool")  ||  getCombustivel().equalsIgnoreCase("gasolina")){
            carbono = 96 * KMrodado;
            return carbono;
        } else if (getCombustivel().equalsIgnoreCase("eletrico")){
            carbono = 53 * KMrodado;
        } else if (getCombustivel().equalsIgnoreCase("diesel")){
            carbono = 171 * KMrodado;
        } else if (getCombustivel().equalsIgnoreCase("bicicleta")){
            return 0;
        }
        return 0;
    }
    
}
