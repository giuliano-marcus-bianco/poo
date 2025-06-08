package aula20.associacao;

import java.util.ArrayList;
import java.util.Collections;

public class Agenda {

    ArrayList<Contato> contatos = new ArrayList<>();

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public boolean addContato(Contato c) {
        for (Contato contato : contatos) {
            if(
                contato.getNome().equals(c.getNome()) &&
                contato.getSobrenome().equals(c.getSobrenome()) &&
                contato.getDataNasc() == c.getDataNasc()
            ) {
                return false;
            }
        }

        boolean adicionado = contatos.add(c);

        Collections.sort(contatos, (o1, o2) -> {
            String nomeCompleto1 = o1.getNome() + o1.getSobrenome();
            String nomeCompleto2 = o2.getNome() + o2.getSobrenome();
            return nomeCompleto1.compareToIgnoreCase(nomeCompleto2);
        });

        return adicionado;
    }

    public ArrayList<Contato> findContatos(String nome, String sobrenome) {
        ArrayList<Contato> encontrados = new ArrayList<>();

        for (Contato contato : contatos) {
            if (
                contato.getNome().equals(nome) &&
                contato.getSobrenome().equals(sobrenome)
            ) {
                encontrados.add(contato);
            }            
        }

        return encontrados;
    }

    public boolean removeContato(int indice) {
        if (indice >= 0 && indice < contatos.size()) {
            
            contatos.remove(indice);
            Collections.sort(contatos, (o1, o2) -> {
                String nomeCompleto1 = o1.getNome() + o1.getSobrenome();
                String nomeCompleto2 = o2.getNome() + o2.getSobrenome();
                return nomeCompleto1.compareToIgnoreCase(nomeCompleto2);
            });
            return true;
        }
        return false;
    }

    public boolean addTelefone(String rotulo, String telefone, int indice) {
        return contatos.get(indice).addTelefone(rotulo, telefone);
    }

    public boolean addEmail(String rotulo, String email, int indice) {
        return contatos.get(indice).addEmail(rotulo, email);
    }

    public boolean updateTelefone(String rotulo, String telefone, int indice) {
        return contatos.get(indice).updateTelefone(rotulo, telefone);
    }

    public boolean updateEmail(String rotulo, String email, int indice) {
        return contatos.get(indice).updateEmail(rotulo, email);
    }

    public boolean removeTelefone(String rotulo, int indice) {
        return contatos.get(indice).removeTelefone(rotulo);
    }

    public boolean removeEmail(String rotulo, int indice) {
        return contatos.get(indice).removeEmail(rotulo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        

        for (int i = 0; i < contatos.size(); i++) {
            Contato contato = contatos.get(i);
            sb.append("--------------------------------------------------\n");
            sb.append("Índice: " + (i + 1) + "\n");
            sb.append("\n");
            sb.append(contato.toString() + "\n");
            sb.append("--------------------------------------------------\n");
        }

        return sb.toString();
    }

}
