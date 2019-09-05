package com.redapplenet.cloud.util.utils.base;

import org.springframework.util.StringUtils;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * @Description
 * @Author liuqn
 * @Date 2019/2/27 20:17
 * @Version
 **/
public class DateUtil {
    /**
     * 年:        y->2019;yy->19
     * 月份：      M->2;MM->02;MMM->二月/Feb;MMMM->February;MMMMM->F
     * 日：       d->3;dd->03;
     * 星期：      E->星期四/Thu;EEEE->Thursday;EEEEE->T
     * 上午、下午   a->上午/am
     * 小时       H->3;HH->03
     * 分钟       m->2;mm->02
     * 秒         s->1;ss->01
     * 毫秒       S->x;SS->xx;SSS->xxx
     **/
    //date
    public final static String YYYY_MM_DD = "yyyy-MM-dd";
    public final static String YYYYMMDD = "yyyyMMdd";
    public final static String YYYYMMDD_CHINEA = "yyyy年MM月dd日";
    public final static String YYYYMMDD_SPRIT = "yyyy/MM/dd";
    public final static String YYYYMMDD_SPRIT_REV = "dd/MM/yyyy";
    //time
    public final static String HHMM = "hh:mm";
    public final static String HHMMSS = "hh:mm:ss";
    public final static String HHMMSS_SSS = "hh:mm:ss.SSS";
    //dateTime
    public final static String DEFAULT_DATE_TIME = "yyyy-MM-dd HH:mm:ss";
    public final static String FULL_DATE_TIME = "yMMddHHmmssSSS";

