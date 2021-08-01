package com.macro.mall.algorthim;

/**
 * @author 江昆
 * @date 2021年07月22日12:45
 * 动态规划解决2个字符串中相同的字符串；例如1AB2345CD,12345EF,最长公共的字符串就是2345;
 */
public class problem2{

    public static String LCS(String str1,String str2){
        int maxLength = 0;
        int maxLastLength = 0;
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        System.out.println(dp[0][0]);
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i) == str2.charAt(j)){
                     dp[i+1][j+1] = dp[i][j] + 1;
                     if(dp[i+1][j+1]>maxLength){
                         maxLastLength = i;
                         maxLength = dp[i+1][j+1];
                     }
                }else{
                    dp[i+1][j+1] = 0;
                }
            }
        }

        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                System.out.print(dp[i][j]);
                System.out.print(" ");
                if(j==str2.length()-1){
                    System.out.println("");
                }
            }
        }

        return str1.substring(maxLastLength-maxLength+1,maxLastLength+1);
    }


    public static String LCS1(String str1,String str2){
        int maxLength = 0;
        int maxLastIndex = 0;
        int[] dp = new int[str2.length()+1];
        for(int i=0;i<str1.length();i++){
            for(int j=str2.length()-1;j>=0;j--){
                if(str1.charAt(i) == str2.charAt(j)){
                    dp[j+1] = dp[j] + 1;
                    if(dp[j+1]>maxLength){
                        maxLength = dp[j+1];
                        maxLastIndex = i;
                    }
                }else{
                    dp[j+1] = 0;
                }
            }
        }
        System.out.println("maxLength is "+maxLength);
        System.out.println("maxLastIndex is "+maxLastIndex);
        return str1.substring(maxLastIndex-maxLength+1,maxLastIndex+1);
    }



    public static void main(String[] args){
        String str1 = "1AB2345CD";
        String str2 = "12345EF";
        String aaa = LCS1(str1,str2);
        System.out.println("aaa is "+aaa);
    }

}
