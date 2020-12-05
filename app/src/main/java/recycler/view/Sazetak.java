/*
Adapter --> dio koji uzima listu ili kolekciju objekata i ostvaruje da oni
            budu vidljivi u RecyclerView-u
        --> adapter prvo stvara ViewHolder

ViewHolder --> adapter prvo stvara ViewHolder,zadatak ViewHoldera je da uzme pojedine
               objekte iz liste ili kolekcije i prikaze ih u RecyclerView layout-u

Zamislimo da izvucemo jedan redak iz RecyclerView-a, adapter ce potom razgovarati sa listom
ili kolekcijom koja sadrzi objekte,zgrabit ce objekt u određenoj poziciji, poslati ga do
ViewHolder-a.ViewHolder potom vadi vrijednosti iz određenog objekta te te izvađene
vrijednosti postavlja u pojedinacni redak u RecycleView-u.

RecyclerView --> kontejner za UI
Layout --> naš custom layout koji se ponavlja svaki redak
ViewHolder --> uzima jedan po jedan objekt iz neke kolekcije i popunjava
               komponente u individualnom layoutu koji je
               predstavljen kao redak sa vrijednostima koje je izvukao
               iz objekta
           -->adapter ima pristup svim objektima u kolekciji odjednom, ali
              ViewHolder ima pristup samo jednom objektu u trenutku,radi zadatke
              na jednom objektu i jednom redku u određenom trenutku
Adapter --> on zna za sve objekte koji se nalaze u nekoj listi ili kolekciji
            koje zelimo prikazati, prepozna koji je redak trenutno na screen-u
            i posalje taj objekt ViewHolder-u i on izvuce podateke iz tog objekta
            koji mu je adapter dao i prikaze ih kao pojedine elemente jednog redka
        --> posto adapter ima pristup svim objektima u nekoj kolekciji on ce nam
            moci osigurati broj objekata


------------------
MainActivity Klasa
------------------


----------------
ModelClass Klasa
----------------



-------------------------
RecyclerViewAdapter Klasa
-------------------------
 */
