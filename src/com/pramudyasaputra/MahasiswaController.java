package com.pramudyasaputra;

import java.util.ArrayList;

public class MahasiswaController {
    ArrayList<Mahasiswa> data;

    public MahasiswaController()
    {
        data = new ArrayList<Mahasiswa>();
    }

    public void create(String NIM,String name,int height,boolean transfer)
    {
        data.add(new Mahasiswa(NIM,name,height,transfer));
    }

    public ArrayList<Mahasiswa> all()
    {
       return data;
    }
}
