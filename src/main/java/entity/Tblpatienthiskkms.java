/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author emafazillah
 */
@Entity
@Table(name = "tblpatienthiskkms")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblpatienthiskkms.findAll", query = "SELECT t FROM Tblpatienthiskkms t")
    , @NamedQuery(name = "Tblpatienthiskkms.findById", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.id = :id")
    , @NamedQuery(name = "Tblpatienthiskkms.findByReading", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.reading = :reading")
    , @NamedQuery(name = "Tblpatienthiskkms.findByClinicianid", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.clinicianid = :clinicianid")
    , @NamedQuery(name = "Tblpatienthiskkms.findByDate", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.date = :date")
    , @NamedQuery(name = "Tblpatienthiskkms.findByDiastolic", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.diastolic = :diastolic")
    , @NamedQuery(name = "Tblpatienthiskkms.findByHeight", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.height = :height")
    , @NamedQuery(name = "Tblpatienthiskkms.findByHr", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.hr = :hr")
    , @NamedQuery(name = "Tblpatienthiskkms.findByMap", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.map = :map")
    , @NamedQuery(name = "Tblpatienthiskkms.findByO2sat", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.o2sat = :o2sat")
    , @NamedQuery(name = "Tblpatienthiskkms.findByPain", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.pain = :pain")
    , @NamedQuery(name = "Tblpatienthiskkms.findByPatientid", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.patientid = :patientid")
    , @NamedQuery(name = "Tblpatienthiskkms.findByPulse", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.pulse = :pulse")
    , @NamedQuery(name = "Tblpatienthiskkms.findByRespiration", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.respiration = :respiration")
    , @NamedQuery(name = "Tblpatienthiskkms.findBySystolic", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.systolic = :systolic")
    , @NamedQuery(name = "Tblpatienthiskkms.findByTemperature", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.temperature = :temperature")
    , @NamedQuery(name = "Tblpatienthiskkms.findByWeight", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.weight = :weight")
    , @NamedQuery(name = "Tblpatienthiskkms.findByEtco2", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.etco2 = :etco2")
    , @NamedQuery(name = "Tblpatienthiskkms.findByPulsevolume", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.pulsevolume = :pulsevolume")
    , @NamedQuery(name = "Tblpatienthiskkms.findByCrt", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.crt = :crt")
    , @NamedQuery(name = "Tblpatienthiskkms.findByShockindex", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.shockindex = :shockindex")
    , @NamedQuery(name = "Tblpatienthiskkms.findByGcse", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.gcse = :gcse")
    , @NamedQuery(name = "Tblpatienthiskkms.findByGcsv", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.gcsv = :gcsv")
    , @NamedQuery(name = "Tblpatienthiskkms.findByGcsm", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.gcsm = :gcsm")
    , @NamedQuery(name = "Tblpatienthiskkms.findByGcstotal", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.gcstotal = :gcstotal")
    , @NamedQuery(name = "Tblpatienthiskkms.findByBloodglucose", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.bloodglucose = :bloodglucose")
    , @NamedQuery(name = "Tblpatienthiskkms.findByBloodketone", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.bloodketone = :bloodketone")
    , @NamedQuery(name = "Tblpatienthiskkms.findByRtsscore", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.rtsscore = :rtsscore")
    , @NamedQuery(name = "Tblpatienthiskkms.findByIdealweight", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.idealweight = :idealweight")
    , @NamedQuery(name = "Tblpatienthiskkms.findByBmi", query = "SELECT t FROM Tblpatienthiskkms t WHERE t.bmi = :bmi")})
public class Tblpatienthiskkms implements Serializable {

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
    @Size(max = 20)
    @Column(name = "date")
    private String date;
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
    @Size(max = 15)
    @Column(name = "bmi")
    private String bmi;

    public Tblpatienthiskkms() {
    }

    public Tblpatienthiskkms(Long id) {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
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
        if (!(object instanceof Tblpatienthiskkms)) {
            return false;
        }
        Tblpatienthiskkms other = (Tblpatienthiskkms) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tblpatienthiskkms[ id=" + id + " ]";
    }
    
}
