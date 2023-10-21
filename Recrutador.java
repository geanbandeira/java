import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Recrutador {
    
    private double maiorPontuacao = Double.NEGATIVE_INFINITY;
    private double menorPontuacao = Double.POSITIVE_INFINITY;
    private double mediaPontuacao = 0;
    private List<Curriculo> maioresPontuacoes;

    public void avaliaCurriculo(Vaga vaga){
        double total = 0;

        for (Curriculo curriculo : vaga.getCurriculos()){
            if(curriculo.getPontuacao() > maiorPontuacao)
                maiorPontuacao = curriculo.getPontuacao();
            if( curriculo.getPontuacao() < menorPontuacao)
                menorPontuacao = curriculo.getPontuacao();
            total += curriculo.getPontuacao();
        }
        if(total ==0)
        return;

        mediaPontuacao = total / vaga.getCurriculos().size();
        verificaTresMaioresPontuacoes(vaga);
    }

    public double getMaiorPontuacao(){
        return maiorPontuacao;
    }
    public double getMenorPontuacao(){
        return menorPontuacao;
    }
    public double getMediaPontuacao(){
        return mediaPontuacao;
    }

    public void verificaTresMaioresPontuacoes(Vaga vaga){
        maioresPontuacoes = new ArrayList<Curriculo>(vaga.getCurriculos());

        maioresPontuacoes.sort(new Comparator<Curriculo>(){
            public int compare(Curriculo c1, Curriculo c2){
                if(c1.getPontuacao() < c2.getPontuacao())
                return 1;
            if(c1.getPontuacao() > c2.getPontuacao())
                return -1;
            return 0;
            }
        });
        /*O método subList retorna um intervalo de elementos da lista com base em uma posição 
        inicial (1º argumento) e uma posição final (2º argumento). Obs.: O elemento presente 
        na posição final não é incluído no intervalo. Operador ternário (sintaxe): 
        condição ? se verdadeiro : se falso Aqui, se o tamanho da lista é maior que 3, 
        a posição final é 3. Senão (:), a posição final é o tamanho da lista */
        maioresPontuacoes =  maioresPontuacoes.subList(0,
        maioresPontuacoes.size() > 3 ? 3 : maioresPontuacoes.size());


    }

}

