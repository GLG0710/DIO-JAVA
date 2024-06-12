public class SmartTv {
    boolean ligada=false;
    int volume=50;
    int canal=1;

    public void ligar() {
        ligada=true;
    }
    public void desligar() {
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        if (canal == 1) {
            canal = 1;    
        }
        else canal--;
    }
}
