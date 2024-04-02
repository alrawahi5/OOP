package PlantsShop;

import java.util.Objects;

public class Grass {

    Integer id;
    String rubygrass;
    String feathergrass;
    String pampasgrass;
    String pennisetum;
    String hairgrass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRubygrass() {
        return rubygrass;
    }

    public void setRubygrass(String rubygrass) {
        this.rubygrass = rubygrass;
    }

    public String getFeathergrass() {
        return feathergrass;
    }

    public void setFeathergrass(String feathergrass) {
        this.feathergrass = feathergrass;
    }

    public String getPampasgrass() {
        return pampasgrass;
    }

    public void setPampasgrass(String pampasgrass) {
        this.pampasgrass = pampasgrass;
    }

    public String getPennisetum() {
        return pennisetum;
    }

    public void setPennisetum(String pennisetum) {
        this.pennisetum = pennisetum;
    }

    public String getHairgrass() {
        return hairgrass;
    }

    public void setHairgrass(String hairgrass) {
        this.hairgrass = hairgrass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grass grass = (Grass) o;
        return Objects.equals(rubygrass, grass.rubygrass) && Objects.equals(feathergrass, grass.feathergrass) && Objects.equals(pampasgrass, grass.pampasgrass) && Objects.equals(pennisetum, grass.pennisetum) && Objects.equals(hairgrass, grass.hairgrass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rubygrass, feathergrass, pampasgrass, pennisetum, hairgrass);
    }

    @Override
    public String toString() {
        return "Grass{" +
                "rubygrass='" + rubygrass + '\'' +
                ", feathergrass='" + feathergrass + '\'' +
                ", pampasgrass='" + pampasgrass + '\'' +
                ", pennisetum='" + pennisetum + '\'' +
                ", hairgrass='" + hairgrass + '\'' +
                '}';
    }
}
