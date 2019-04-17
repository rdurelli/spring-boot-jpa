package com.rafaeldurelli.cursomc.cursomc.domain.teste.xml;

public class Group {

    private GroupList groupList;

    public Group() {

    }

    public GroupList getGroupList ()
    {
        return groupList;
    }

    public void setGroupList (GroupList groupList)
    {
        this.groupList = groupList;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [groupList = "+groupList+"]";
    }
}

