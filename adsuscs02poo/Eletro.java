package adsuscs02poo;

public class Eletro {
    String modelo;
    String cor;
    String voltagem;
    String marca;
    double peso;

public Eletro(String modelo, String cor, String voltagem, String marca, double peso) {
    this.modelo = modelo;
    this.cor = cor;
    this.voltagem = voltagem;
    this.marca = marca;
    this.peso = peso;

}
    public void ligar() {
        System.out.println("Ligado");
    }

    public void desligar() { // Corrigido o nome do método
        System.out.println("Desligado");
    }

    public void funcionando( double minutos) {
        System.out.println("Funcionando por " + minutos + " minutos");
    }

    public void caracteristicas() {
        System.out.println("Dados do modelo " + modelo + "\n" +
                "Cor: " + cor + "\n" +
                "Voltagem: " + voltagem + "\n" +
                "Marca: " + marca + "\n" +
                "Peso: " + peso + "\n"
        );

    }
}
