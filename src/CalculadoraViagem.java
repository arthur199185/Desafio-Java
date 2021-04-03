import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class CalculadoraViagem {

    private final float custoKm;

    public CalculadoraViagem(float custoKm) {
        this.custoKm = custoKm;
    }

    public RetornoTrecho consultarTrecho(String cidade1, String cidade2){
        List<String> linhas = lerArquivo();
        int posicaoCidade1 = acharPosicao(linhas.get(0),cidade1);
        int posicaoCidade2 = acharPosicao(linhas.get(0),cidade2);
        int distanciaFinal = verificaDistancia(posicaoCidade1, posicaoCidade2, linhas);
        float custoFinal = distanciaFinal * custoKm;
        return new RetornoTrecho(distanciaFinal, custoFinal);
    }

    private List<String> lerArquivo(){
        try{
            return Files.readAllLines(Paths.get("src/DNIT-Distancias.csv"));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private int acharPosicao(String cidades, String nomeCidade){
        String[] posicaoCidade = cidades.split(";");
        for (int i = 0; i < posicaoCidade.length; i++) {
            String cidadeAtual = posicaoCidade[i];
            if (cidadeAtual.equals(nomeCidade)){
                return i;
            }
        }
        return -1;
    }
    private int verificaDistancia(int posicaoCidade1, int posicaoCidade2, List<String> linhas){
        String linha = linhas.get(posicaoCidade1 + 1);
        String[] cidadeFinal = linha.split(";");
        return Integer.parseInt(cidadeFinal[posicaoCidade2]);
    }
}
