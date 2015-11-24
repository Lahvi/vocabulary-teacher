/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.lahvi.dev.vocabulary.techare.data.entity;

/**
 *
 * @author phlavacek
 */
public enum PartOfSpeech {
    
    SUB("Podstatné jméno", "SUB"),
    ADJ("Přídavné jméno", "ADJ"),
    PRON("Zájmeno", "PRON"),
    NUM("Číslovky", "NUM"),
    VERB("Sloveso", "VERB"),
    ADV("Příslovce", "ADV"),
    PREP("Předložka", "PREP"),
    CON("Spojka", "CON"),
    PART("Částice", "PART"),
    INT("Citoslovce", "INT");
    
    
    private String name;
    private String code;

    private PartOfSpeech(String name, String code){
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
