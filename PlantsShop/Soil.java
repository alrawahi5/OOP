package PlantsShop;

import java.util.Objects;

public class Soil {

    Integer id;

    String clay;
    String sandy;
    String slit;
    String loam;
    String peat;
    String limeRich;

    public String getClay() {
        return clay;
    }

    public void setClay(String clay) {
        this.clay = clay;
    }

    public String getSandy() {
        return sandy;
    }

    public void setSandy(String sandy) {
        this.sandy = sandy;
    }

    public String getSlit() {
        return slit;
    }

    public void setSlit(String slit) {
        this.slit = slit;
    }

    public String getLoam() {
        return loam;
    }

    public void setLoam(String loam) {
        this.loam = loam;
    }

    public String getPeat() {
        return peat;
    }

    public void setPeat(String peat) {
        this.peat = peat;
    }

    public String getLimeRich() {
        return limeRich;
    }

    public void setLimeRich(String limeRich) {
        this.limeRich = limeRich;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soil soil = (Soil) o;
        return Objects.equals(clay, soil.clay) && Objects.equals(sandy, soil.sandy) && Objects.equals(slit, soil.slit) && Objects.equals(loam, soil.loam) && Objects.equals(peat, soil.peat) && Objects.equals(limeRich, soil.limeRich);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clay, sandy, slit, loam, peat, limeRich);
    }

    @Override
    public String toString() {
        return "Soil{" +
                "clay='" + clay + '\'' +
                ", sandy='" + sandy + '\'' +
                ", slit='" + slit + '\'' +
                ", loam='" + loam + '\'' +
                ", peat='" + peat + '\'' +
                ", limeRich='" + limeRich + '\'' +
                '}';
    }
}
