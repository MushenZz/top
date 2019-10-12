package com.soeasy.top.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: top
 * @description:
 * @author: ZhengZhe
 * @create: 2019-10-12 11:44
 */
public class test {
    public static   void change(String string){
        string = "welcome";
    }
    public static void main(String[] args) {
//            List<Object> list = new ArrayList<>();
//            int[] a={5,6,6,6,7,6,6,8};
//            for (int i = 0; i < a.length; i++) {
//                System.out.println("外循环>>>>>>>>"+i);
//                for (int j = i + 1; j < a.length; j++) {
//                    if (a[i] == a[j]) {
//                        j = ++i;
//                    }
//                    System.out.println("内循环>>>>>>>>>>j"+j);
//                    System.out.println("内循环>>>>>>>>>>i"+i);
//                }
//                list.add(a[i]);
//            }
//            System.out.println("去重后的结果为: >>>>>>>>>>>>>>"+list);


        String i = "1234";

        change(i);

        System.out.println(i);
    }


}
