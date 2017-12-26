package com.company;

class Mp3 extends Items {
    private String ablum;
    private String singer;
    public Mp3(String ablum,String singer,String title,int playingTime, String comment,boolean gotIt)
    {
        super(title, playingTime, comment,gotIt);
        this.ablum=ablum;
        this.singer=singer;
    }

    @Override
    public String toString() {
        return String.format("MP3 ablum:%s singer:%s %s", ablum, singer, super.toString());
    }
}
