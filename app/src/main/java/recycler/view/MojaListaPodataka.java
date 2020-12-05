package recycler.view;

class MojaListaPodataka {


    //ovo su atributi klase koji ce opisivati nas objekt kada ga instaciramo od MojaListaPodataka klase
    //atributi  bi uvijek trebali imati private acces specifier zbog toga da im se ne moze
    //pristupiti izvan klase u kojoj se nalaze i da im korisnik ne moze mjenjati vrijednosti
    //vrijednosti objekta se mogu dohvacati i mjenjati samo preko metoda i zbog toga koristimo
    //gettere i settere
    private String drzava;
    private int slika;
    private String kontinent;


    //ovo je nas custom konstruktor kojem smo naveli parametre koje zelimo da objekt ima kada
    //ga instanciramo,znaci kada pravimo novi objekt od ove klase one vrijednosti koje zelimo
    //da objekt sadrzava u sebi te vrijednosti upisujemo kao argumente unutar konstruktora
    public MojaListaPodataka(String drzava, int slika, String kontinent) {
        this.drzava = drzava;
        this.slika = slika;
        this.kontinent = kontinent;
    }

    //get metoda nam sluzi kako bi pristupili nekoj vrijednosti objekta posto mu ne mozemo
    //pristupiti pomocu atributa jer je on private
    //u nasem slucaju kada zelimo pristupiti atributu drzava izvan klase MojaListaPodataka
    //to mozemo jedino napraviti preko metode getDrzava koja u svom tijelu ima naredbu da
    //uzima tu vrijednost drzava i vraca u getDrzava metodu i to mozemo nakon toga zamisliti ovako
    //drzava = getDrzava
    public String getDrzava() {
        return drzava;
    }

    //set metoda nam sluzi ako smo dodali vrijednost nekom atributu objekta putem konstruktora
    //i predomislimo se i zelimo ju promjeniti,tu vrijednost atributa ne mozemo iz neke druge klase
    //promjeniti samo da navedemo ime atributa i novu vrijednost koju zelimo pohraniti u njega
    //zbog toga sto je atribut private,tu promjenu vrijednosti cemo napraviti tako da kao argument
    //u zagradu unesemo novu vrijednost koju zelimo da objekt pohranjuje i set metoda ce to obaviti
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
