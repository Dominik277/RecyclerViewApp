package recycler.view;

public class MyListData {

    private String drzava;
    private int slika;
    private String kontinent;

    public MyListData(String drzava, int slika, String kontinent) {
        this.drzava = drzava;
        this.slika = slika;
        this.kontinent = kontinent;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getKontinent() {
        return kontinent;
    }

    public void setKontinent(String kontinent) {
        this.kontinent = kontinent;
    }

    public int getSlika() {
        return slika;
    }

    public void setSlika(int slika) {
        this.slika = slika;
    }
}
