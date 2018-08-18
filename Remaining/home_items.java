package com.addressapp.umu.kickstartercopy.ListLayouts;

public class home_items {

    private int id;
    private String desc,attr1,attr2,attr3;
    private int image;

    public home_items(int id, String desc, String attr1, String attr2, String attr3, int image) {
        this.id = id;
        this.desc = desc;
        this.attr1 = attr1;
        this.attr2 = attr2;
        this.attr3 = attr3;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public String getAttr1() {
        return attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public String getAttr3() {
        return attr3;
    }

    public int getImage() {
        return image;
    }
}
