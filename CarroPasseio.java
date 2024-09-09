public class CarroPasseio extends Veiculo{
    private String tipo; // HATCHBACK/SEDAN/SUV

    public CarroPasseio(double peso, String tipo){
        super(peso);
        this.tipo = tipo;
    }

    @Override
    public double calcularTarifa(){
        if (peso> 2000){
            return new Furgao(peso, 0).calcularTarifa();
        }
        if(tipo.toLowerCase() == "hatchback"){
            return 13.00;
        }else if(tipo.toLowerCase() == "sedan"){
            return 15.00;
        }else if (tipo.toLowerCase() == "suv"){
            return 20.00;
        }else{
            return 0.00;
        }
    }

    @Override
    public boolean podeEstacionar(){
        return peso <= 2000;
    }


}
