package ru.itmo.coursework02;

import java.sql.Array;
import java.util.*;

public class Step {
    private String title;
    private String desc;
    private String nxtStp1;
    private String nxtStp2;

    public Step(String title, String desc, String nxtStp1, String nxtStp2) {
        this.title = title;
        this.desc = desc;
        this.nxtStp1 = nxtStp1;
        this.nxtStp2 = nxtStp2;
    }

    protected String getTitle() {
        return title;
    }

    protected String getDesc() {
        return desc;
    }

    protected String getNxtStp1() {
        return nxtStp1;
    }

    protected String getNxtStp2() {
        return nxtStp2;
    }


     /*{


    /* ArrayList<Step> steps = new ArrayList<>();{
        steps.add(0,step01);
        steps.add(1,step02);
        steps.add(2,step03);
        steps.add(3,step04);
        steps.add(4,step05);
        steps.add(5,step06);
        steps.add(6,step07);
        steps.add(7,step08);
        steps.add(8,step09);
        steps.add(9,step10);
        steps.add(10,step11);
        steps.add(11,step12);
        steps.add(12,step13);
    }

    Map <Integer, Step> steps = new HashMap<>();{
        steps.put(1,step01);
        steps.put(2,step02);
        steps.put(3,step03);
        steps.put(4,step04);
        steps.put(5,step05);
        steps.put(6,step06);
        steps.put(7,step07);
        steps.put(8,step08);
        steps.put(9,step09);
        steps.put(10,step10);
        steps.put(11,step11);
        steps.put(12,step12);
        steps.put(13,step13);
    }*/

}




