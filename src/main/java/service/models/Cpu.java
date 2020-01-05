package service.models;

import service.models.enums.Producator;
import service.models.enums.Soclu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cpu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String model;
    private Producator producator;
    private Soclu soclu;

    public Cpu(){
    }
    public Cpu(String model, Producator producator, Soclu soclu) {
        this.model = model;
        this.producator = producator;
        this.soclu = soclu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Producator getProducator() {
        return producator;
    }

    public void setProducator(Producator producator) {
        this.producator = producator;
    }

    public Soclu getSoclu() {
        return soclu;
    }

    public void setSoclu(Soclu soclu) {
        this.soclu = soclu;
    }
}
