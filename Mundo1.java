import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe para criar o mundo 1.
 * 
 * @author (Jhonatan Morais - jhonatanvinicius@gmail.com | jhonatan@dfjug.org) 
 * @version (1.0)
 */
public class Mundo1 extends World
{
    //Constantes da natureza do mundo
    public static final int LARGURA_CENARIO = 700; 
    public static final int ALTURA_CENARIO = 390; 

    private int quadroAtual = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Mundo1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(LARGURA_CENARIO, ALTURA_CENARIO, 1);
        GreenfootImage cenarioInicial = new GreenfootImage("mundo1.png");
        setBackground(cenarioInicial);

    }
    public void act(){
        GreenfootImage novaCena  =  new GreenfootImage(LARGURA_CENARIO,ALTURA_CENARIO);
        int posicaoDoQuadro = 0;
        int quadro = quadroAtual;
        while(posicaoDoQuadro < LARGURA_CENARIO ){
            GreenfootImage novoquadro = new GreenfootImage("cenarios/mundo1/m1f1_"+quadro+".png");
            novaCena.drawImage(novoquadro, posicaoDoQuadro, 0);
            quadro++;
            posicaoDoQuadro += 4;
            if(quadro > 350){
                quadro = 1;
            }

        }
        quadroAtual++;
        if(quadroAtual > 350){
            quadroAtual = 1;
        }

        setBackground(novaCena);
        
        
        
    }
}
