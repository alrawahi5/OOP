package PlantsShop;

import java.util.Objects;

public class vegetables {
    Integer id;
    String pepper;
    String eggplant;
    String jicama;
    String fiddleheads;
    String chayote;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPepper() {
        return pepper;
    }

    public void setPepper(String pepper) {
        this.pepper = pepper;
    }

    public String getEggplant() {
        return eggplant;
    }

    public void setEggplant(String eggplant) {
        this.eggplant = eggplant;
    }

    public String getJicama() {
        return jicama;
    }

    public void setJicama(String jicama) {
        this.jicama = jicama;
    }

    public String getFiddleheads() {
        return fiddleheads;
    }

    public void setFiddleheads(String fiddleheads) {
        this.fiddleheads = fiddleheads;
    }

    public String getChayote() {
        return chayote;
    }

    public void setChayote(String chayote) {
        this.chayote = chayote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        vegetables that = (vegetables) o;
        return Objects.equals(pepper, that.pepper) && Objects.equals(eggplant, that.eggplant) && Objects.equals(jicama, that.jicama) && Objects.equals(fiddleheads, that.fiddleheads) && Objects.equals(chayote, that.chayote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pepper, eggplant, jicama, fiddleheads, chayote);
    }

    @Override
    public String toString() {
        return "vegetables{" +
                "pepper='" + pepper + '\'' +
                ", eggplant='" + eggplant + '\'' +
                ", jicama='" + jicama + '\'' +
                ", fiddleheads='" + fiddleheads + '\'' +
                ", chayote='" + chayote + '\'' +
                '}';
    }
}

