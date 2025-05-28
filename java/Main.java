public class Main {
    public static void main(String[] args) {
        Conta ct = new Conta();
        ct.deposito(200);
        ct.deposito(200);
        try{
            ct.sacar(3000);
        }catch(ContaExcecao e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
        }finally{
            System.out.println("Encerrado");
        }
        
    }
}
