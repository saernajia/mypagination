package com.redapplenet.cloud.util.utils.base;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 提供了一些常用的验证方法
 * @author donglong
 */
public class HcValidUtil {
    /**
     * 判断人名称是否是全英文
     * @param name
     * @return
     */
    public static boolean checkEngName(String name){
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz/ ";
        for(int i=0;i<name.length();i++){
            if(source.indexOf(name.substring(i,i+1))==-1) return false;
        }
        int a = name.indexOf("/");
        int b = name.lastIndexOf(47);
        if(a==b && a>=2 && a< name.length()-1){ // 英文名字 a>=2 &&
            return true;
        }else
            return false;
    }

    /**
     * 判断人名称是否是全中文
     * @param name
     * @return
     */
    public static boolean checkCnEngName(String name){
        boolean isEng = false;
        char[] charArray = name.toCharArray();
        for(int i = 0 ; i < charArray.length ; i++){
            byte[] byteArray;
            try {
                byteArray = String.valueOf(charArray[i]).getBytes("GB2312");
                if(i==0 && byteArray.length==1) return false;
                if(byteArray.length==1){
                    isEng = true;
                }
                if(isEng && byteArray.length>1) return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /**
     * 验证是否是正确的手机号码格式
     * @return
     */
    public static boolean checkMobile(String mobile)   {
        String reg="^[1][3456789][\\d]{9}";
        return startCheck(reg,mobile);
    }

    /**
     * 验证字符串是否是由数字组成的
     * @return
     */
    public static boolean checkNumber(String strNumber)   {
        String reg="[0-9]*";
        return startCheck(reg,strNumber);
    }

    /**
     * 验证字符串是否是由字符加数字组成的
     * @param str
     * @return
     */
    public static boolean checkNumberChar(String str){
        String regex="([A-Z]|[a-z]|\\d)+";
        return startCheck(regex,str);
    }

    /**
     * 验证字符串是否是正确的邮箱格式
     * @param email
     * @return
     */
    public static boolean checkEmail(String email)   {
        String regex="^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z0-9]+\\s*$";
        return startCheck(regex,email);
    }

    /**
     * 身份证验证
     * @param cardNo
     * @return
     */
    public static boolean checkIdCard(String cardNo){
        String idCard = cardNo.trim();
        if (idCard.length() == 15) {
            return isValidityBrithBy15IdCard(idCard);
        } else if (idCard.length() == 18) {
            if(!idCard.toLowerCase().matches("^\\d{17}(\\d|x|X)$")){
                return false;
            }
            if(isValidityBrithBy18IdCard(idCard) && isTrueValidateCodeBy18IdCard(idCard)){
                return true;
            }else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * 通过身份证判断是男是女
     * @param idCard 15/18位身份证号码
     * @return 'f'-女、'm'-男
     */
    public static String genderByIdCard(String idCard){
        if(idCard.length() == 15){
            if(Integer.parseInt(idCard.substring(14,15)) %2 ==0){
                return "f";
            }else{
                return "m";
            }
        }else if(idCard.length() ==18){
            if(Integer.parseInt(idCard.substring(14,17))%2==0){
                return "f";
            }else{
                return "m";
            }
        }else{
            return "";
        }
    }

    /**
     * 验证18位数身份证号码中的生日是否是有效生日
     * @return
     */
    public static boolean isValidityBrithBy18IdCard(String idCard18){
        return checkDateFormat(idCard18.substring(6,14));
    }

    /**
     * 验证15位数身份证号码中的生日是否是有效生日
     * @param idCard15 15位书身份证字符串
     * @return
     */
    public static boolean isValidityBrithBy15IdCard(String idCard15){
        if(idCard15.matches("^\\d{15}$")){
            return checkDateFormat("19" + idCard15.substring(6,12));
        }
        return false;
    }

    /**
     * 校验是否是8位的日期格式，格式为：yyyyMMdd
     * @param date
     * @return
     */
    public static boolean checkDateFormat(String date) {
        try {
            if (null == date || "".equals(date) || !date.matches("[0-9]{8}")) {
                return false;
            }
            int year = Integer.parseInt(date.substring(0, 4));
            int month = Integer.parseInt(date.substring(4, 6)) - 1;
            int day = Integer.parseInt(date.substring(6));
            Calendar calendar = GregorianCalendar.getInstance();
            calendar.setLenient(false);
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month);
            calendar.set(Calendar.DATE, day);
            calendar.get(Calendar.YEAR);
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }

    /**
     * 校验是否是10位的日期格式，格式为：yyyy-MM-dd
     * @param date
     * @return
     */
    public static boolean checkDateFormat10(String date) {
        try {
            if (null == date || "".equals(date)) {
                return false;
            }
            date = (date.replace("-", "")).substring(0,8);
            return checkDateFormat(date);
        } catch (Exception e) {
            return false;
        }
    }

    /**
     *
     * @param theChar
     * @return 0-GB2312CHAR_HZ   GB2312汉字字符
     * 	       1-GB2312CHAR_NOHZ GB2312非汉字字符
     * 		   2-NOGB2312CHAR    不是GB2312字符
     * @throws
     */
    public static int checkGB2312(char theChar) {
        try {
            // 将字符窜转成GB2312编码
            byte[] byteArray = String.valueOf(theChar).getBytes("GB2312");
            // if(byteArray.length==1)
            // return 1;
            // 根据国标区位码编码规则，判断字符
            int highBit = 0;
            for (int i = 0; i < byteArray.length; i++) {
                int offset = (byteArray[i] & 0xFF) - 0xA0;
                // GB2312字符区码在1-94
                if (offset >= 1 && offset <= 94) {
                    if (highBit == 0) {
                        // 找到一个汉字区码
                        highBit = offset;
                    } else {
                        // 找到一个GB2312位码
                        if (highBit < 16 || highBit > 87) {
                            return 1;
                        } else {
                            // 位码在1-94区间 （其中对于第55 区的位码，最大为89
                            if (highBit == 55 && offset > 89) {
                                return 1;
                            } else {
                                return 0;
                            }
                        }
                    }
                } else {
                    // 不是一个GB2312字符
                    return 2;
                }
            }
            return 2;
        } catch (Exception e) {
            return 2;
        }
    }

    /*********************************   私有方法区   ***************************************/

    /**
     * 判断身份证号码为18位时最后的验证位是否正确
     * @return
     */
    private static boolean isTrueValidateCodeBy18IdCard(String idCard) {
        int[] Wi = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };// 加权因子
        int[] ValideCode = { 1, 0, 10, 9, 8, 7, 6, 5, 4, 3, 2 };// 身份证验证位值.10代表X
        int sum = 0; // 声明加权求和变量
        for (int i=0; i<17; i++) {
            sum += Wi[i] * Integer.parseInt(idCard.substring(i, i+1));// 加权求和
        }
        int valCodePosition = sum % 11;// 得到验证码所位置
        int validtemp = ValideCode[valCodePosition];
        String validstr = "" + validtemp;
        if(validstr.equals("10")){
            validstr = "x";
        }
        if ( idCard.toLowerCase().substring(17, 18).equals(validstr)  ){
            return true;
        } else {
            return false;
        }
    }


    /*
     * 开始模式匹配
     */
    private static  boolean startCheck(String reg,String string){
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher=pattern.matcher(string);
        return matcher.matches();
    }
}
