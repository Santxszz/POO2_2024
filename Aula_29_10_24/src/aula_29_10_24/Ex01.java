package aula_29_10_24;
import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Davi");
        listaNomes.add("Daniel");
        
        for(String nome : listaNomes) {
            System.out.println("Nome: "+nome);
        }
    }
}
