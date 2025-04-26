package br.com.joaocarloslima;

public abstract class Asset {
    private int x;
    private int y;
    private Imagem imagemView;
    private int velocidade;
    private Direcao direcao;

  
       
    public Asset(int x, int y, Imagem imagemView, int velocidade, Direcao direcao) {
        this.x = 0;
        this.y = 640-50;
        this.imagemView = imagemView;
        this.velocidade = velocidade;
        this.direcao = direcao;
    }
    

    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }


    public void setY(int y) {
        this.y = y;
    }


    public Imagem getImagemView() {
        return imagemView;
    }


    public void setImagemView(Imagem imagemView) {
        this.imagemView = imagemView;
    }


    public int getVelocidade() {
        return velocidade;
    }


    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }


    public Direcao getDirecao() {
        return direcao;
    }


    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    public void mover (Direcao direcao){
        switch (direcao) {
            case CIMA:
                this.y -= this.velocidade;
                break;
            case BAIXO:
                this.y += this.velocidade;
                break;
            case ESQUERDA:
                this.x -= this.velocidade;
                break;
            case DIREITA:
                this.x += this.velocidade;
                break;
        }
        /* public boolean colidiuCom(Asset asset) {
            return this.x < asset.getX() + asset.getImagemView() &&
                   this.x + this.imagemView. > asset.getX() &&
                   this.y < asset.getY() + asset.getImagemView().getAltura() &&
                   this.y + this.imagemView.getAltura() > asset.getY();
        } */
    }
}