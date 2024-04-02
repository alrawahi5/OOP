package PlantsShop;

import java.util.Objects;

public class Flowers {

    Integer id;
    String rose;
    String dahlia;
    String daisy;
    String coneflower;
    String phlox;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRose() {
        return rose;
    }

    public void setRose(String rose) {
        this.rose = rose;
    }

    public String getDahlia() {
        return dahlia;
    }

    public void setDahlia(String dahlia) {
        this.dahlia = dahlia;
    }

    public String getDaisy() {
        return daisy;
    }

    public void setDaisy(String daisy) {
        this.daisy = daisy;
    }

    public String getConeflower() {
        return coneflower;
    }

    public void setConeflower(String coneflower) {
        this.coneflower = coneflower;
    }

    public String getPhlox() {
        return phlox;
    }

    public void setPhlox(String phlox) {
        this.phlox = phlox;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flowers flowers = (Flowers) o;
        return Objects.equals(rose, flowers.rose) && Objects.equals(dahlia, flowers.dahlia) && Objects.equals(daisy, flowers.daisy) && Objects.equals(coneflower, flowers.coneflower) && Objects.equals(phlox, flowers.phlox);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rose, dahlia, daisy, coneflower, phlox);
    }

    @Override
    public String toString() {
        return "Flowers{" +
                "rose='" + rose + '\'' +
                ", dahlia='" + dahlia + '\'' +
                ", daisy='" + daisy + '\'' +
                ", coneflower='" + coneflower + '\'' +
                ", phlox='" + phlox + '\'' +
                '}';
    }
}
