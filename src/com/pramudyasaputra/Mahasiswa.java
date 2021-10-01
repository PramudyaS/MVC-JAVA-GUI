package com.pramudyasaputra;

public class Mahasiswa {

    String nim;
    String nama;
    int tinggi;
    boolean pindahan;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public boolean isPindahan() {
        return pindahan;
    }

    public void setPindahan(boolean pindahan) {
        this.pindahan = pindahan;
    }

    /**
     *
     * @param nim
     * @param nama
     * @param tinggi
     */
    public Mahasiswa(String nim, String nama, int tinggi) {
        this.nim = nim;
        this.nama = nama;
        this.tinggi = tinggi;
    }

    /**
     *
     * @param nim
     * @param nama
     * @param tinggi
     * @param pindahan
     */
    public Mahasiswa(String nim, String nama, int tinggi, boolean pindahan) {
        this(nim,nama,tinggi);
        this.pindahan = pindahan;
    }


}