package adsuscs02poo;

public class testaEletrodomestico {
    public static void main(String[] args) {
        Eletro E1 = new Eletro("E1","Branco", "110V", "Philips", 5.5);

        E1.caracteristicas();
        E1.ligar();
        E1.funcionando(20);
        E1.desligar();
    }
}
