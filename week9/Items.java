package com.company;

class Items {
    private String title;
    private int playingTime;
    private boolean gotIt=false;
    private String comment;
    public Items(String title,int playingTime,String comment,boolean gotIt){
        super();
        this.title=title;
        this.gotIt=gotIt;
        this.playingTime=playingTime;
        this.comment=comment;
    }
    public String toString()
    {
        return String.format("title:%s playingTime:%dmin comment:%s gotit:%s", title, playingTime, comment, gotIt);
    }
}
