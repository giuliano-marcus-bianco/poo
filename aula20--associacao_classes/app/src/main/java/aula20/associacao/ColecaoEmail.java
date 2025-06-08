package aula20.associacao;

import java.util.HashMap;

public class ColecaoEmail {

    private HashMap<String, String> dados = new HashMap<>();

    public boolean add(String rotulo, String email) {
        String er = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if (email.matches(er)) {
            dados.put(rotulo, email);
            return true;
        }
        return false;
    }

    public boolean remove(String rotulo) {
        if (dados.get(rotulo) != null) {
            dados.remove(rotulo);
            return true;
        }
        return false;
    }

    public boolean update(String rotulo, String email) {
        if (dados.get(rotulo) != null) {
            return this.add(rotulo, email);
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        dados.forEach((rotulo, email) -> {
            sb.append(rotulo + ": " + email + "\n");
        });

        return sb.toString();
    }

}