    //........................获取字符串日期和时间..............................

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description //获取字符串类型的当前日期，默认中文
     * @Date 11:46 2019/2/28
     * @Param [pattern]
     **/
    public static String getLocalDateTime(String pattern) {
        return getLocalDateTime(pattern, Locale.CHINA);
    }

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description //获取字符串类型的当前日期,指定语言Locale
     * @Date 12:23 2019/2/28
     * @Param [pattern, locale]
     **/
    public static String getLocalDateTime(String pattern, Locale locale) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern).withLocale(locale);
        return LocalDateTime.now().format(dtf);
    }

    /**
     * @return void
     * @Author liuqn
     * @Description 获取当前日期  格式：yyyy-MM-dd HH:mm:ss
     * @Date 12:26 2019/2/28
     * @Param [args]
     **/
    public static String getDefaultCurDateTime() {
        return getLocalDateTime(DEFAULT_DATE_TIME, Locale.CHINA);
    }

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description 获取当前日期  格式：yyyy-MM-dd
     * @Date 12:30 2019/2/28
     * @Param []
     **/
    public static String getDefaultCurDate() {
        return getLocalDateTime(YYYY_MM_DD, Locale.CHINA);
    }

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description 获取当前时间  格式：HH:mm:ss
     * @Date 12:30 2019/2/28
     * @Param []
     **/
    public static String getDefaultCurTime() {
        return getLocalDateTime(HHMMSS, Locale.CHINA);
    }

    //.....................日期运算......................


    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description 年份加减，新日期的格式与旧日期相同
     * @Date 13:05 2019/2/28
     * @Param [dateTime, year 正数增加，负数减小, pattern]
     **/
    public static String plusYear(String source, int year, String pattern) {

        return plusYear(source, year, pattern, pattern);

    }

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description 年份加减, 并指定新日期的格式
     * @Date 13:05 2019/2/28
     * @Param [dateTime, year 正数增加，负数减小, pattern]
     **/
    public static String plusYear(String source, int year, String oriPattern, String newPattern) {
        LocalDateTime localDateTime = plus(source, oriPattern, year, ChronoUnit.YEARS);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(newPattern);
        if (localDateTime != null) {
            return localDateTime.format(dtf);
        }
        return null;
    }

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description 月份加减，新日期的格式与旧日期相同
     * @Date 13:05 2019/2/28
     * @Param [dateTime, year 正数增加，负数减小, pattern]
     **/
    public static String plusMouth(String source, int mouth, String pattern) {

        return plusMouth(source, mouth, pattern, pattern);

    }

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description 月份加减, 并指定新日期的格式
     * @Date 13:05 2019/2/28
     * @Param [dateTime, year 正数增加，负数减小, pattern]
     **/
    public static String plusMouth(String source, int mouth, String oriPattern, String newPattern) {
        LocalDateTime localDateTime = plus(source, oriPattern, mouth, ChronoUnit.MONTHS);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(newPattern);
        if (localDateTime != null) {
            return localDateTime.format(dtf);
        }
        return null;
    }

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description 天数加减，新日期的格式与旧日期相同
     * @Date 13:05 2019/2/28
     * @Param [dateTime, year 正数增加，负数减小, pattern]
     **/
    public static String plusDay(String source, int day, String pattern) {

        return plusDay(source, day, pattern, pattern);

    }

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description 天数加减，并指定新日期的格式
     * @Date 13:05 2019/2/28
     * @Param [dateTime, year 正数增加，负数减小, pattern]
     **/
    public static String plusDay(String source, int day, String oriPattern, String newPattern) {
        LocalDateTime localDateTime = plus(source, oriPattern, day, ChronoUnit.DAYS);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(newPattern);
        if (localDateTime != null) {
            return localDateTime.format(dtf);
        }
        return null;
    }

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description 小时加减，新日期的格式与旧日期相同
     * @Date 13:05 2019/2/28
     * @Param [dateTime, year 正数增加，负数减小, pattern]
     **/
    public static String plusHour(String source, int hour, String pattern) {

        return plusHour(source, hour, pattern, pattern);

    }

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description 小时加减，并指定新日期的格式
     * @Date 13:05 2019/2/28
     * @Param [dateTime, year 正数增加，负数减小, pattern]
     **/
    public static String plusHour(String source, int hour, String oriPattern, String newPattern) {
        LocalDateTime localDateTime = plus(source, oriPattern, hour, ChronoUnit.HOURS);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(newPattern);
        if (localDateTime != null) {
            return localDateTime.format(dtf);
        }
        return null;
    }

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description 分钟加减，新日期的格式与旧日期相同
     * @Date 13:05 2019/2/28
     * @Param [dateTime, year 正数增加，负数减小, pattern]
     **/
    public static String plusMinutes​(String source, int minute, String pattern) {

        return plusHour(source, minute, pattern, pattern);

    }

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description 分钟数加减，并指定新日期的格式
     * @Date 13:05 2019/2/28
     * @Param [dateTime, year 正数增加，负数减小, pattern]
     **/
    public static String plusMinutes​(String source, int minute, String oriPattern, String newPattern) {
        LocalDateTime localDateTime = plus(source, oriPattern, minute, ChronoUnit.MINUTES);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(newPattern);
        if (localDateTime != null) {
            return localDateTime.format(dtf);
        }
        return null;
    }

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description 秒数加减，新日期的格式与旧日期相同
     * @Date 13:05 2019/2/28
     * @Param [dateTime, year 正数增加，负数减小, pattern]
     **/
    public static String plusSeconds​(String source, long second, String pattern) {

        return plusSeconds​(source, second, pattern, pattern);

    }

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description 秒数加减，并指定新日期的格式
     * @Date 13:05 2019/2/28
     * @Param [dateTime, year 正数增加，负数减小, pattern]
     **/
    public static String plusSeconds​(String source, long minute, String oriPattern, String newPattern) {
        LocalDateTime localDateTime = plus(source, oriPattern, minute, ChronoUnit.SECONDS);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(newPattern);
        if (localDateTime != null) {
            return localDateTime.format(dtf);
        }
        return null;
    }

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description 星期数加减，新日期的格式与旧日期相同
     * @Date 13:05 2019/2/28
     * @Param [dateTime, year 正数增加，负数减小, pattern]
     **/
    public static String plusWeeks(String source, int week, String pattern) {

        return plusSeconds​(source, week, pattern, pattern);

    }

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description 星期数加减，并指定新日期的格式
     * @Date 13:05 2019/2/28
     * @Param [dateTime, year 正数增加，负数减小, pattern]
     **/
    public static String plusWeeks(String source, int week, String oriPattern, String newPattern) {
        LocalDateTime localDateTime = plus(source, oriPattern, week, ChronoUnit.WEEKS);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(newPattern);
        if (localDateTime != null) {
            return localDateTime.format(dtf);
        }
        return null;
    }

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description 日期格式转换，中文-》中文
     * @Date 17:31 2019/2/28
     * @Param [source, oriPattern, newPattern]
     **/
    public static String changePattern(String source, String oriPattern, String newPattern) {

        return changePattern(source, oriPattern, newPattern, Locale.CHINA);
    }

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description 日期格式转换，指定Locale
     * @Date 17:31 2019/2/28
     * @Param [source, oriPattern, newPattern]
     **/
    public static String changePattern(String source, String oriPattern, String newPattern, Locale locale) {
        Instant instant = instant(source, oriPattern);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(newPattern, locale);
        if (instant != null) {
            return LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).format(dtf);
        }
        return null;
    }


    private static LocalDateTime plus(String source, String oriPattern, long count, ChronoUnit unit) {
        Instant instant = toInstant(source, oriPattern, count, unit);
        if (instant != null) {
            return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        }
        return null;
    }

    /**
     * @return boolean
     * @Author liuqn
     * @Description 相同格式大于
     * @Date 19:23 2019/2/28
     * @Param [source1, source2, pattern]
     **/
    public static boolean isAfter(String source1, String source2, String pattern) {
        return isAfter(source1, source2, pattern, pattern);
    }

    /**
     * @return boolean
     * @Author liuqn
     * @Description 不同格式大于
     * @Date 19:23 2019/2/28
     * @Param [source1, source2, pattern1, pattern2]
     **/
    public static boolean isAfter(String source1, String source2, String pattern1, String pattern2) {
        return instant(source1, pattern1).toEpochMilli() > instant(source2, pattern2).toEpochMilli();
    }

    /**
     * @return boolean
     * @Author liuqn
     * @Description 相同格式等于
     * @Date 19:21 2019/2/28
     * @Param [source1, source2, pattern]
     **/
    public static boolean isEqual(String source1, String source2, String pattern) {

        return isEqual(source1, source2, pattern, pattern);

    }

    /**
     * @return boolean
     * @Author liuqn
     * @Description 不同格式等于
     * @Date 19:20 2019/2/28
     * @Param [source1, source2, pattern1, pattern2]
     **/
    public static boolean isEqual(String source1, String source2, String pattern1, String pattern2) {
        return instant(source1, pattern1).toEpochMilli() == (instant(source2, pattern2)).toEpochMilli();

    }

    /**
     * @return boolean
     * @Author liuqn
     * @Description 相同格式大于等于
     * @Date 19:20 2019/2/28
     * @Param [source1, source2, pattern]
     **/
    public static boolean largeAndEqual(String source1, String source2, String pattern) {

        return largeAndEqual(source1, source2, pattern, pattern);
    }

    /**
     * @return boolean
     * @Author liuqn
     * @Description 不同格式大于等于
     * @Date 19:18 2019/2/28
     * @Param [source1, source2, pattern1, pattern2]
     **/
    public static boolean largeAndEqual(String source1, String source2, String pattern1, String pattern2) {
        return instant(source1, pattern1).toEpochMilli() >= (instant(source2, pattern2)).toEpochMilli();
    }

    public static boolean isBetween(String targetBefore, String targetAfter,String source, String pattern1){
        return  largeAndEqual(source,targetBefore,pattern1)&&largeAndEqual(targetAfter,source,pattern1);
    }

    /**
     * @return long
     * @Author liuqn
     * @Description 当前unix时间戳
     * @Date 17:33 2019/2/28
     * @Param [source, pattern]
     **/
    public static long toCurUnix() {
        return Instant.now().toEpochMilli();
    }

    /**
     * @return long
     * @Author liuqn
     * @Description 字符串-》unix时间戳
     * @Date 17:33 2019/2/28
     * @Param [source, pattern]
     **/
    public static long toUnix(String source, String pattern) {
        return instant(source, pattern).toEpochMilli();
    }

    /**
     * @return java.lang.String
     * @Author liuqn
     * @Description unix时间戳-》String
     * @Date 17:33 2019/2/28
     * @Param [milli, pattern]
     **/
    public static String fromUnix(long milli, String pattern) {
        Instant instant = Instant.ofEpochMilli(milli);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).format(dtf);
    }

    /**
     * @return long
     * @Author liuqn
     * @Description 月份间隔数，需要比较的2个对象格式一致
     * @Date 17:35 2019/2/28
     * @Param [source1, source2, pattern]
     **/
    public static long untilMouth(String source1, String source2, String pattern) {
        return untilDay(source1, source2, pattern, ChronoUnit.MONTHS);
    }

    /**
     * @return long
     * @Author liuqn
     * @Description 星期间隔数，需要比较的2个对象格式一致
     * @Date 17:35 2019/2/28
     * @Param [source1, source2, pattern]
     **/
    public static long untilWeek(String source1, String source2, String pattern) {
        return untilDay(source1, source2, pattern, ChronoUnit.WEEKS);
    }

    /**
     * @return long
     * @Author liuqn
     * @Description 天数间隔数，需要比较的2个对象格式一致
     * @Date 17:35 2019/2/28
     * @Param [source1, source2, pattern]
     **/
    public static long untilDay(String source1, String source2, String pattern) {
        return untilInstant(source1, source2, pattern, ChronoUnit.DAYS);
    }

    /**
     * @return long
     * @Author liuqn
     * @Description 半天数间隔数，需要比较的2个对象格式一致
     * @Date 17:35 2019/2/28
     * @Param [source1, source2, pattern]
     **/
    public static long untilHalfDay(String source1, String source2, String pattern) {
        return untilInstant(source1, source2, pattern, ChronoUnit.HALF_DAYS);
    }

    /**
     * @return long
     * @Author liuqn
     * @Description 小时数间隔数，需要比较的2个对象格式一致
     * @Date 17:35 2019/2/28
     * @Param [source1, source2, pattern]
     **/
    public static long untilHour(String source1, String source2, String pattern) {
        return untilInstant(source1, source2, pattern, ChronoUnit.HOURS);
    }

    /**
     * @return long
     * @Author liuqn
     * @Description 分钟数间隔数，需要比较的2个对象格式一致
     * @Date 17:35 2019/2/28
     * @Param [source1, source2, pattern]
     **/
    public static long untilMinute(String source1, String source2, String pattern) {
        return untilInstant(source1, source2, pattern, ChronoUnit.MINUTES);
    }

    /**
     * @return long
     * @Author liuqn
     * @Description 按毫秒数比较差值
     * @Date 17:35 2019/2/28
     * @Param [source1, source2, pattern]
     **/
    private static long untilInstant(String source1, String source2, String pattern, ChronoUnit unit) {
        return instant(source1, pattern).until(instant(source2, pattern), unit);
    }

    /**
     * @return long
     * @Author liuqn
     * @Description 按日期数比较差值
     * @Date 17:35 2019/2/28
     * @Param [source1, source2, pattern]
     **/
    private static long untilDay(String source1, String source2, String pattern, ChronoUnit unit) {
        Instant instant = instant(source1, pattern);
        Instant instant1 = instant(source2, pattern);
        return LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).until(LocalDateTime.ofInstant(instant1, ZoneId.systemDefault()), unit);
    }

    /**
     * @return java.time.Instant
     * @Author liuqn
     * @Description 字符串转Intant统一方法
     * @Date 17:39 2019/2/28
     * @Param [source, pattern]
     **/
    private static Instant instant(String source, String pattern) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        if (isLocalDate(pattern)) {
            return LocalDate.parse(source, dtf).atStartOfDay(ZoneId.systemDefault()).toInstant();
        }
        if (isLocalTime(pattern)) {
            return LocalTime.parse(source, dtf).atDate(LocalDate.now()).atZone(ZoneId.systemDefault()).toInstant();
        }
        if (isLocalDateTime(pattern)) {
            return LocalDateTime.parse(source, dtf).atZone(ZoneId.systemDefault()).toInstant();
        }
        return null;
    }

    /**
     * @return java.time.Instant
     * @Author liuqn
     * @Description plus运算后，返回统一Instant
     * @Date 17:41 2019/2/28
     * @Param [source, pattern, count, unit]
     **/
    private static Instant toInstant(String source, String pattern, long count, ChronoUnit unit) {
        //日为空，默认01
        if (pattern.equals("yyyy-MM")) {
            pattern = pattern + "-dd";
            source = source + "-01";
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        if (isLocalDate(pattern)) {
            return LocalDate.parse(source, dtf).plus(count, unit).atStartOfDay(ZoneId.systemDefault()).toInstant();
        }
        if (isLocalTime(pattern)) {
            return LocalTime.parse(source, dtf).atDate(LocalDate.now()).plus(count, unit).atZone(ZoneId.systemDefault()).toInstant();
        }
        if (isLocalDateTime(pattern)) {
            return LocalDateTime.parse(source, dtf).plus(count, unit).atZone(ZoneId.systemDefault()).toInstant();
        }
        return null;
    }

    private static boolean hasLocalDate(String pattern) {
        return pattern.contains("y");
    }

    private static boolean hasLocalTime(String pattern) {
        return pattern.contains("H") || pattern.contains("m") || pattern.contains("s");
    }

    private static boolean isLocalDate(String pattern) {
        return hasLocalDate(pattern) && !hasLocalTime(pattern);
    }

    private static boolean isLocalTime(String pattern) {
        return !hasLocalDate(pattern) && hasLocalTime(pattern);
    }

    private static boolean isLocalDateTime(String pattern) {
        return hasLocalDate(pattern) && hasLocalTime(pattern);
    }

    private static boolean checkPattern(String source1, String source2) {
        if (StringUtils.isEmpty(source1) || StringUtils.isEmpty(source2) || source1.trim().length() != source2.trim().length()) {
            return false;
        }
        for (int i = 0; i < source1.length(); i++) {
            char char1 = source1.charAt(i);
            char char2 = source2.charAt(i);
            if (Character.isDigit(char1) != Character.isDigit(char2)) {

                return false;
            }
            if (Character.isLetter(char1) != Character.isLetter(char2)) {
                return false;
            }
            if (!Character.isDigit(char1) && !Character.isLetter(char2) && char1 != char2) {
                return false;
            }


        }
        return true;
    }

    /**
    *@Description: Date 转 XMLGregorianCalendar
    *@Author: huangyikai
    *@date: 2019/4/2 20:04
    *@Param:
    *@return:
    */
    public static XMLGregorianCalendar convertToXMLGregorianCalendar(Date date) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        XMLGregorianCalendar gc = null;
        try {
            gc = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return gc;
    }

    /**
    *@Description: XMLGregorianCalendar 转 Date
    *@Author: huangyikai
    *@date: 2019/4/2 20:05
    *@Param:
    *@return:
    */
    public static Date convertToDate(XMLGregorianCalendar cal) throws Exception{
        GregorianCalendar ca = cal.toGregorianCalendar();
        return ca.getTime();
    }

    /**
     * 将date转换成string
     * @param date
     * @param pattern
     * @return
     */
    public static String date2string(Date date, String pattern) {
        if(null==date){
            return "";
        }
        return getSimpleDateFormat(pattern).format(date);
    }

    private static final java.text.SimpleDateFormat getSimpleDateFormat(String pattern){
        if(pattern.indexOf("MMM")>=0){
            DateFormatSymbols symbols=new DateFormatSymbols();
            String[] oddMonthAbbreviations = new String[]{"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT","NOV", "DEC"};
            symbols.setShortMonths(oddMonthAbbreviations);
            return new java.text.SimpleDateFormat(pattern,symbols);
        }
        return new java.text.SimpleDateFormat(pattern);
    }

    /**
     * 将string转换成date
     * @param pattern
     * @return
     */
    public static Date string2date(String strDate, String pattern) {
        if(HcStringUtil.isEmpty(strDate)){
            return null;
        }
        try {
            return getSimpleDateFormat(pattern).parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
