/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Episodios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Lorran
 */
public class EpisodiosController implements ActionListener{
    
    public JTextField nameTextField;
    public JTextField yearTextField;
    public JTextField episodeTextField;
    public JComboBox seasonComboBox;
    public JCheckBox ruimCheckBox;
    public JCheckBox medianoCheckBox;
    public JCheckBox bomCheckBox;
    
    private Episodios episodios;

    @Override
    public void actionPerformed(ActionEvent event) { 
        
        switch(event.getActionCommand()){
            case "Cadastrar": this.cadastrarEpisodios();
            break;
            case "Limpar": this.limparCadastro();
            break;
            case "Exibir": this.exibirEpisodios();
            break;
        }
        
    }

    private void cadastrarEpisodios(){
        System.out.println("Cadastrar");
        this.episodios = new Episodios(nameTextField.getText(), yearTextField.getText(), episodeTextField.getText(), (String) seasonComboBox.getSelectedItem(), ruimCheckBox.isSelected(), medianoCheckBox.isSelected(), bomCheckBox.isSelected());
     
    }
    
    private void limparCadastro(){
        System.out.println("Limpar");
        nameTextField.setText("");
        yearTextField.setText("");
        episodeTextField.setText("");
        seasonComboBox.setSelectedItem("1");
        ruimCheckBox.setSelected(false);
        medianoCheckBox.setSelected(false);
        bomCheckBox.setSelected(false);
    }
    
    private void exibirEpisodios(){
        System.out.println("Exibir");
        nameTextField.setText(this.episodios.getName());
        yearTextField.setText(this.episodios.getYear());
        episodeTextField.setText(this.episodios.getEpisode());
        seasonComboBox.setSelectedItem(this.episodios.getSeason());
      
        ruimCheckBox.setSelected(this.episodios.getCheckboxRuim());
        medianoCheckBox.setSelected(this.episodios.getCheckboxMediano());
        bomCheckBox.setSelected(this.episodios.getCheckboxBom());
        
    }
    
}
