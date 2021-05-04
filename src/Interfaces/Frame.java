//IMPORTAÇÕES
package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame implements ActionListener{
    
    //ATRIBUTOS
    JLabel titulo;
    JButton cadastrar,pesquisar;
    ArrayList dados;    //ARRAYLIST
    ImageIcon icone;   //ICONE DO FRAME
    ImageIcon imgCadastro,imgPesquisa; //IMAGENS DE BOTÕES
    PainelCadastro painelCadastro;    //PAINEL DO CADASTRO
    PainelPesquisa painelPesquisa;   //PAINEL DA PESQUISA
    PainelBlue painelBlue;          //FUNDO AZUL
    PainelWhite painelWhite;       //FUNDO BRANCO
    
    
    //CONSTRUTOR
    public Frame(){
        
        //CRIANDO OS OBJETOS
        titulo = new JLabel("MENU");
        icone = new ImageIcon("src/imagens/joinha.png");  //CRIANDO OS OBJETOS DAS IMAGENS
        imgCadastro = new ImageIcon("src/imagens/cadastrar.png");
        imgPesquisa = new ImageIcon("src/imagens/pesquisar.png");
        cadastrar = new JButton("CADASTRAR",imgCadastro);  //BOTÕES COM IMAGENS
        pesquisar = new JButton("PESQUISAR",imgPesquisa);
        dados = new ArrayList();
        painelCadastro = new PainelCadastro(dados); //CRIAÇÃO DOS PAINEIS COM ARRAYLIST POR PARÂMETRO 
        painelPesquisa = new PainelPesquisa(dados);
        painelBlue = new PainelBlue();
        painelWhite = new PainelWhite();
       
       
        titulo.setFont(new Font("Verdana",Font.BOLD,28));  //FORMATAÇÃO DO TÍTULO
        titulo.setForeground(Color.white);
        
        //BOUNDS
        titulo.setBounds(110, 10, 100, 80);
        cadastrar.setBounds(60, 100, 200, 110);
        pesquisar.setBounds(60, 300, 200, 110);
        
        //MODIFICAÇÃO DAS IMAGENS
        
        imgCadastro.setImage(imgCadastro.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH));              
        imgPesquisa.setImage(imgPesquisa.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)); 
        
        //SETSVISIBLES
        cadastrar.setVisible(true);
        pesquisar.setVisible(true);
        
        //FORMATAÇÃO DOS BOTÕES
        pesquisar.setBackground(Color.white); //COR DO BOTÃO
        cadastrar.setBackground(Color.white);
        cadastrar.setBorder(BorderFactory.createLineBorder(Color.BLACK,3)); //MARGEM
        pesquisar.setBorder(BorderFactory.createLineBorder(Color.BLACK,3)); 
        pesquisar.setFocusPainted(false); //TIRAR BORDINHA CHATA DO BOTÃO
        cadastrar.setFocusPainted(false);
      
        //ADICIONANDO OS OBJETOS NO FRAME
        this.add(titulo);
        this.add(cadastrar);
        this.add(pesquisar);
        this.add(painelCadastro);
        this.add(painelPesquisa);
        this.add(painelBlue);
        this.add(painelWhite);
        
        //ADICIONANDO AS AÇÕES AOS BOTÕES
        cadastrar.addActionListener(this);
        pesquisar.addActionListener(this);
        
        //CARACTERÍSTICAS DO FRAME PRINCIPAL
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLayout(null);
        this.setTitle("MENU DE CADASTRO");
        this.setVisible(true); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(icone.getImage());
    }   
    
    //MÉTODO ACTIONPERFORMED SOBREESCRITO 
    @Override
    public void actionPerformed(ActionEvent e) {
        //AÇÃO DO BOTÃO CADASTRAR
        if(e.getSource().equals(cadastrar)){
            painelCadastro.setVisible(true);
            painelPesquisa.setVisible(false);   
        }
        //AÇÃO DO BOTÃO PESQUISAR
        else 
            if(e.getSource().equals(pesquisar)){
                
                painelCadastro.setVisible(false);
                painelPesquisa.setVisible(true);
            }              
    }   
}
