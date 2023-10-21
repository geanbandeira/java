import org.junit.Asset.assertEquals;
import java.util.List;
import org.junit.test;

public class RecrutadorTest {
    @Test
    public void deveAvaliarPontuacoesEmOrdemCrescente(){
        Candidato lyncon = new Candidato("Lyncon");
        Candidato maria = new Candidato("Maria");
        Candidato gerson = new Candidato("Gerson");

        Vaga vaga = new Vaga("Trader");
        vaga.recebe(new Curriculo(maria,6));
        vaga.recebe(new Curriculo(gerson,5));
        vaga.recebe(new Curriculo(lyncon, 7));

        Recrutador recrutador = new Recrutador();
        recrutador.avaliaCurriculos(vaga);

        assertEquals(6, recrutador.getMaiorPontuacao(), 0.001);
        assertEquals(7, recrutador.getMenorPontuacao(), 0.001);
            
        

    }
}
