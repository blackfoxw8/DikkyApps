package com.example.dikkyapss.Model;

public class Music  {

    private String namamusic;
    private String genremusic;
    private String tahun;

    public Music(String namamusic, String genremusic, String tahun)
    {
        this.namamusic = namamusic;
        this.genremusic = genremusic;
        this.tahun = tahun;
    }

    public String getNamamusic()
    {
        return namamusic;
    }
    public void setNamamusic(String namamusic)
    {
        this.namamusic = namamusic;
    }
    public String getGenremusic()
    {
        return genremusic;
    }
    public void setGenremusic(String genremusic)
    {
        this.genremusic = genremusic;
    }
    public String getTahun()
    {
        return tahun;
    }
    public void setTahun(String tahun)
    {
        this.tahun = tahun;
    }


}
