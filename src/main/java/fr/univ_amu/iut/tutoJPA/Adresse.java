package fr.univ_amu.iut.tutoJPA;
import javax.persistence.*;

@Embeddable
public class Adresse {
    private int numero;
    private String rue;
    private String codePostal;
    private String ville;
        
    public Adresse() {}
    public Adresse(int numero, String rue, String codePostal, String ville) {
        this.numero = numero;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
    public int getNumero() { return numero; }
    public String getRue() { return rue; }
    public String getCodePostal() { return codePostal; }
    public String getVille() { return ville; }
}