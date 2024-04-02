package PlantsShop;

import java.util.Objects;

public class Compost {

    Integer id;
    String Biochar;
    String mushroom;
    String wood;
    String ericaceous;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBiochar() {
        return Biochar;
    }

    public void setBiochar(String biochar) {
        Biochar = biochar;
    }

    public String getMushroom() {
        return mushroom;
    }

    public void setMushroom(String mushroom) {
        this.mushroom = mushroom;
    }

    public String getWood() {
        return wood;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public String getEricaceous() {
        return ericaceous;
    }

    public void setEricaceous(String ericaceous) {
        this.ericaceous = ericaceous;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compost compost = (Compost) o;
        return Objects.equals(Biochar, compost.Biochar) && Objects.equals(mushroom, compost.mushroom) && Objects.equals(wood, compost.wood) && Objects.equals(ericaceous, compost.ericaceous);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Biochar, mushroom, wood, ericaceous);
    }

    @Override
    public String toString() {
        return "Compost{" +
                "Biochar='" + Biochar + '\'' +
                ", mushroom='" + mushroom + '\'' +
                ", wood='" + wood + '\'' +
                ", ericaceous='" + ericaceous + '\'' +
                '}';
    }
}
