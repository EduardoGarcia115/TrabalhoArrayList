//IMPORTAÇÕES
package Interfaces;

import JavaBeans.Aluno;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class PainelPesquisa extends JPanel implements ActionListener{
    
    //ATRIBUTOS
    JLabel searchAluno,matricula,nome,cpf,rg,endereco,sexo,cidade,estado,curso;
    JTextField caixaMatricula,caixaNome,caixaCpf,caixaRg,caixaEndereco,caixaSexo,caixaCidade,caixaEstado;
    JButton buscar,limpar,editar,excluir,sair,salvar;
    JCheckBox checkTi,checkTe,checkTr;
    MaskFormatter formatacaoCpf,formatacaoRg,formatacaoMatricula; //FORMATAÇÃO DE TEXTFIELDS
    ArrayList dados;
   
    //CONSTRUTOR QUE RECEBE POR PARÂMETRO O MESMO ARRAYLIST DO FRAME
    public PainelPesquisa(ArrayList dados){ 
        this.dados = dados;
        
       
        //CRIANDO OS OBJETOS DAS FORMATAÇÕES DE TEXTFIELDS
        try{
            formatacaoCpf = new MaskFormatter("###.###.###.##");
            formatacaoRg = new MaskFormatter("####.####.##");
            formatacaoMatricula = new MaskFormatter("###-##");
        }
        catch(ParseException excp){}
        
        //CRIAÇÃO DOS OBJETOS
        searchAluno = new JLabel("Pesquisar aluno");
        matricula = new JLabel("Matrícula:");
        nome = new JLabel("Nome:");
        cpf = new JLabel("CPF:");
        rg = new JLabel("RG:");
        endereco = new JLabel("Endereço:");
        sexo = new JLabel("Sexo:");
        cidade = new JLabel("Cidade:");
        estado = new JLabel("Estado:");
        curso = new JLabel("Curso:");
        caixaMatricula = new JFormattedTextField(formatacaoMatricula);
        caixaNome = new JTextField();
        caixaCpf = new JFormattedTextField(formatacaoCpf);
        caixaRg = new JFormattedTextField(formatacaoRg);
        caixaEndereco = new JTextField();
        caixaSexo = new JTextField();
        caixaCidade = new JTextField();
        caixaEstado = new JTextField();
        buscar = new JButton("BUSCAR");
        limpar = new JButton("LIMPAR");
        editar = new JButton("EDITAR");
        excluir = new JButton("EXCLUIR");
        sair = new JButton("X");
        salvar = new JButton("SALVAR");
        checkTi = new JCheckBox("Técnico em Informática");
        checkTe = new JCheckBox("Técnico em Eletroeletronica");
        checkTr = new JCheckBox("Técnico em Redes de Computadores");
       
        
        //BOUNDS DOS LABELS
        searchAluno.setBounds(20, 10, 300, 20);
        matricula.setBounds(20, 50, 110, 20);
        nome.setBounds(20, 100, 110, 20);
        cpf.setBounds(20, 150, 100, 20);
        rg.setBounds(500, 150, 100, 20);
        endereco.setBounds(20, 200, 120, 20);
        cidade.setBounds(20, 300, 100, 20);
        estado.setBounds(500, 250, 120, 20);
        sexo.setBounds(20, 250, 120, 20);   
        curso.setBounds(20, 350, 700, 30);
        
        //BOUNDS DOS TEXTFIELDS
        caixaMatricula.setBounds(130, 50, 300, 25);  
        caixaNome.setBounds(130, 100, 720, 25);
        caixaCpf.setBounds(130, 150, 300, 25);
        caixaRg.setBounds(580, 150, 270, 25);
        caixaEndereco.setBounds(130, 200, 720, 25); 
        caixaCidade.setBounds(130, 300, 300, 25);
        caixaEstado.setBounds(580, 250, 270, 25);
        caixaSexo.setBounds(130, 250, 300, 25);
        
        //BOUNDS DOS BOTÕES
        buscar.setBounds(580, 40, 150, 40);
        limpar.setBounds(80, 540, 180, 40);
        editar.setBounds(300, 540, 180, 40);
        excluir.setBounds(520, 540, 180, 40);
        salvar.setBounds(740, 540, 180, 40);
        sair.setBounds(950, 0, 50, 50);
        
        //BOUNDS DAS CHECKBOXES
        checkTi.setBounds(130, 400, 280, 20);
        checkTe.setBounds(130, 440, 500, 20);
        checkTr.setBounds(130, 480, 500, 20);
        
        checkTi.setBackground(Color.white);
        checkTe.setBackground(Color.white);
        checkTr.setBackground(Color.white);
        
        //FORMATAÇÃO DOS LABELS
        searchAluno.setFont(new Font("Verdana",Font.PLAIN,20));
        matricula.setFont(new Font("Verdana",Font.PLAIN,20));
        nome.setFont(new Font("Verdana",Font.PLAIN,20));
        cpf.setFont(new Font("Verdana",Font.PLAIN,20));
        rg.setFont(new Font("Verdana",Font.PLAIN,20));
        endereco.setFont(new Font("Verdana",Font.PLAIN,20));
        cidade.setFont(new Font("Verdana",Font.PLAIN,20));
        estado.setFont(new Font("Verdana",Font.PLAIN,20));
        sexo.setFont(new Font("Verdana",Font.PLAIN,20));
        curso.setFont(new Font("Verdana",Font.PLAIN,20));
        
        //FORMATAÇÃO DO TEXTO DAS TEXTFIELDS
        caixaMatricula.setFont(new Font("Verdana",Font.PLAIN,20));
        caixaNome.setFont(new Font("Verdana",Font.PLAIN,20));
        caixaCpf.setFont(new Font("Verdana",Font.PLAIN,20));
        caixaRg.setFont(new Font("Verdana",Font.PLAIN,20));
        caixaEndereco.setFont(new Font("Verdana",Font.PLAIN,20));
        caixaCidade.setFont(new Font("Verdana",Font.PLAIN,20));
        caixaEstado.setFont(new Font("Verdana",Font.PLAIN,20));
        caixaSexo.setFont(new Font("Verdana",Font.PLAIN,20));
        
        checkTi.setFont(new Font("Verdana",Font.PLAIN,20));
        checkTe.setFont(new Font("Verdana",Font.PLAIN,20));
        checkTr.setFont(new Font("Verdana",Font.PLAIN,20));
        
        
        //TIRANDO BORDINHA CHATA DOS BOTÕES
        sair.setFocusPainted(false);
        buscar.setFocusPainted(false);
        limpar.setFocusPainted(false);
        editar.setFocusPainted(false);
        excluir.setFocusPainted(false);
        salvar.setFocusPainted(false);
        checkTi.setFocusPainted(false);
        checkTe.setFocusPainted(false);
        checkTr.setFocusPainted(false);
        
        //SET DA COR DO TEXTO DOS BOTÕES
        buscar.setForeground(Color.white);
        limpar.setForeground(Color.white);
        editar.setForeground(Color.white);
        excluir.setForeground(Color.white);
        sair.setForeground(Color.white);
        salvar.setForeground(Color.white);
        
        //SET DA COR DOS BOTÕES
        buscar.setBackground(Color.blue);
        limpar.setBackground(Color.blue);
        editar.setBackground(Color.blue);
        excluir.setBackground(Color.blue);
        sair.setBackground(Color.blue);
        salvar.setBackground(Color.blue);
        
        //SET DA BORDA DOS BOTÕES
        buscar.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        limpar.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        editar.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        excluir.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        sair.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        salvar.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        
        //DESATIVANDO OS TEXTFIELDS PARA EVITAR ALTERAÇÃO Ñ PERMITIDA
        caixaNome.setEditable(false);
        caixaCpf.setEditable(false);
        caixaRg.setEditable(false);
        caixaEndereco.setEditable(false);
        caixaCidade.setEditable(false);
        caixaEstado.setEditable(false);
        caixaSexo.setEditable(false);
        checkTi.setEnabled(false);
        checkTe.setEnabled(false);
        checkTr.setEnabled(false);
        
        //ADICIONANDO OS OBJETOS NO PAINEL
        this.add(searchAluno);
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
        this.add(caixaSexo);
        this.add(curso);
        this.add(buscar);
        this.add(limpar);
        this.add(editar);
        this.add(excluir);
        this.add(sair);
        this.add(checkTi);
        this.add(checkTe);
        this.add(checkTr);
        this.add(salvar);
        
        //CARACTERÍSTICAS DO PAINEL
        this.setLayout(null);
        this.setVisible(false);
        this.setBackground(Color.white);
        this.setBounds(340, 30, 1000, 650);
        this.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        
        //ADICIONANDO AS AÇÕES AOS BOTÕES
        buscar.addActionListener(this);
        limpar.addActionListener(this);
        editar.addActionListener(this);
        excluir.addActionListener(this);
        sair.addActionListener(this);
        salvar.addActionListener(this);
    }    

    //MÉTODO ACTIONPERFORMED SOBREESCRITO 
    @Override
    public void actionPerformed(ActionEvent e) {
        boolean achou = false; //VARIÁVEL LOCAL PARA VERIFICAR SE O OBJETO FOI ACHADO 
       
        //CRIAÇÃO DO ITERATOR
        Iterator iterator = dados.iterator();
        
        //AÇÃO DO BOTÃO BUSCAR
        if(e.getSource().equals(buscar)){
            
            //LOOP PARA PROCURAR O OBJETO CORRESPONDENTE AO TEXTFIELD MATRICULA
            while(iterator.hasNext()){
                Aluno temp = (Aluno) iterator.next();
                //SE O OBJETO FOR ACHADO, MOSTRAR SEUS TRIBUTOS NOS TEXTFIELDS
                  if(temp.getMatricula().equals(caixaMatricula.getText())){
                       achou = true;
                       caixaNome.setText(temp.getNome());
                       caixaCpf.setText(temp.getCpf());
                       caixaRg.setText(temp.getRg());
                       caixaEndereco.setText(temp.getEndereco());
                       caixaCidade.setText(temp.getCidade());
                       caixaEstado.setText(temp.getEstado());
                       caixaSexo.setText(temp.getSexo()); 
                       if(temp.getCurso().equals("Técnico em Informática")){
                           checkTi.setSelected(true);
                       }
                       else
                           if(temp.getCurso().equals("Técnico em Eletroeletronica")){
                               checkTe.setSelected(true);
                           }
                       else
                            if(temp.getCurso().equals("Técnico em Redes de Computadores")){
                                checkTr.setSelected(true);
                            }
                               
                    } 
            } 
            //MENSAGEM DE AVISO CASO O OBJETO NÃO SEJA ENCONTRADO
            if(!achou)
            JOptionPane.showMessageDialog(null,"Não há alunos cadastrados com essa matrícula");
        }
        //AÇÃO DO BOTÃO LIMPAR
        else
            if(e.getSource().equals(limpar)){
                //HABILITAR O TEXTFIELD MATRICULA E DESABILITAR E LIMPAR TODO O RESTO
                caixaMatricula.setEditable(true);
                caixaNome.setEditable(false);
                caixaCpf.setEditable(false);
                caixaRg.setEditable(false);
                caixaEndereco.setEditable(false);
                caixaCidade.setEditable(false);
                caixaEstado.setEditable(false);
                caixaSexo.setEditable(false);
                checkTi.setEnabled(false);
                checkTe.setEnabled(false);
                checkTr.setEnabled(false);
                caixaMatricula.setText(null);
                caixaNome.setText(null);
                caixaCpf.setText(null);
                caixaRg.setText(null);
                caixaEndereco.setText(null);
                caixaCidade.setText(null);
                caixaEstado.setText(null);
                caixaSexo.setText(null);
                checkTi.setSelected(false);
                checkTe.setSelected(false);
                checkTr.setSelected(false);
            }
            //AÇÃO DO BOTÃO EDITAR
        else
            if(e.getSource().equals(editar)){
                
                //HABILIDANDO OS TEXTFIELDS E CHECKBOXES
                caixaMatricula.setEditable(false);
                caixaNome.setEditable(true);
                caixaCpf.setEditable(true);
                caixaRg.setEditable(true);
                caixaEndereco.setEditable(true);
                caixaCidade.setEditable(true);
                caixaEstado.setEditable(true);
                caixaSexo.setEditable(true);
                checkTi.setEnabled(true);
                checkTe.setEnabled(true);
                checkTr.setEnabled(true);
                
            }
            //AÇÃO DO BOTÃO EXCLUIR
        else
            if(e.getSource().equals(excluir)){
                
                //LOOP PARA ENCONTRAR O OBJETO
                while(iterator.hasNext()){
                    Aluno temp = (Aluno) iterator.next();
                    if(caixaMatricula.getText().equals(temp.getMatricula())){
                        //REMOVENDO DO ARRAYLIST E LIMPANDO OS CAMPOS
                        dados.remove(temp);
                        JOptionPane.showMessageDialog(null,"Você excluiu os dados dessa matrícula");
                        caixaMatricula.setText(null);
                        caixaNome.setText(null);
                        caixaCpf.setText(null);
                        caixaRg.setText(null);
                        caixaEndereco.setText(null);
                        caixaCidade.setText(null);
                        caixaEstado.setText(null);
                        caixaSexo.setText(null);
                        checkTi.setSelected(false);
                        checkTe.setSelected(false);
                        checkTr.setSelected(false);
                    }
                }       
            }
            //AÇÃO DO BOTÃO SAIR
        else
                if(e.getSource().equals(sair)){
                    this.setVisible(false);
             
                } 
                
                // AÇÃO DO BOTÃO SALVAR
        else
                if(e.getSource().equals(salvar)){
                    
                    //MESMO ESQUEMA DO CADASTRO PRATICAMENTE
                    String rCurso = null;
                    while(iterator.hasNext()){
                    Aluno temp = (Aluno) iterator.next();
                    if(caixaMatricula.getText().equals(temp.getMatricula())){
                        temp.setNome(caixaNome.getText());
                        temp.setCpf(caixaCpf.getText());
                        temp.setRg(caixaRg.getText());
                        temp.setEndereco(caixaEndereco.getText());
                        temp.setCidade(caixaCidade.getText());
                        temp.setEstado(caixaEstado.getText());
                        temp.setSexo(caixaSexo.getText()); 
                        if(checkTi.isSelected())
                            rCurso = "Técnico em Informática";
                        else
                            if(checkTe.isSelected())
                                rCurso = "Técnico em Eletroeletronica";
                        else
                             if(checkTr.isSelected())
                                 rCurso = "Técnico em Redes de Computadores";
                        temp.setCurso(rCurso);
                        JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!!");
                        
                    }    
                }
                        
                }
    }
}