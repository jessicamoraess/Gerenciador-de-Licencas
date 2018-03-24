/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadordelicencas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author Jéssica Moraes
 */
@Entity
@Table(name = "licen\u00e7as", catalog = "bd", schema = "")
@NamedQueries({
    @NamedQuery(name = "Licen\u00e7as_1.findAll", query = "SELECT l FROM Licen\u00e7as_1 l"),
    @NamedQuery(name = "Licen\u00e7as_1.findById", query = "SELECT l FROM Licen\u00e7as_1 l WHERE l.id = :id"),
    @NamedQuery(name = "Licen\u00e7as_1.findByContrato", query = "SELECT l FROM Licen\u00e7as_1 l WHERE l.contrato = :contrato"),
    @NamedQuery(name = "Licen\u00e7as_1.findByFornecedor", query = "SELECT l FROM Licen\u00e7as_1 l WHERE l.fornecedor = :fornecedor"),
    @NamedQuery(name = "Licen\u00e7as_1.findByProduto", query = "SELECT l FROM Licen\u00e7as_1 l WHERE l.produto = :produto"),
    @NamedQuery(name = "Licen\u00e7as_1.findBySistema", query = "SELECT l FROM Licen\u00e7as_1 l WHERE l.sistema = :sistema"),
    @NamedQuery(name = "Licen\u00e7as_1.findByLinguagem", query = "SELECT l FROM Licen\u00e7as_1 l WHERE l.linguagem = :linguagem"),
    @NamedQuery(name = "Licen\u00e7as_1.findByAquisi\u00e7\u00e3o", query = "SELECT l FROM Licen\u00e7as_1 l WHERE l.aquisi\u00e7\u00e3o = :aquisi\u00e7\u00e3o"),
    @NamedQuery(name = "Licen\u00e7as_1.findByVencimento", query = "SELECT l FROM Licen\u00e7as_1 l WHERE l.vencimento = :vencimento"),
    @NamedQuery(name = "Licen\u00e7as_1.findByChave", query = "SELECT l FROM Licen\u00e7as_1 l WHERE l.chave = :chave"),
    @NamedQuery(name = "Licen\u00e7as_1.findByContratado", query = "SELECT l FROM Licen\u00e7as_1 l WHERE l.contratado = :contratado"),
    @NamedQuery(name = "Licen\u00e7as_1.findByUtilizando", query = "SELECT l FROM Licen\u00e7as_1 l WHERE l.utilizando = :utilizando"),
    @NamedQuery(name = "Licen\u00e7as_1.findByDisponivel", query = "SELECT l FROM Licen\u00e7as_1 l WHERE l.disponivel = :disponivel")})
public class Licenças_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Contrato")
    private String contrato;
    @Column(name = "Fornecedor")
    private String fornecedor;
    @Column(name = "Produto")
    private String produto;
    @Column(name = "Sistema")
    private String sistema;
    @Column(name = "Linguagem")
    private String linguagem;
    @Column(name = "Aquisi\u00e7\u00e3o")
    private String aquisição;
    @Column(name = "Vencimento")
    private String vencimento;
    @Column(name = "Chave")
    private String chave;
    @Column(name = "Contratado")
    private Integer contratado;
    @Column(name = "Utilizando")
    private Integer utilizando;
    @Column(name = "Disponivel")
    private Integer disponivel;

    public Licenças_1() {
    }

    public Licenças_1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        String oldContrato = this.contrato;
        this.contrato = contrato;
        changeSupport.firePropertyChange("contrato", oldContrato, contrato);
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        String oldFornecedor = this.fornecedor;
        this.fornecedor = fornecedor;
        changeSupport.firePropertyChange("fornecedor", oldFornecedor, fornecedor);
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        String oldProduto = this.produto;
        this.produto = produto;
        changeSupport.firePropertyChange("produto", oldProduto, produto);
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        String oldSistema = this.sistema;
        this.sistema = sistema;
        changeSupport.firePropertyChange("sistema", oldSistema, sistema);
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        String oldLinguagem = this.linguagem;
        this.linguagem = linguagem;
        changeSupport.firePropertyChange("linguagem", oldLinguagem, linguagem);
    }

    public String getAquisição() {
        return aquisição;
    }

    public void setAquisição(String aquisição) {
        String oldAquisição = this.aquisição;
        this.aquisição = aquisição;
        changeSupport.firePropertyChange("aquisi\u00e7\u00e3o", oldAquisição, aquisição);
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        String oldVencimento = this.vencimento;
        this.vencimento = vencimento;
        changeSupport.firePropertyChange("vencimento", oldVencimento, vencimento);
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        String oldChave = this.chave;
        this.chave = chave;
        changeSupport.firePropertyChange("chave", oldChave, chave);
    }

    public Integer getContratado() {
        return contratado;
    }

    public void setContratado(Integer contratado) {
        Integer oldContratado = this.contratado;
        this.contratado = contratado;
        changeSupport.firePropertyChange("contratado", oldContratado, contratado);
    }

    public Integer getUtilizando() {
        return utilizando;
    }

    public void setUtilizando(Integer utilizando) {
        Integer oldUtilizando = this.utilizando;
        this.utilizando = utilizando;
        changeSupport.firePropertyChange("utilizando", oldUtilizando, utilizando);
    }

    public Integer getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Integer disponivel) {
        Integer oldDisponivel = this.disponivel;
        this.disponivel = disponivel;
        changeSupport.firePropertyChange("disponivel", oldDisponivel, disponivel);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Licenças_1)) {
            return false;
        }
        Licenças_1 other = (Licenças_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "teste.Licen\u00e7as_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
