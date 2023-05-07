package projetoedd;
import java.util.ArrayList;

/**
 *
 * @author victo
 */
public class Atleta extends Pessoa{
    String pais;
    double altura;
    
    Atleta(String nome, String pais, Double altura){
        this.nome = nome;
        this.pais = pais;
        this.altura = altura;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + ", Sexo: " + sexo + ", Altura: " + altura + ", País: " + pais;
    }
}
