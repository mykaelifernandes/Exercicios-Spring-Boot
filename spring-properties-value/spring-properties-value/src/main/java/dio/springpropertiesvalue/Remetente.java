package dio.springpropertiesvalue;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class Remetente {
    public List<Long> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Long> telefones) {
        this.telefones = telefones;
    }

    @Value("${remetente.nome}")
    private String nome;]

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private List<Long> telefones;
}

