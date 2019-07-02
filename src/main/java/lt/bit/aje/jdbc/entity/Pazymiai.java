package lt.bit.aje.jdbc.entity;

import java.time.LocalDate;

public class Pazymiai {

    private Integer id;

    private String studentas_id;

    private LocalDate data;

    private Integer pazymis;

    public Pazymiai(Integer id, String studentas_id, LocalDate data, Integer pazymis) {
        this.id = id;
        this.studentas_id = studentas_id;
        this.data = data;
        this.pazymis = pazymis;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentas_id() {
        return studentas_id;
    }

    public void setStudentas_id(String studentas_id) {
        this.studentas_id = studentas_id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Integer getPazymis() {
        return pazymis;
    }

    public void setPazymis(Integer pazymis) {
        this.pazymis = pazymis;
    }

    @Override
    public String toString() {
        return "Pazymiai{" +
                "id=" + id +
                ", studentas_id='" + studentas_id + '\'' +
                ", data=" + data +
                ", pazymis=" + pazymis +
                '}';
    }
}
