package com.shao.java;

import com.shao.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shaojianwei
 * @create 2021-07-07 14:49
 */
public class TemplatesTest {
    //    模板六 prsf 生成 private static final
    private static final Customer cust = new Customer();
    //    变形 psf
    public static final int NUM1 = 1 ;
    //    变形 psfi
    public static final int NUM2 = 2 ;
    //    变形 psfs
    public static final String NATION = "China";

    //模板1 psvm
    public static void main(String[] args){
        //模板2 sout
        System.out.println();
        //变形 soutp soutm soutv xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        System.out.println("args = " + args);
        System.out.println(args);
        //模板3 fori
        String[] arr = new String[]{
                "Tom",
                "Jerry",
                "Micheal"
        };
        for (int i = 0; i < arr.length; i++) {
            
        }
        //变形 iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形 itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四 list.for
        List<String> list = new ArrayList<String>();
        for (String s : list) {

        }
        //变形 list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形 list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            //倒序
        }

        //模板五 ifn
        if (list == null) {

        }
        //变形 inn
        if (list != null) {

        }
        //变形 xxx.null
        if (list == null) {

        }
        //变形 xxx.nn
        if (list != null) {

        }


    }
    public void method(){

    }

}
