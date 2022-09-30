import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, ArrayList<String>> tabela =
                new Hashtable<String, ArrayList<String>>();

        ArrayList<String> vizinhosVoce
                = new ArrayList<String>();
        vizinhosVoce.add("Bob");
        vizinhosVoce.add("Claire");
        vizinhosVoce.add("Alice");

        ArrayList<String> vizinhosBob
                = new ArrayList<String>();
        vizinhosBob.add("Peggy");
        vizinhosBob.add("Anuj");

        ArrayList<String> vizinhosClaire
                = new ArrayList<String>();

        vizinhosClaire.add("Jonny");
        vizinhosClaire.add("Thom");

        ArrayList<String> vizinhosAlice
                = new ArrayList<String>();

        vizinhosAlice.add("Peggy");

        tabela.put("Você", vizinhosVoce);
        tabela.put("Bob", vizinhosBob);
        tabela.put("Claire", vizinhosClaire);
        tabela.put("Alice", vizinhosAlice);

        for (Map.Entry<String, ArrayList<String>> entry : tabela.entrySet()){
            String chave = entry.getKey();
            ArrayList<String> dados = entry.getValue();

            System.out.println("Vizinho:" + chave + " Amigos:" + dados);
        }
    }
}