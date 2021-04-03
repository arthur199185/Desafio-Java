public class RetornoTrecho {

    private final double distancia;
    private final float custoTotal;

    public RetornoTrecho(double distancia, float custoTotal) {
        this.distancia = distancia;
        this.custoTotal = custoTotal;
    }

    public double getDistancia() {
        return distancia;
    }

    public float getCustoTotal() {
        return custoTotal;
    }

    @Override
    public String toString() {
        return "Retorno solicitado{" +
                " Distancia=" + distancia +
                ",Custo Total=" + custoTotal +
                '}';
    }
}
