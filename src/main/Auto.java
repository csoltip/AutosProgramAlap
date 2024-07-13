package main;

public class Auto {
    /* ADATTAGOK */

    /* objektum adattagokat a konstruktor inicializál: */
    private boolean uzemanyag; //példány v. másnéven az objektum adattagja
    private boolean beinditva; //példány v. másnéven az objektum adattagja

    /* TAGFÜGGVÉNYEK */
    
    /* kstr. feladat: minden adattagot inicializál */
    /* kstr hívási lánc: túlterhelt kstr hívja a másik kstr-t */
    public Auto(){
        /* semmi nem lehet a kstr. hívás előtt, mert nem fordul le! */
        //int i = 7;
        
        /* kstr csak kstr-ból hívunk, this kulcsszóval, nem a nevével
           a this. az adattagokat éri el
        */
        
        this.beinditva = false;
        this.uzemanyag = true;
    }
    
    public void setBeinditva(boolean beinditva){
        /* lehetne további ellenőrzés, pl.:
        csak akkor lehet beindítani, ha van üzemanyag
        */
        this.beinditva = beinditva;
    }
    
    //setUzemanyag(false)
    public void megy(){
        if (beinditva && uzemanyag) {
            this.uzemanyag = false;
        }
    }
    
    //setUzemanyag(true)
    public void tankol(){
        if (!beinditva) {
            this.uzemanyag = true;
        }
    }
    
}
