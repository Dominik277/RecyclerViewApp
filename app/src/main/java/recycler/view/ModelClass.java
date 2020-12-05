package recycler.view;

import java.util.ArrayList;

public class ModelClass {

    //instance varijabla tipa String naziva ime koja je atribut klase
    private String ime;
    //instance varijabla tipa String naziva kontinent koja je atribut klase
    private String kontinent;
    //instance varijabla tipa int naziva slika koja je atribut klase
    private int slika;


    //konstruktor ModelClass klase pomocu kojeg ce se instancirati objekt
    //koji se bude pravio od ove klase, kada budemo pravili objekt od ove klase
    //u parametre konstruktora cemo unijeti vrijednosti za atribude koje
    //zelimo da nas pojedini objekt sadrzava
    public ModelClass(String ime, String kontinent, int slika) {
        this.ime = ime;
        this.kontinent = kontinent;
        this.slika = slika;
    }

    //getter medota getIme nam sluzi kako bi je koristili na nekom objektu
    //te nam ona omogucava da dobijemo ime tog objekta zbog toga sto ova metoda
    //vraca ime,koristimo getter i setter metode jer su nam atributi private
    //zbog toga da im se ne bi moglo pristupiti izvan klase i neovlasteno ih promjeniti
    public String getIme() {
        return ime;
    }


    //setter metoda setIme nam sluzi ako zelimo promjeniti ime nekog objekta
    //npr ako neki objekt ima neko ime i mi ga zelimo promjeniti to koristimo
    //preko setIme metode tako sto kao paramtar navedemo novo ime koje zelimo
    public void setIme(String ime) {
        this.ime = ime;
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

    private static int lastContactId = 0;

    public static ArrayList<ModelClass> createModelList(int numberOfModels){
        ArrayList<ModelClass> modelClasses = new ArrayList<>();

        for (int i = 1; i<=numberOfModels; i++){
            modelClasses.add(new ModelClass("brazil","amerika",R.drawable.ic_launcher_background));
        }
        return modelClasses;
    }
}
