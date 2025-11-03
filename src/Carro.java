public class Carro {
    // atributos
    private String modelo;
    private String cor;
    private boolean isLigado;
    private int velocidade = 0;
    private int marcha = 0;

    // construtor
    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        setLigado(false);
        setMarcha(0);
        setVelocidade(0);
    }

    // getters and setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    // métodos para marcha

    public int velocidadeMinPorMarcha(int m) {
        switch (m) {
            case 0:
                return 0; // ponto morto
            case 1:
                return 0;
            case 2:
                return 21;
            case 3:
                return 41;
            case 4:
                return 61;
            case 5:
                return 81;
            case 6:
                return 101;
            default:
                return 0;
        }
    }

    public int velocidadeMaxPorMarcha(int m) {
        switch (m) {
            case 0:
                return 0; // ponto morto
            case 1:
                return 20;
            case 2:
                return 40;
            case 3:
                return 60;
            case 4:
                return 80;
            case 5:
                return 100;
            case 6:
                return 120;
            default:
                return 0;
        }
    }

    // métodos
    public void ligarCarro() {
        if (isLigado) {
            System.out.println("O carro já está ligado.");
            return;
        }
        setLigado(true);
        System.out.println("Carro ligado.");
    }

    public void desligarCarro() {
        if (!isLigado) {
            System.out.println("Carro já esta desligado.");
            return;
        }
        if (marcha != 0 && velocidade != 0) {
            System.out.println("Não é possível desligar o carro, ele não está em ponto morto ou sua velocidade " +
                    "não está em zero.");
            return;
        }
        setLigado(false);
        System.out.println("Carro desligado.");
    }

    public void acelerar() {
        if (!isLigado) {
            System.out.println("Não é possível acelerar. O carro está desligado.");
            return;
        }
        if (marcha == 0) {
            System.out.println("Não é possível acelerar. O carro está em ponto morto (marcha 0).");
            return;
        }

        int maxVel = velocidadeMaxPorMarcha(marcha);
        if (velocidade >= maxVel) {
            System.out.println("Não é possível acelerar mais, a velocidade máxima para a marcha " + this.getMarcha() +
                    " foi atingida (" + maxVel + "km/h).");
            return;
        }
        velocidade += 1;
        System.out.println("Acelerando.. Velocidade atual: " + this.getVelocidade() + "km/h.");
    }

    public void frear() {
        if (!isLigado) {
            System.out.println("Não é possível frear, o carro está desligado.");
            return;
        }
        if (velocidade <= 0) {
            System.out.println("O carro já está em " + this.getVelocidade() + "km/h. Não é possível diminuir " +
                    "mais a velocidade");
            return;
        }
        velocidade -= 5;
        System.out.println("Freiando... Velocidade atual: " + this.getVelocidade() + "km/h.");
    }

    public void verificarVelocidade() {
        if (!isLigado) {
            System.out.println("O carro está desligado, ligue-o para verificar.");
            return;
        }
        System.out.println("Velocidade atual: " + this.getVelocidade() + "km/h.");
    }

    public void virarCarro(String direcao) {
        if (!isLigado) {
            System.out.println("Não é possível virar o carro, ele está desligado.");
            return;
        }
        if (velocidade < 1 || velocidade > 40) {
            System.out.println("Não foi possível virar o carro, velocidade deve estar entre 1 e 40 km/h.\n");
            System.out.println("Atual: " + this.getVelocidade() + "km/h.");
            return;
        }
        System.out.println("Virando para " + direcao + ".");
    }

    public void trocarMarcha(int maisOuMenos) { // +1 pra subir e -1 para descer
        if (!isLigado) {
            System.out.println("Não é possível trocar marcha, carro está desligado.");
            return;
        }
        int novaMarcha = marcha + maisOuMenos;
        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida. O carro " + this.getModelo() + " usa marchas entre 0 e 6.");
            return;
        }
        // verificar se a velocidade atual está compativel com marcha atual
        int maxVel = velocidadeMaxPorMarcha(novaMarcha);
        int minVel = velocidadeMinPorMarcha(novaMarcha);
        if (velocidade < minVel || velocidade > maxVel) {
            System.out.println("Não é possível trocar para a marcha " + novaMarcha + " velocidade atual (" + this.getVelocidade() +
                    "km/h).\n");
            System.out.println("Velocidade incompatível, padrão: " + minVel + "-" + maxVel + "km/h.");
            return;
        }
        marcha = novaMarcha;
        System.out.println("Trocando marcha... Marcha trocada para " + this.getMarcha() + ".");
    }
}
