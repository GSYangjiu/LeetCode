package com.easy;

/**
 * Created by Marik on 2017/7/17.
 */
public class RomantoInteger_13 {
    public int romanToInt(String s) {
        int result = 0;
        char[] in = s.toCharArray();
        for (int i=s.length()-1;i>=0;i--){
            switch (in[i]){
                case 'I':in[i]=1;
                    break;
                case 'V':in[i]=5;
                    break;
                case 'X':in[i]=10;
                    break;
                case 'L':in[i]=50;
                    break;
                case 'C':in[i]=100;
                    break;
                case 'D':in[i]=500;
                    break;
                case 'M':in[i]=1000;
                    break;
            }
            if (i==s.length()-1){
                result = in[i];
            }else {
                if(in[i]<in[i+1]){
                    result -= in[i];
                }else{
                    result += in[i];
                }
            }
        }
        return result;
    }
}

//    int sum=0;
//    if(s.indexOf("IV")!=-1){sum-=2;}
//            if(s.indexOf("IX")!=-1){sum-=2;}
//            if(s.indexOf("XL")!=-1){sum-=20;}
//            if(s.indexOf("XC")!=-1){sum-=20;}
//            if(s.indexOf("CD")!=-1){sum-=200;}
//            if(s.indexOf("CM")!=-1){sum-=200;}
//
//            char c[]=s.toCharArray();
//            int count=0;
//
//            for(;count<=s.length()-1;count++){
//            if(c[count]=='M') sum+=1000;
//            if(c[count]=='D') sum+=500;
//            if(c[count]=='C') sum+=100;
//            if(c[count]=='L') sum+=50;
//            if(c[count]=='X') sum+=10;
//            if(c[count]=='V') sum+=5;
//            if(c[count]=='I') sum+=1;
//
//            }
//
//            return sum;