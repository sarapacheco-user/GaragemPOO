public class Motocicleta extends Veiculo{
    public Motocicleta(double peso){
        super(peso);
    }
    @Override
    public double calcularTarifa(){
        if(peso<100){
            return 2.00;
        }else if(peso >100.1 && peso < 300){
            return 4.00;
        }else{
            return 10.00;
        }
    }
    @Override
    public boolean podeEstacionar(){
        return peso <= 400;
    }
}
