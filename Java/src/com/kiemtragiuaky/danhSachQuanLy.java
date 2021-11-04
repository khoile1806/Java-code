package com.kiemtragiuaky;
import java.util.ArrayList;

public class danhSachQuanLy {
    private ArrayList<Object> list = new ArrayList<Object>();
    public void themNguoi(Object object){
        list.add(object);
    }
    public void inDanhSach(){
        for(Object object: list){
            System.out.println(object.toString());
        }
        
    }
}