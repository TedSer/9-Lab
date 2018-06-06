package ua.lviv.iot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Film {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "film_id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "company_name")
    private String сompanyName;

    public Film() {
    }

    public Film(String name, String сompanyName) {
        this.name = name;
        this.сompanyName = сompanyName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getСompanyName() {
        return сompanyName;
    }

    public void setСompanyName(String сompanyName) {
        this.сompanyName = сompanyName;
    }
}
