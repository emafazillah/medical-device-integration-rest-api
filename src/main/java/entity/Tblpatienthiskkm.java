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
@Table(name = "tblpatienthiskkm")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblpatienthiskkm.findAll", query = "SELECT t FROM Tblpatienthiskkm t")
    , @NamedQuery(name = "Tblpatienthiskkm.findById", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.id = :id")
    , @NamedQuery(name = "Tblpatienthiskkm.findByReading", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.reading = :reading")
    , @NamedQuery(name = "Tblpatienthiskkm.findByClinicianid", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.clinicianid = :clinicianid")
    , @NamedQuery(name = "Tblpatienthiskkm.findByDate", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.date = :date")
    , @NamedQuery(name = "Tblpatienthiskkm.findByDiastolic", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.diastolic = :diastolic")
    , @NamedQuery(name = "Tblpatienthiskkm.findByHeight", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.height = :height")
    , @NamedQuery(name = "Tblpatienthiskkm.findByHr", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.hr = :hr")
    , @NamedQuery(name = "Tblpatienthiskkm.findByMap", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.map = :map")
    , @NamedQuery(name = "Tblpatienthiskkm.findByO2sat", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.o2sat = :o2sat")
    , @NamedQuery(name = "Tblpatienthiskkm.findByPain", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.pain = :pain")
    , @NamedQuery(name = "Tblpatienthiskkm.findByPatientid", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.patientid = :patientid")
    , @NamedQuery(name = "Tblpatienthiskkm.findByPulse", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.pulse = :pulse")
    , @NamedQuery(name = "Tblpatienthiskkm.findByRespiration", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.respiration = :respiration")
    , @NamedQuery(name = "Tblpatienthiskkm.findBySystolic", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.systolic = :systolic")
    , @NamedQuery(name = "Tblpatienthiskkm.findByTemperature", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.temperature = :temperature")
    , @NamedQuery(name = "Tblpatienthiskkm.findByWeight", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.weight = :weight")
    , @NamedQuery(name = "Tblpatienthiskkm.findByBmi", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.bmi = :bmi")
    , @NamedQuery(name = "Tblpatienthiskkm.findByEtco2", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.etco2 = :etco2")
    , @NamedQuery(name = "Tblpatienthiskkm.findByPulsevolume", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.pulsevolume = :pulsevolume")
    , @NamedQuery(name = "Tblpatienthiskkm.findByCrt", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.crt = :crt")
    , @NamedQuery(name = "Tblpatienthiskkm.findByShockindex", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.shockindex = :shockindex")
    , @NamedQuery(name = "Tblpatienthiskkm.findByGcse", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.gcse = :gcse")
    , @NamedQuery(name = "Tblpatienthiskkm.findByGcsv", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.gcsv = :gcsv")
    , @NamedQuery(name = "Tblpatienthiskkm.findByGcsm", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.gcsm = :gcsm")
    , @NamedQuery(name = "Tblpatienthiskkm.findByGcstotal", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.gcstotal = :gcstotal")
    , @NamedQuery(name = "Tblpatienthiskkm.findByBloodglucose", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.bloodglucose = :bloodglucose")
    , @NamedQuery(name = "Tblpatienthiskkm.findByBloodketone", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.bloodketone = :bloodketone")
    , @NamedQuery(name = "Tblpatienthiskkm.findByRtsscore", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.rtsscore = :rtsscore")
    , @NamedQuery(name = "Tblpatienthiskkm.findByIdealweight", query = "SELECT t FROM Tblpatienthiskkm t WHERE t.idealweight = :idealweight")})
public class Tblpatienthiskkm implements Serializable {

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
    @Size(max = 15)
    @Column(name = "bmi")
    private String bmi;
    @Size(max = 15)
    @Column(name = "etco2")
    private String etco2;
    @Size(max = 15)
    @Column(name = "pulsevolume")
    private String pulsevolume;
    @Size(max = 15)
    @Column(name = "crt")
    private String crt;
    @Size(max = 15)
    @Column(name = "shockindex")
    private String shockindex;
    @Column(name = "gcse")
    private Integer gcse;
    @Column(name = "gcsv")
    private Integer gcsv;
    @Column(name = "gcsm")
    private Integer gcsm;
    @Column(name = "gcstotal")
    private Integer gcstotal;
    @Size(max = 15)
    @Column(name = "bloodglucose")
    private String bloodglucose;
    @Size(max = 15)
    @Column(name = "bloodketone")
    private String bloodketone;
    @Size(max = 15)
    @Column(name = "rtsscore")
    private String rtsscore;
    @Size(max = 15)
    @Column(name = "idealweight")
    private String idealweight;

    public Tblpatienthiskkm() {
    }

    public Tblpatienthiskkm(Long id) {
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

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public String getEtco2() {
        return etco2;
    }

    public void setEtco2(String etco2) {
        this.etco2 = etco2;
    }

    public String getPulsevolume() {
        return pulsevolume;
    }

    public void setPulsevolume(String pulsevolume) {
        this.pulsevolume = pulsevolume;
    }

    public String getCrt() {
        return crt;
    }

    public void setCrt(String crt) {
        this.crt = crt;
    }

    public String getShockindex() {
        return shockindex;
    }

    public void setShockindex(String shockindex) {
        this.shockindex = shockindex;
    }

    public Integer getGcse() {
        return gcse;
    }

    public void setGcse(Integer gcse) {
        this.gcse = gcse;
    }

    public Integer getGcsv() {
        return gcsv;
    }

    public void setGcsv(Integer gcsv) {
        this.gcsv = gcsv;
    }

    public Integer getGcsm() {
        return gcsm;
    }

    public void setGcsm(Integer gcsm) {
        this.gcsm = gcsm;
    }

    public Integer getGcstotal() {
        return gcstotal;
    }

    public void setGcstotal(Integer gcstotal) {
        this.gcstotal = gcstotal;
    }

    public String getBloodglucose() {
        return bloodglucose;
    }

    public void setBloodglucose(String bloodglucose) {
        this.bloodglucose = bloodglucose;
    }

    public String getBloodketone() {
        return bloodketone;
    }

    public void setBloodketone(String bloodketone) {
        this.bloodketone = bloodketone;
    }

    public String getRtsscore() {
        return rtsscore;
    }

    public void setRtsscore(String rtsscore) {
        this.rtsscore = rtsscore;
    }

    public String getIdealweight() {
        return idealweight;
    }

    public void setIdealweight(String idealweight) {
        this.idealweight = idealweight;
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
        if (!(object instanceof Tblpatienthiskkm)) {
            return false;
        }
        Tblpatienthiskkm other = (Tblpatienthiskkm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tblpatienthiskkm[ id=" + id + " ]";
    }
    
}
