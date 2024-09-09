public abstract class Veiculo {
    protected double peso;

    public Veiculo(double peso){
        this.peso = peso;
    }

    public double getPeso(){
        return peso;
    }

    public abstract double calcularTarifa();
    public abstract boolean podeEstacionar();

}
