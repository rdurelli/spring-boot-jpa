package com.rafaeldurelli.cursomc.cursomc.domain.teste.xml;

public class Member {

    private String rawHex;


    public Member() {

    }

    public String getRawHex ()
    {
        return rawHex;
    }

    public void setRawHex (String rawHex)
    {
        this.rawHex = rawHex;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [rawHex = "+rawHex+"]";
    }
}