package com.example.dikkyapss.Model;

/*/
    AKB 2 10116057 Dikky Dermawan Saputra
    Changelog
    Aplikasi V0.1 29 April 2019
    - Membuat Splash Screen
    - Membuat ViewPager Walkthrough
    Aplikasi V0.2 1 Mei 2019
    - Membuat Bottom Navigation Menu Utama
    - Membuat Fragment Semua Halaman untuk Menu Utama
    - MenDesain Fragment Home
    Aplikasi V0.3 2 Mei 2019
    - Mendesain Fragment Profile
    - Membuat WebView Social Media
    Aplikasi V0.4 3 Mei 2019
    - Membuat Recycler View Daily, Gallery
    Aplikasi V0.5 4 Mei 2019
    - Membuat Recycler Music
    - Menampilkan Maps
    - About Aplikasi

 */

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
