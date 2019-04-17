package com.rafaeldurelli.cursomc.cursomc.domain.teste.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class GroupList {

    @JacksonXmlElementWrapper(useWrapping = false)
    private Member[] member;

    public GroupList () {

    }

    public Member[] getMember ()
    {
        return member;
    }

    public void setMember (Member[] member)
    {
        this.member = member;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [member = "+member+"]";
    }
}