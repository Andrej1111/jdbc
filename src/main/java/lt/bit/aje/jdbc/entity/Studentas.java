package lt.bit.aje.jdbc.entity;

public class Studentas {
    private Integer id;

    private String vardas;

    private String pavarde;

    private String el_pastas;

    public Studentas (Integer id, String vardas, String pavarde, String el_pastas) {
        this.id = id;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.el_pastas = el_pastas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getEl_pastas() {
        return el_pastas;
    }

    public void setEl_pastas(String el_pastas) {
        this.el_pastas = el_pastas;
    }

    @Override
    public String toString() {
        return "Pazymiai{" +
                "id=" + id +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", el_pastas='" + el_pastas + '\'' +
                '}';
    }
}
