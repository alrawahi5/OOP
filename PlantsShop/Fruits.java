package PlantsShop;

import java.util.Objects;

public class Fruits {

    Integer id;

    String orange;
    String durian;
    String mangosteen;
    String honeydew;
    String dates;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrange() {
        return orange;
    }

    public void setOrange(String orange) {
        this.orange = orange;
    }

    public String getDurian() {
        return durian;
    }

    public void setDurian(String durian) {
        this.durian = durian;
    }

    public String getMangosteen() {
        return mangosteen;
    }

    public void setMangosteen(String mangosteen) {
        this.mangosteen = mangosteen;
    }

    public String getHoneydew() {
        return honeydew;
    }

    public void setHoneydew(String honeydew) {
        this.honeydew = honeydew;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruits fruits = (Fruits) o;
        return Objects.equals(orange, fruits.orange) && Objects.equals(durian, fruits.durian) && Objects.equals(mangosteen, fruits.mangosteen) && Objects.equals(honeydew, fruits.honeydew) && Objects.equals(dates, fruits.dates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orange, durian, mangosteen, honeydew, dates);
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "orange='" + orange + '\'' +
                ", durian='" + durian + '\'' +
                ", mangosteen='" + mangosteen + '\'' +
                ", honeydew='" + honeydew + '\'' +
                ", dates='" + dates + '\'' +
                '}';
    }
}
