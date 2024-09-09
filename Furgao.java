public class Furgao extends Veiculo{
    private double volume;

    public Furgao(double peso, double volume){
        super(peso);
        this.volume = volume;
    }

    @Override
    public double calcularTarifa(){
        if(peso <= 3000){
            return 25.00;
        }else if (peso <= 6000){
            return volume <= 18000 ? 50.00 : 0.00;
        }else {
            return 0.00;
        }
    }

@Override
public boolean podeEstacionar(){
    return peso <= 6000 && volume <= 18000;
    }


}
