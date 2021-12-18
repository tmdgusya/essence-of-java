package ch10;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Example01 {

    public static void main(String[] args) {

        /**
         * Calendar 는 추상클래스라 생성자 new 로 호출이 불가능함
         */
//        Calendar calendar = new Calendar();

        /**
         * Gregorian 시간대 캘린더
         */
        Calendar gregorianCalendar = new GregorianCalendar();

        /**
         * TimeZone 기반으로 Calendar 인스턴스 배출
         */
        Calendar calendar = Calendar.getInstance();

        /**
         * Calendar 를 Date 로 변환
         */
        Calendar cal = Calendar.getInstance();
        Date d = new Date(cal.getTimeInMillis());

        /**
         * Date 를 Calendar 로 변환
         */
        Date date = new Date();
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date);
    }

}
