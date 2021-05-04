//IMPORTAÇÕES
package Interfaces;

import JavaBeans.Aluno;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class PainelCadastro extends JPanel implements ActionListener{
    
    //ATRIBUTOS
    JLabel matricula, nome,cpf,cidade,endereco,rg,estado,sexo,dadosDoAluno,curso;
    JTextField caixaMatricula,caixaNome,caixaCpf,caixaRg,caixaEndereco,caixaCidade,caixaEstado;
    JRadioButton rbtFeminino,rbtMasculino;
    JCheckBox checkTi,checkTe,checkTr;
    JButton salvar,limpar,sair;
    ArrayList dados;
    String rSexo,rCurso;  //STRINGS DE CONTROLE PARA SALVAR DADOS NO ARRAYLIST
    MaskFormatter formatacaoCpf,formatacaoRg,formatacaoMatricula; //FORMATAÇÃO DE TEXTFIELDS
    
    //CONSTRUTOR RECEBENDO O MESMO ARRAYLIST DO FRAME POR PARÂMETRO
    public PainelCadastro(ArrayList dados){
        this.dados = dados;
        
        //CRIANDO OS OBJETOS DAS FORMATAÇÕES DE TEXTFIELDS
        try{
            formatacaoCpf = new MaskFormatter("###.###.###.##");
            formatacaoRg = new MaskFormatter("####.####.##");
            formatacaoMatricula = new MaskFormatter("###-##");
        }
        catch(ParseException excp){}
        
        //CRIANDO OS OBJETOS
        dadosDoAluno = new JLabel("Dados do Aluno");
        matricula = new JLabel("Matrícula: ");
        nome = new JLabel("Nome: ");
        cpf = new JLabel("CPF: ");
        rg = new JLabel("RG: ");
        endereco = new JLabel("Endereco: ");
        cidade = new JLabel("Cidade: ");
        estado = new JLabel("Estado: ");
        sexo = new JLabel("Sexo: ");
        curso = new JLabel("Curso: (por favor marcar só uma opção)");
        caixaMatricula = new JFormattedTextField(formatacaoMatricula);
        caixaNome = new JTextField();
        caixaCpf = new JFormattedTextField(formatacaoCpf);
        caixaRg = new JFormattedTextField(formatacaoRg);
        caixaEndereco = new JTextField();
        caixaCidade = new JTextField();
        caixaEstado = new JTextField();
        rbtFeminino = new JRadioButton("Feminino");
        rbtMasculino = new JRadioButton("Masculino");
        checkTi = new JCheckBox("Técnico em Informática");
        checkTe = new JCheckBox("Técnico em Eletroeletronica");
        checkTr = new JCheckBox("Técnico em Redes de Computadores");
        limpar = new JButton("LIMPAR");
        salvar = new JButton("SALVAR");
        sair = new JButton("X");
        
        //CARACTERÍSTICAS DO FRAME  
        this.setLayout(null);
        this.setVisible(false);
        this.setBackground(Color.white);
        this.setBounds(340, 30, 1000, 650);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
       
        //BOUNDS DOS LABELS
        dadosDoAluno.setBounds(20, 10, 300, 20);
        matricula.setBounds(20, 50, 110, 20);
        nome.setBounds(20, 100, 110, 20);
        cpf.setBounds(20, 150, 100, 20);
        rg.setBounds(500, 150, 100, 20);
        endereco.setBounds(20, 200, 120, 20);
        cidade.setBounds(20, 250, 120, 20);
        estado.setBounds(500, 250, 120, 20);
        sexo.setBounds(200, 300, 100, 20);
        curso.setBounds(20, 350, 700, 30);  
        
        //BOUNDS DOS TEXTFIELDS
        caixaMatricula.setBounds(130, 50, 300, 25);  
        caixaNome.setBounds(130, 100, 720, 25);
        caixaCpf.setBounds(130, 150, 300, 25);
        caixaRg.setBounds(550, 150, 300, 25);
        caixaEndereco.setBounds(130, 200, 720, 25); 
        caixaCidade.setBounds(130, 250, 300, 25);
        caixaEstado.setBounds(580, 250, 270, 25);
        
        //BOUNDS DOS RADIOBUTTONS
        rbtFeminino.setBounds(320, 300, 180, 20);
        rbtMasculino.setBounds(500, 300, 180, 20);
        
        //BOUNDS DAS CHECKBOXES
        checkTi.setBounds(130, 400, 280, 20);
        checkTe.setBounds(130, 440, 500, 20);
        checkTr.setBounds(130, 480, 500, 20);
        
        //BOUNDS DOS BOTÕES
        limpar.setBounds(500, 530, 140, 40);
        salvar.setBounds(300, 530, 140, 40);
        sair.setBounds(950, 0, 50, 50);
        
        //SET DAS BORDAS DOS BOTÕES
        limpar.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        salvar.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        sair.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        
        //SET DOS TEXTOS DOS BOTÕES
        limpar.setForeground(Color.white);
        salvar.setForeground(Color.white);
        sair.setForeground(Color.white);
        
        //SET DA COR DOS BOTÕES
        limpar.setBackground(Color.blue);
        salvar.setBackground(Color.blue);
        sair.setBackground(Color.blue);
        
        //TIRANDO BORDAS CHATAS DOS ELEMENTOS(JBUTTONS,JRADIOBUTTONS,JCHECKBOX)
        limpar.setFocusPainted(false);
        salvar.setFocusPainted(false);
        sair.setFocusPainted(false);
        rbtFeminino.setFocusPainted(false);
        rbtMasculino.setFocusPainted(false);
        checkTi.setFocusPainted(false);
        checkTe.setFocusPainted(false);
        checkTr.setFocusPainted(false);
        
        //SET DA COR DE FUNDO DOS ELEMENTOS, PARA SE IGUALAR À COR DE FUNDO DO FRAME
        rbtFeminino.setBackground(Color.white);
        rbtMasculino.setBackground(Color.white);
        checkTi.setBackground(Color.white);
        checkTe.setBackground(Color.white);
        checkTr.setBackground(Color.white);
        
        //FORMATAÇÃO DOS ELEMENTOS(JLABELS,JRADIOBUTTONS E JCHECKBOX)
        dadosDoAluno.setFont(new Font("Verdana",Font.PLAIN,20));
        matricula.setFont(new Font("Verdana",Font.PLAIN,20));
        nome.setFont(new Font("Verdana",Font.PLAIN,20));
        cpf.setFont(new Font("Verdana",Font.PLAIN,20));
        rg.setFont(new Font("Verdana",Font.PLAIN,20));
        endereco.setFont(new Font("Verdana",Font.PLAIN,20));
        cidade.setFont(new Font("Verdana",Font.PLAIN,20));
        estado.setFont(new Font("Verdana",Font.PLAIN,20));
        sexo.setFont(new Font("Verdana",Font.PLAIN,20));
        rbtFeminino.setFont(new Font("Verdana",Font.PLAIN,20));
        rbtMasculino.setFont(new Font("Verdana",Font.PLAIN,20));
        curso.setFont(new Font("Verdana",Font.PLAIN,20));
        checkTi.setFont(new Font("Verdana",Font.PLAIN,20));
        checkTe.setFont(new Font("Verdana",Font.PLAIN,20));
        checkTr.setFont(new Font("Verdana",Font.PLAIN,20));
        
        //FORMATAÇÃO DOS TEXTFIELDS
        caixaMatricula.setFont(new Font("Verdana",Font.PLAIN,20));
        caixaNome.setFont(new Font("Verdana",Font.PLAIN,20));
        caixaCpf.setFont(new Font("Verdana",Font.PLAIN,20));
        caixaRg.setFont(new Font("Verdana",Font.PLAIN,20));
        caixaEndereco.setFont(new Font("Verdana",Font.PLAIN,20));
        caixaCidade.setFont(new Font("Verdana",Font.PLAIN,20));
        caixaEstado.setFont(new Font("Verdana",Font.PLAIN,20));
        
        //ADICIONANDO OS ELEMENTOS NO PAINEL
        this.add(dadosDoAluno);
        this.add(matricula);
        this.add(caixaMatricula);
        this.add(nome);
        this.add(caixaNome);
        this.add(cpf);
        this.add(caixaCpf);
        this.add(rg);
        this.add(caixaRg);
        this.add(endereco);
        this.add(caixaEndereco);
        this.add(cidade);
        this.add(caixaCidade);
        this.add(estado);
        this.add(caixaEstado);
        this.add(sexo);
        this.add(rbtFeminino);
        this.add(rbtMasculino);
        this.add(curso);
        this.add(checkTi);
        this.add(checkTe);
        this.add(checkTr);
        this.add(salvar);
        this.add(limpar);
        this.add(sair);
        
        //ADICIONANDO AS AÇÕES AOS BOTÕES
        limpar.addActionListener(this);
        salvar.addActionListener(this);
        sair.addActionListener(this);
    }
 
    //MÉTODO ACTIONPERFORMED SOBREESCRITO 
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //AÇÃO DO BOTÃO SALVAR
        if(e.getSource().equals(salvar)){ 
            //CRIAÇÃO DE UM OBJETO DO TIPO ALUNO
            Aluno aluno = new Aluno();
            
            //SETANDO OS ATRIBUTOS DO ALUNO COM OS TEXTOS DOS TEXTFIELDS
            aluno.setMatricula(caixaMatricula.getText());
            aluno.setNome(caixaNome.getText());
            aluno.setCpf(caixaCpf.getText());
            aluno.setRg(caixaRg.getText());
            aluno.setEndereco(caixaEndereco.getText());
            aluno.setCidade(caixaCidade.getText());
            aluno.setEstado(caixaEstado.getText());
            
            //ESQUEMA PARA SETAR O ATRIBUTO SEXO DO ALUNO COM A RESPOSTA DOS RABIO BUTTONS
            if(rbtFeminino.isSelected()){
                rSexo = "feminino";
            }   
            else
                rSexo = "masculino";
            
            //ESQUEMA PARA SETAR O ATRIBUTO CURSO DO ALUNO COM A RESPOSTA DAS CHECKBOXES
            if(checkTi.isSelected())
                rCurso = "Técnico em Informática";
            else
                if(checkTe.isSelected())
                    rCurso = "Técnico em Eletroeletronica";
            else
                    if(checkTr.isSelected())
                        rCurso = "Técnico em Redes de Computadores";
            
            aluno.setSexo(rSexo);
            aluno.setCurso(rCurso);
            
            //ADICIONANDO O OBJETO ALUNO COM ATRIBUTOS SALVOS NO ARRAYLIST DADOS
            dados.add(aluno);
            
            //MENSAGEM PARA CONFIRMAR O SAVE DO OBJETO
            JOptionPane.showMessageDialog(null, "Dados cadastrados "+dados.size());
        }
        //AÇÃO DO BOTÃO LIMPAR
        else
            if(e.getSource().equals(limpar)){
                //TIRANDO TODAS AS INFORMAÇÕES DOS ELEMENTOS
                caixaMatricula.setText(null);
                caixaNome.setText(null);
                caixaCpf.setText(null);
                caixaRg.setText(null);
                caixaEndereco.setText(null);
                caixaCidade.setText(null);
                caixaEstado.setText(null);
                rbtFeminino.setSelected(false);
                rbtMasculino.setSelected(false);
                checkTi.setSelected(false);
                checkTe.setSelected(false);
                checkTr.setSelected(false);
            }  
            //AÇÃO DO BOTÃO SAIR
        else
                if(e.getSource().equals(sair)){
                    //APAGANDO O FRAME
                    this.setVisible(false);
                }
    }
}
