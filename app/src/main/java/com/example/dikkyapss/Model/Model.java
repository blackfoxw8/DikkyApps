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

public class Model {

        private String aktifitas;
        private String kegiatan;
        private String kerjakan;

        public Model (String aktifitas, String kegiatan, String kerjakan) {
            this.aktifitas = aktifitas;
            this.kegiatan = kegiatan;
            this.kerjakan = kerjakan;

        }

        public String getAktifitas() {
            return aktifitas;
        }

        public void setAktifitas(String aktifitas) {
            this.aktifitas = aktifitas;
        }

        public String getKegiatan() {
            return kegiatan;
        }

        public void setKegiatan(String kegiatan) {
            this.kegiatan = kegiatan;
        }

        public String getKerjakan() {
            return kerjakan;
        }

        public void setKerjakan(String kerjakan) {
            this.kerjakan = kerjakan;
        }
}
