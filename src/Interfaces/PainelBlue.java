//IMPORTAÇÕES
package Interfaces;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

//PAINEL DE FUNDO PARA MUDAR COR PARA AZUL
class PainelBlue extends JPanel{
    
    //CONSTRUTOR
    public PainelBlue(){
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(Color.blue);
        this.setBounds(-10, 0, 320, 750);
        this.setBorder(BorderFactory.createLineBorder(Color.black, 5)); //CRIAR BORDA      
    }  
}
