/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author micha
 */
@Entity
@Table(name = "questions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Questions.findAll", query = "SELECT q FROM Questions q")
    , @NamedQuery(name = "Questions.findByIdquestions", query = "SELECT q FROM Questions q WHERE q.idquestions = :idquestions")
    , @NamedQuery(name = "Questions.findByName", query = "SELECT q FROM Questions q WHERE q.name = :name")
    , @NamedQuery(name = "Questions.findByLastname", query = "SELECT q FROM Questions q WHERE q.lastname = :lastname")
    , @NamedQuery(name = "Questions.findByNumber", query = "SELECT q FROM Questions q WHERE q.number = :number")
    , @NamedQuery(name = "Questions.findByEmail", query = "SELECT q FROM Questions q WHERE q.email = :email")
    , @NamedQuery(name = "Questions.findByWeb", query = "SELECT q FROM Questions q WHERE q.web = :web")
    , @NamedQuery(name = "Questions.findByText", query = "SELECT q FROM Questions q WHERE q.text = :text")
    , @NamedQuery(name = "Questions.findByContact", query = "SELECT q FROM Questions q WHERE q.contact = :contact")
    , @NamedQuery(name = "Questions.findByChoice", query = "SELECT q FROM Questions q WHERE q.choice = :choice")})
public class Questions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idquestions")
    private Integer idquestions;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "lastname")
    private String lastname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "number")
    private String number;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "web")
    private String web;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "text")
    private String text;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "contact")
    private String contact;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "choice")
    private String choice;

    public Questions() {
    }

    public Questions(Integer idquestions) {
        this.idquestions = idquestions;
    }

    public Questions(Integer idquestions, String name, String lastname, String number, String email, String web, String text, String contact, String choice) {
        this.idquestions = idquestions;
        this.name = name;
        this.lastname = lastname;
        this.number = number;
        this.email = email;
        this.web = web;
        this.text = text;
        this.contact = contact;
        this.choice = choice;
    }
    
    public Questions(String name, String lastname, String number, String email, String web, String text, String contact, String choice) {
        this.name = name;
        this.lastname = lastname;
        this.number = number;
        this.email = email;
        this.web = web;
        this.text = text;
        this.contact = contact;
        this.choice = choice;
    }

    public Integer getIdquestions() {
        return idquestions;
    }

    public void setIdquestions(Integer idquestions) {
        this.idquestions = idquestions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idquestions != null ? idquestions.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Questions)) {
            return false;
        }
        Questions other = (Questions) object;
        if ((this.idquestions == null && other.idquestions != null) || (this.idquestions != null && !this.idquestions.equals(other.idquestions))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Questions[ idquestions=" + idquestions + " ]";
    }
    
}
