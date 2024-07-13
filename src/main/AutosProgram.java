package main;

public class AutosProgram {

    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.megy();
        auto.setBeinditva(true);
        auto.megy();
        auto.megy();
        auto.tankol();
        auto.setBeinditva(false);
        auto.megy();
        auto.setBeinditva(true);
        auto.megy();
    }
    
}
