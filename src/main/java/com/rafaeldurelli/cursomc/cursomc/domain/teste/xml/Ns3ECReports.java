package com.rafaeldurelli.cursomc.cursomc.domain.teste.xml;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ns3ECReports {

    @JacksonXmlProperty(isAttribute = true, localName = "gtiReportId")
    private String ns2_gtiReportId;

    @JacksonXmlProperty(isAttribute = true, localName = "gtiTenantId")
    private String ns2_gtiTenantId;



    private String date;

    private Reports reports;

    @JsonProperty("ALEID")
    private String ALEID;

    private String initiationCondition;

    private String specName;

    private String totalMilliseconds;

    private String terminationCondition;

    private String creationDate;

    public Ns3ECReports() {

    }

    public String getNs2_gtiTenantId() {
        return ns2_gtiTenantId;
    }

    public void setNs2_gtiTenantId(String ns2_gtiTenantId) {
        this.ns2_gtiTenantId = ns2_gtiTenantId;
    }

    public String getNs2_gtiReportId() {
        return ns2_gtiReportId;
    }

    public void setNs2_gtiReportId(String ns2_gtiReportId) {
        this.ns2_gtiReportId = ns2_gtiReportId;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public Reports getReports ()
    {
        return reports;
    }

    public void setReports (Reports reports)
    {
        this.reports = reports;
    }

    public String getALEID ()
    {
        return ALEID;
    }

    public void setALEID (String ALEID)
    {
        this.ALEID = ALEID;
    }

    public String getInitiationCondition ()
    {
        return initiationCondition;
    }

    public void setInitiationCondition (String initiationCondition)
    {
        this.initiationCondition = initiationCondition;
    }

    public String getSpecName ()
    {
        return specName;
    }

    public void setSpecName (String specName)
    {
        this.specName = specName;
    }

    public String getTotalMilliseconds ()
    {
        return totalMilliseconds;
    }

    public void setTotalMilliseconds (String totalMilliseconds)
    {
        this.totalMilliseconds = totalMilliseconds;
    }

    public String getTerminationCondition ()
    {
        return terminationCondition;
    }

    public void setTerminationCondition (String terminationCondition)
    {
        this.terminationCondition = terminationCondition;
    }

    public String getCreationDate ()
    {
        return creationDate;
    }

    public void setCreationDate (String creationDate)
    {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Ns3ECReports{" +
                "ns2_gtiReportId='" + ns2_gtiReportId + '\'' +
                ", ns2_gtiTenantId='" + ns2_gtiTenantId + '\'' +
                ", date='" + date + '\'' +
                ", reports=" + reports +
                ", ALEID='" + ALEID + '\'' +
                ", initiationCondition='" + initiationCondition + '\'' +
                ", specName='" + specName + '\'' +
                ", totalMilliseconds='" + totalMilliseconds + '\'' +
                ", terminationCondition='" + terminationCondition + '\'' +
                ", creationDate='" + creationDate + '\'' +
                '}';
    }


    //    @Override
//    public String toString()
//    {
//        return "ClassPojo [date = "+date+", reports = "+reports+", ALEID = "+ALEID+", initiationCondition = "+initiationCondition+", specName = "+specName+", totalMilliseconds = "+totalMilliseconds+", terminationCondition = "+terminationCondition+", creationDate = "+creationDate+"]";
//    }
}