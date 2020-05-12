/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Lorran
 */
public class Episodios {
    private String name;
    private String year;
    private String episode;
    private String season;
    private Boolean badCheckBox;
    private Boolean mediumCheckBox;
    private Boolean goodCheckBox;
    
    public Episodios(String nome, String ano, String episodio, String temporada, Boolean ruimCheckBox, Boolean medianoCheckBox, Boolean bomCheckBox){
        this.name = nome;
        this.year = ano;
        this.episode = episodio;
        this.season = temporada;
        this.badCheckBox = ruimCheckBox;
        this.mediumCheckBox = medianoCheckBox;
        this.goodCheckBox = bomCheckBox;
    }

    public Episodios(String text, String text0, String text1, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getName(){
        return this.name;
    }
  
    public String getYear(){
        return this.year;
    }
    
    public String getEpisode(){
        return this.episode;
    }
    
    public String getSeason() {
        return this.season;
    }
    
    public Boolean getCheckboxRuim(){
        return this.badCheckBox;
    }
    
    public Boolean getCheckboxMediano(){
        return this.mediumCheckBox;
    }
    
    public Boolean getCheckboxBom(){
        return this.goodCheckBox;
    }
}
