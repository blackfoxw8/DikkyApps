package com.example.dikkyapss.Model;

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
