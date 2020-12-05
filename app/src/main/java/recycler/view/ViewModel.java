package recycler.view;


//ovo je klasa iz koje cemo napraviti objekt koji ce
//sadrzavati osnovne podatke koji su nam bitni za aplikaciju
//objekt ove klase ce sadrzavati ime drzave,ime kontinenta i sliku
public class ViewModel {


    //ovo su privatne varijable koje opisuju sta ce sve nas objekt sadrzavati
    private String drzava;
    private String kontinent;
    private int slika;


    //ovo je konstruktor pomocu kojeg inicijaliziramo nas objekt
    //kada budemo pravili objekt od ove klase morat cemo navesti
    //ovaj konstruktor,a ovaj konstruktor je metoda koja inicijalizira objekt
    //nazivi uz kljucnu rijec this su oni koji atributi klase
    //a nazivi s desne strane su parametri konstruktora
    public ViewModel(String drzava, String kontinent, int slika) {
        this.drzava = drzava;
        this.kontinent = kontinent;
        this.slika = slika;
    }

    //getter metode nam sluze kako bi izvukli neku vrijednost iz objekta
    //npr u nasem slucaju, kada napravimo objekt klase ViewModel i zelimo
    //zelimo izvuci iz tog objekta npr ime drzave, onda napisemo
    //ovakav kod imeObjekta.getDrzava i mozemo npr tu vrijednost spremiti
    //u neku varijablu
    public String getDrzava() {
        return drzava;
    }


    //setter metode nam sluze kada smo vec u nasem slucaju inicijalizirali
    //ime drzave naseg objekta te se predomislimo i zelimo promjeniti to ime
    //onda navedemo imeObjekta.setDrzava(),a kao argument u zagradi navodimo novo
    //ime neke drzave
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
