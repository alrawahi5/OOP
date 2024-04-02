package PlantsShop;

import java.util.Objects;

public class Irrigation {

    Integer id;
    String drip;
    String sprinkler;
    String centerPivot;
    String Terraced;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDrip() {
        return drip;
    }

    public void setDrip(String drip) {
        this.drip = drip;
    }

    public String getSprinkler() {
        return sprinkler;
    }

    public void setSprinkler(String sprinkler) {
        this.sprinkler = sprinkler;
    }

    public String getCenterPivot() {
        return centerPivot;
    }

    public void setCenterPivot(String centerPivot) {
        this.centerPivot = centerPivot;
    }

    public String getTerraced() {
        return Terraced;
    }

    public void setTerraced(String terraced) {
        Terraced = terraced;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Irrigation that = (Irrigation) o;
        return Objects.equals(drip, that.drip) && Objects.equals(sprinkler, that.sprinkler) && Objects.equals(centerPivot, that.centerPivot) && Objects.equals(Terraced, that.Terraced);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drip, sprinkler, centerPivot, Terraced);
    }

    @Override
    public String toString() {
        return "Irrigation{" +
                "drip='" + drip + '\'' +
                ", sprinkler='" + sprinkler + '\'' +
                ", centerPivot='" + centerPivot + '\'' +
                ", Terraced='" + Terraced + '\'' +
                '}';
    }
}
