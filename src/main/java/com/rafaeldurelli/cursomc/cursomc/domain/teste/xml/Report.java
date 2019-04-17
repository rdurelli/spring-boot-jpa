package com.rafaeldurelli.cursomc.cursomc.domain.teste.xml;

public class Report {

    private String reportName;

    private Group group;

    public Report() {

    }

    public String getReportName ()
    {
        return reportName;
    }

    public void setReportName (String reportName)
    {
        this.reportName = reportName;
    }

    public Group getGroup ()
    {
        return group;
    }

    public void setGroup (Group group)
    {
        this.group = group;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [reportName = "+reportName+", group = "+group+"]";
    }
}