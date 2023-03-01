package one.digitalinnovation.labdesignpattern.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;


@Data
public class Beer {
    @Id
    private Long id;
    private String name;
    private String description;
    private Long abv;
    private Long ibu;

    public Beer(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAbv() {
        return abv;
    }

    public void setAbv(Long abv) {
        this.abv = abv;
    }

    public Long getIbu() {
        return ibu;
    }

    public void setIbu(Long ibu) {
        this.ibu = ibu;
    }
}
