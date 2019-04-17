package com.rafaeldurelli.cursomc.cursomc.domain.teste.xml;

public class Reports {

    private Report report;

    public Reports() {

    }

    public Report getReport ()
    {
        return report;
    }

    public void setReport (Report report)
    {
        this.report = report;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [report = "+report+"]";
    }
}
