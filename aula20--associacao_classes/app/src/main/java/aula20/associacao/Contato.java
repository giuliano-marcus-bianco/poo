package aula20.associacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contato {

    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ColecaoTelefone telefones;
    private ColecaoEmail emails;
    
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Contato(String nome, String sobrenome, String dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = LocalDate.parse(dataNasc, formato);
        this.telefones = new ColecaoTelefone();
        this.emails = new ColecaoEmail();
    }

    public boolean addTelefone(String rotulo, String telefone) {
        return telefones.add(rotulo, telefone);
    }

    public boolean addEmail(String rotulo, String email) {
        return emails.add(rotulo, email);
    }

    public boolean removeTelefone(String rotulo) {
        return telefones.remove(rotulo);
    }

    public boolean removeEmail(String rotulo) {
        return emails.remove(rotulo);
    }

    public boolean updateTelefone(String rotulo, String telefone) {
        return telefones.update(rotulo, telefone);
    }

    public boolean updateEmail(String rotulo, String email) {
        return emails.update(rotulo, email);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb = sb.append("Nome completo: " + this.nome + " " + this.sobrenome + "\n");
        sb = sb.append("Data de Nascimento: " + dataNasc.format(formato) + "\n");
        
        sb = sb.append("Telefones:" + "\n");
        sb = sb.append(telefones.toString());
        
        sb = sb.append("Emails:" + "\n");
        sb = sb.append(emails.toString());

        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

}
