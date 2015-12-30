/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.lahvi.dev.vocabulary.techare.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author phlavacek
 */
@Entity
public class Language {

    @Id
    @Column(name = "LANG_ID", nullable = false)
    private Long id;
    @Column(name = "LANG_NAME", nullable = false)
    private String name;
    @Column(name = "LANG_SHORTCUT", nullable = false)
    private String code;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
