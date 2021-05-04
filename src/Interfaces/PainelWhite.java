//IMPORTAÇÕES
package Interfaces;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

//PAINEL DE FUNDO PARA MUDAR COR PARA BRANCO
class PainelWhite extends JPanel {
    
    public PainelWhite(){
        
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(Color.WHITE);
        this.setBounds(305, 0, 1200, 750);
        this.setBorder(BorderFactory.createLineBorder(Color.black, 5)); //CRIAR BORDA
    } 
}
