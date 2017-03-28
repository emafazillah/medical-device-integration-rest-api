/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "tblpatientvsm")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblpatientvsm.findAll", query = "SELECT t FROM Tblpatientvsm t")
    , @NamedQuery(name = "Tblpatientvsm.findById", query = "SELECT t FROM Tblpatientvsm t WHERE t.id = :id")
    , @NamedQuery(name = "Tblpatientvsm.findByReading", query = "SELECT t FROM Tblpatientvsm t WHERE t.reading = :reading")
    , @NamedQuery(name = "Tblpatientvsm.findByClinicianid", query = "SELECT t FROM Tblpatientvsm t WHERE t.clinicianid = :clinicianid")
    , @NamedQuery(name = "Tblpatientvsm.findByDate", query = "SELECT t FROM Tblpatientvsm t WHERE t.date = :date")
    , @NamedQuery(name = "Tblpatientvsm.findByDiastolic", query = "SELECT t FROM Tblpatientvsm t WHERE t.diastolic = :diastolic")
    , @NamedQuery(name = "Tblpatientvsm.findByHeight", query = "SELECT t FROM Tblpatientvsm t WHERE t.height = :height")
    , @NamedQuery(name = "Tblpatientvsm.findByHr", query = "SELECT t FROM Tblpatientvsm t WHERE t.hr = :hr")
    , @NamedQuery(name = "Tblpatientvsm.findByMap", query = "SELECT t FROM Tblpatientvsm t WHERE t.map = :map")
    , @NamedQuery(name = "Tblpatientvsm.findByO2sat", query = "SELECT t FROM Tblpatientvsm t WHERE t.o2sat = :o2sat")
    , @NamedQuery(name = "Tblpatientvsm.findByPain", query = "SELECT t FROM Tblpatientvsm t WHERE t.pain = :pain")
    , @NamedQuery(name = "Tblpatientvsm.findByPatientid", query = "SELECT t FROM Tblpatientvsm t WHERE t.patientid = :patientid")
    , @NamedQuery(name = "Tblpatientvsm.findByPulse", query = "SELECT t FROM Tblpatientvsm t WHERE t.pulse = :pulse")
    , @NamedQuery(name = "Tblpatientvsm.findByRespiration", query = "SELECT t FROM Tblpatientvsm t WHERE t.respiration = :respiration")
    , @NamedQuery(name = "Tblpatientvsm.findBySystolic", query = "SELECT t FROM Tblpatientvsm t WHERE t.systolic = :systolic")
    , @NamedQuery(name = "Tblpatientvsm.findByTemperature", query = "SELECT t FROM Tblpatientvsm t WHERE t.temperature = :temperature")
    , @NamedQuery(name = "Tblpatientvsm.findByWeight", query = "SELECT t FROM Tblpatientvsm t WHERE t.weight = :weight")})
public class Tblpatientvsm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "reading")
    private Integer reading;
    @Column(name = "clinicianid")
    private BigInteger clinicianid;
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Size(max = 15)
    @Column(name = "diastolic")
    private String diastolic;
    @Size(max = 15)
    @Column(name = "height")
    private String height;
    @Size(max = 15)
    @Column(name = "hr")
    private String hr;
    @Size(max = 15)
    @Column(name = "map")
    private String map;
    @Size(max = 15)
    @Column(name = "o2sat")
    private String o2sat;
    @Size(max = 15)
    @Column(name = "pain")
    private String pain;
    @Column(name = "patientid")
    private BigInteger patientid;
    @Size(max = 15)
    @Column(name = "pulse")
    private String pulse;
    @Size(max = 15)
    @Column(name = "respiration")
    private String respiration;
    @Size(max = 15)
    @Column(name = "systolic")
    private String systolic;
    @Size(max = 15)
    @Column(name = "temperature")
    private String temperature;
    @Size(max = 15)
    @Column(name = "weight")
    private String weight;

    public Tblpatientvsm() {
    }

    public Tblpatientvsm(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getReading() {
        return reading;
    }

    public void setReading(Integer reading) {
        this.reading = reading;
    }

    public BigInteger getClinicianid() {
        return clinicianid;
    }

    public void setClinicianid(BigInteger clinicianid) {
        this.clinicianid = clinicianid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(String diastolic) {
        this.diastolic = diastolic;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getO2sat() {
        return o2sat;
    }

    public void setO2sat(String o2sat) {
        this.o2sat = o2sat;
    }

    public String getPain() {
        return pain;
    }

    public void setPain(String pain) {
        this.pain = pain;
    }

    public BigInteger getPatientid() {
        return patientid;
    }

    public void setPatientid(BigInteger patientid) {
        this.patientid = patientid;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getRespiration() {
        return respiration;
    }

    public void setRespiration(String respiration) {
        this.respiration = respiration;
    }

    public String getSystolic() {
        return systolic;
    }

    public void setSystolic(String systolic) {
        this.systolic = systolic;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
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
        if (!(object instanceof Tblpatientvsm)) {
            return false;
        }
        Tblpatientvsm other = (Tblpatientvsm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tblpatientvsm[ id=" + id + " ]";
    }
    
}
