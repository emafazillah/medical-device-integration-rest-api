/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author emafazillah
 */
@Entity
@Table(name = "tbldevice")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbldevice.findAll", query = "SELECT t FROM Tbldevice t")
    , @NamedQuery(name = "Tbldevice.findById", query = "SELECT t FROM Tbldevice t WHERE t.id = :id")
    , @NamedQuery(name = "Tbldevice.findByDeviceid", query = "SELECT t FROM Tbldevice t WHERE t.deviceid = :deviceid")
    , @NamedQuery(name = "Tbldevice.findByDate", query = "SELECT t FROM Tbldevice t WHERE t.date = :date")
    , @NamedQuery(name = "Tbldevice.findByFirmware", query = "SELECT t FROM Tbldevice t WHERE t.firmware = :firmware")
    , @NamedQuery(name = "Tbldevice.findByHeightdisplayunit", query = "SELECT t FROM Tbldevice t WHERE t.heightdisplayunit = :heightdisplayunit")
    , @NamedQuery(name = "Tbldevice.findByLocation", query = "SELECT t FROM Tbldevice t WHERE t.location = :location")
    , @NamedQuery(name = "Tbldevice.findByModelname", query = "SELECT t FROM Tbldevice t WHERE t.modelname = :modelname")
    , @NamedQuery(name = "Tbldevice.findByModelnumber", query = "SELECT t FROM Tbldevice t WHERE t.modelnumber = :modelnumber")
    , @NamedQuery(name = "Tbldevice.findByNibpdisplayunit", query = "SELECT t FROM Tbldevice t WHERE t.nibpdisplayunit = :nibpdisplayunit")
    , @NamedQuery(name = "Tbldevice.findBySerialnumber", query = "SELECT t FROM Tbldevice t WHERE t.serialnumber = :serialnumber")
    , @NamedQuery(name = "Tbldevice.findByTempdisplayunit", query = "SELECT t FROM Tbldevice t WHERE t.tempdisplayunit = :tempdisplayunit")
    , @NamedQuery(name = "Tbldevice.findByWeightdisplayunit", query = "SELECT t FROM Tbldevice t WHERE t.weightdisplayunit = :weightdisplayunit")})
public class Tbldevice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 20)
    @Column(name = "deviceid")
    private String deviceid;
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Size(max = 20)
    @Column(name = "firmware")
    private String firmware;
    @Size(max = 20)
    @Column(name = "heightdisplayunit")
    private String heightdisplayunit;
    @Size(max = 100)
    @Column(name = "location")
    private String location;
    @Size(max = 100)
    @Column(name = "modelname")
    private String modelname;
    @Size(max = 20)
    @Column(name = "modelnumber")
    private String modelnumber;
    @Size(max = 20)
    @Column(name = "nibpdisplayunit")
    private String nibpdisplayunit;
    @Size(max = 20)
    @Column(name = "serialnumber")
    private String serialnumber;
    @Size(max = 20)
    @Column(name = "tempdisplayunit")
    private String tempdisplayunit;
    @Size(max = 20)
    @Column(name = "weightdisplayunit")
    private String weightdisplayunit;

    public Tbldevice() {
    }

    public Tbldevice(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }

    public String getHeightdisplayunit() {
        return heightdisplayunit;
    }

    public void setHeightdisplayunit(String heightdisplayunit) {
        this.heightdisplayunit = heightdisplayunit;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getModelnumber() {
        return modelnumber;
    }

    public void setModelnumber(String modelnumber) {
        this.modelnumber = modelnumber;
    }

    public String getNibpdisplayunit() {
        return nibpdisplayunit;
    }

    public void setNibpdisplayunit(String nibpdisplayunit) {
        this.nibpdisplayunit = nibpdisplayunit;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getTempdisplayunit() {
        return tempdisplayunit;
    }

    public void setTempdisplayunit(String tempdisplayunit) {
        this.tempdisplayunit = tempdisplayunit;
    }

    public String getWeightdisplayunit() {
        return weightdisplayunit;
    }

    public void setWeightdisplayunit(String weightdisplayunit) {
        this.weightdisplayunit = weightdisplayunit;
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
        if (!(object instanceof Tbldevice)) {
            return false;
        }
        Tbldevice other = (Tbldevice) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tbldevice[ id=" + id + " ]";
    }
    
}
