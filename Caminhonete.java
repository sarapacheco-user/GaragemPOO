public class Caminhonete extends Veiculo{
    protected boolean carregada;
    public Caminhonete(double peso,boolean carregada){
        super(peso);
        this.carregada = carregada;
    }

    @Override
    
    public double calcularTarifa(){
        if(peso < 3000){
            return 25.00;
        }else if(peso <= 6000){
            return carregada ? 50.00 : 25.00;
        }else {
            return 0.00;
        }
    }


    @Override
    public boolean podeEstacionar(){
        return peso <= 6000;
    }
}
