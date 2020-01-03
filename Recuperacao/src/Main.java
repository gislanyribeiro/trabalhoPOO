import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Aluno>  lista = new ArrayList<>();
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Professor p1 = new Professor();
        Professor p2 = new Professor();
       int op = 10;
        while(op != 0) {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 - Cadastro 2 - Mostrar"));

                if (op == 1) {
                    a1.setNome(JOptionPane.showInputDialog("digite seu nome"));
                    lista.add(a1);
                }





            if (op == 2) {
                for (Aluno aluno : lista) {
                    System.out.println("Nome: " + aluno.getNome() + "Idade" + aluno.idade);
                }
            }

        }





    }
}
