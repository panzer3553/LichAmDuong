package com.example.project.lichamduong.helper;

/**
 * Created by hoang on 11/11/2015.
 */
public class DateUtil {
    /**
     * @author duc
     *
     */
    public static int[] yearsCode =  {
            // The ky 19 (1800-1899)
            0x30baa3, 0x56ab50, 0x422ba0, 0x2cab61, 0x52a370, 0x3c51e8, 0x60d160, 0x4ae4b0, 0x376926, 0x58daa0,
            0x445b50, 0x3116d2, 0x562ae0, 0x3ea2e0, 0x28e2d2, 0x4ec950, 0x38d556, 0x5cb520, 0x46b690, 0x325da4,
            0x5855d0, 0x4225d0, 0x2ca5b3, 0x52a2b0, 0x3da8b7, 0x60a950, 0x4ab4a0, 0x35b2a5, 0x5aad50, 0x4455b0,
            0x302b74, 0x562570, 0x4052f9, 0x6452b0, 0x4e6950, 0x386d56, 0x5e5aa0, 0x46ab50, 0x3256d4, 0x584ae0,
            0x42a570, 0x2d4553, 0x50d2a0, 0x3be8a7, 0x60d550, 0x4a5aa0, 0x34ada5, 0x5a95d0, 0x464ae0, 0x2eaab4,
            0x54a4d0, 0x3ed2b8, 0x64b290, 0x4cb550, 0x385757, 0x5e2da0, 0x4895d0, 0x324d75, 0x5849b0, 0x42a4b0,
            0x2da4b3, 0x506a90, 0x3aad98, 0x606b50, 0x4c2b60, 0x359365, 0x5a9370, 0x464970, 0x306964, 0x52e4a0,
            0x3cea6a, 0x62da90, 0x4e5ad0, 0x392ad6, 0x5e2ae0, 0x4892e0, 0x32cad5, 0x56c950, 0x40d4a0, 0x2bd4a3,
            0x50b690, 0x3a57a7, 0x6055b0, 0x4c25d0, 0x3695b5, 0x5a92b0, 0x44a950, 0x2ed954, 0x54b4a0, 0x3cb550,
            0x286b52, 0x4e55b0, 0x3a2776, 0x5e2570, 0x4852b0, 0x32aaa5, 0x56e950, 0x406aa0, 0x2abaa3, 0x50ab50,
            // The ky 20 (1900-1999)
            0x3c4bd8, 0x624ae0, 0x4ca570, 0x3854d5, 0x5cd260, 0x44d950, 0x315554, 0x5656a0, 0x409ad0, 0x2a55d2,
            0x504ae0, 0x3aa5b6, 0x60a4d0, 0x48d250, 0x33d255, 0x58b540, 0x42d6a0, 0x2cada2, 0x5295b0, 0x3f4977,
            0x644970, 0x4ca4b0, 0x36b4b5, 0x5c6a50, 0x466d50, 0x312b54, 0x562b60, 0x409570, 0x2c52f2, 0x504970,
            0x3a6566, 0x5ed4a0, 0x48ea50, 0x336a95, 0x585ad0, 0x442b60, 0x2f86e3, 0x5292e0, 0x3dc8d7, 0x62c950,
            0x4cd4a0, 0x35d8a6, 0x5ab550, 0x4656a0, 0x31a5b4, 0x5625d0, 0x4092d0, 0x2ad2b2, 0x50a950, 0x38b557,
            0x5e6ca0, 0x48b550, 0x355355, 0x584da0, 0x42a5b0, 0x2f4573, 0x5452b0, 0x3ca9a8, 0x60e950, 0x4c6aa0,
            0x36aea6, 0x5aab50, 0x464b60, 0x30aae4, 0x56a570, 0x405260, 0x28f263, 0x4ed940, 0x38db47, 0x5cd6a0,
            0x4896d0, 0x344dd5, 0x5a4ad0, 0x42a4d0, 0x2cd4b4, 0x52b250, 0x3cd558, 0x60b540, 0x4ab5a0, 0x3755a6,
            0x5c95b0, 0x4649b0, 0x30a974, 0x56a4b0, 0x40aa50, 0x29aa52, 0x4e6d20, 0x39ad47, 0x5eab60, 0x489370,
            0x344af5, 0x5a4970, 0x4464b0, 0x2c74a3, 0x50ea50, 0x3d6a58, 0x6256a0, 0x4aaad0, 0x3696d5, 0x5c92e0,
            // The ky 21 (2000-2099)
            0x46c960, 0x2ed954, 0x54d4a0, 0x3eda50, 0x2a7552, 0x4e56a0, 0x38a7a7, 0x5ea5d0, 0x4a92b0, 0x32aab5,
            0x58a950, 0x42b4a0, 0x2cbaa4, 0x50ad50, 0x3c55d9, 0x624ba0, 0x4ca5b0, 0x375176, 0x5c5270, 0x466930,
            0x307934, 0x546aa0, 0x3ead50, 0x2a5b52, 0x504b60, 0x38a6e6, 0x5ea4e0, 0x48d260, 0x32ea65, 0x56d520,
            0x40daa0, 0x2d56a3, 0x5256d0, 0x3c4afb, 0x6249d0, 0x4ca4d0, 0x37d0b6, 0x5ab250, 0x44b520, 0x2edd25,
            0x54b5a0, 0x3e55d0, 0x2a55b2, 0x5049b0, 0x3aa577, 0x5ea4b0, 0x48aa50, 0x33b255, 0x586d20, 0x40ad60,
            0x2d4b63, 0x525370, 0x3e49e8, 0x60c970, 0x4c54b0, 0x3768a6, 0x5ada50, 0x445aa0, 0x2fa6a4, 0x54aad0,
            0x4052e0, 0x28d2e3, 0x4ec950, 0x38d557, 0x5ed4a0, 0x46d950, 0x325d55, 0x5856a0, 0x42a6d0, 0x2c55d4,
            0x5252b0, 0x3ca9b8, 0x62a930, 0x4ab490, 0x34b6a6, 0x5aad50, 0x4655a0, 0x2eab64, 0x54a570, 0x4052b0,
            0x2ab173, 0x4e6930, 0x386b37, 0x5e6aa0, 0x48ad50, 0x332ad5, 0x582b60, 0x42a570, 0x2e52e4, 0x50d160,
            0x3ae958, 0x60d520, 0x4ada90, 0x355aa6, 0x5a56d0, 0x462ae0, 0x30a9d4, 0x54a2d0, 0x3ed150, 0x28e952,
            // The ky 22 (2100-2199)
            0x4eb520, 0x38d727, 0x5eada0, 0x4a55b0, 0x362db5, 0x5a45b0, 0x44a2b0, 0x2eb2b4, 0x54a950, 0x3cb559,
            0x626b20, 0x4cad50, 0x385766, 0x5c5370, 0x484570, 0x326574, 0x5852b0, 0x406950, 0x2a7953, 0x505aa0,
            0x3baaa7, 0x5ea6d0, 0x4a4ae0, 0x35a2e5, 0x5aa550, 0x42d2a0, 0x2de2a4, 0x52d550, 0x3e5abb, 0x6256a0,
            0x4c96d0, 0x3949b6, 0x5e4ab0, 0x46a8d0, 0x30d4b5, 0x56b290, 0x40b550, 0x2a6d52, 0x504da0, 0x3b9567,
            0x609570, 0x4a49b0, 0x34a975, 0x5a64b0, 0x446a90, 0x2cba94, 0x526b50, 0x3e2b60, 0x28ab61, 0x4c9570,
            0x384ae6, 0x5cd160, 0x46e4a0, 0x2eed25, 0x54da90, 0x405b50, 0x2c36d3, 0x502ae0, 0x3a93d7, 0x6092d0,
            0x4ac950, 0x32d556, 0x58b4a0, 0x42b690, 0x2e5d94, 0x5255b0, 0x3e25fa, 0x6425b0, 0x4e92b0, 0x36aab6,
            0x5c6950, 0x4674a0, 0x31b2a5, 0x54ad50, 0x4055a0, 0x2aab73, 0x522570, 0x3a5377, 0x6052b0, 0x4a6950,
            0x346d56, 0x585aa0, 0x42ab50, 0x2e56d4, 0x544ae0, 0x3ca570, 0x2864d2, 0x4cd260, 0x36eaa6, 0x5ad550,
            0x465aa0, 0x30ada5, 0x5695d0, 0x404ad0, 0x2aa9b3, 0x50a4d0, 0x3ad2b7, 0x5eb250, 0x48b540, 0x33d556
    };
        public static final double PI = Math.PI;
        /**
         *
         * @param dd
         * @param mm
         * @param yy
         * @return the number of days since 1 January 4713 BC (Julian calendar)
         */
        public static int jdFromDate(int dd, int mm, int yy) {
            int a = (14 - mm) / 12;
            int y = yy+4800-a;
            int m = mm+12*a-3;
            int jd = dd + (153*m+2)/5 + 365*y + y/4 - y/100 + y/400 - 32045;
            if (jd < 2299161) {
                jd = dd + (153*m+2)/5 + 365*y + y/4 - 32083;
            }
            //jd = jd - 1721425;
            return jd;
        }
        /**
         * http://www.tondering.dk/claus/calendar.html
         * Section: Is there a formula for calculating the Julian day number?
         * @param jd - the number of days since 1 January 4713 BC (Julian calendar)
         * @return
         */
        public static int[] jdToDate(int jd) {
            int a, b, c;
            if (jd > 2299160) { // After 5/10/1582, Gregorian calendar
                a = jd + 32044;
                b = (4*a+3)/146097;
                c = a - (b*146097)/4;
            } else {
                b = 0;
                c = jd + 32082;
            }
            int d = (4*c+3)/1461;
            int e = c - (1461*d)/4;
            int m = (5*e+2)/153;
            int day = e - (153*m+2)/5 + 1;
            int month = m + 3 - 12*(m/10);
            int year = b*100 + d - 4800 + m/10;
            return new int[]{day, month, year};
        }
        /**
         * Solar longitude in degrees
         * Algorithm from: Astronomical Algorithms, by Jean Meeus, 1998
         * @param jdn - number of days since noon UTC on 1 January 4713 BC
         * @return
         */
        public static double SunLongitude(double jdn) {
            //return CC2K.sunLongitude(jdn);
            return SunLongitudeAA98(jdn);
        }
        public static double SunLongitudeAA98(double jdn) {
            double T = (jdn - 2451545.0 ) / 36525; // Time in Julian centuries from 2000-01-01 12:00:00 GMT
            double T2 = T*T;
            double dr = PI/180; // degree to radian
            double M = 357.52910 + 35999.05030*T - 0.0001559*T2 - 0.00000048*T*T2; // mean anomaly, degree
            double L0 = 280.46645 + 36000.76983*T + 0.0003032*T2; // mean longitude, degree
            double DL = (1.914600 - 0.004817*T - 0.000014*T2)*Math.sin(dr*M);
            DL = DL + (0.019993 - 0.000101*T)*Math.sin(dr*2*M) + 0.000290*Math.sin(dr*3*M);
            double L = L0 + DL; // true longitude, degree
            L = L - 360*(INT(L/360)); // Normalize to (0, 360)
            return L;
        }
        public static double NewMoon(int k) {
            //return CC2K.newMoonTime(k);
            return NewMoonAA98(k);
        }
        /**
         * Julian day number of the kth new moon after (or before) the New Moon of 1900-01-01 13:51 GMT.
         * Accuracy: 2 minutes
         * Algorithm from: Astronomical Algorithms, by Jean Meeus, 1998
         * @param k
         * @return the Julian date number (number of days since noon UTC on 1 January 4713 BC) of the New Moon
         */

        public static double NewMoonAA98(int k) {
            double T = k/1236.85; // Time in Julian centuries from 1900 January 0.5
            double T2 = T * T;
            double T3 = T2 * T;
            double dr = PI/180;
            double Jd1 = 2415020.75933 + 29.53058868*k + 0.0001178*T2 - 0.000000155*T3;
            Jd1 = Jd1 + 0.00033*Math.sin((166.56 + 132.87*T - 0.009173*T2)*dr); // Mean new moon
            double M = 359.2242 + 29.10535608*k - 0.0000333*T2 - 0.00000347*T3; // Sun's mean anomaly
            double Mpr = 306.0253 + 385.81691806*k + 0.0107306*T2 + 0.00001236*T3; // Moon's mean anomaly
            double F = 21.2964 + 390.67050646*k - 0.0016528*T2 - 0.00000239*T3; // Moon's argument of latitude
            double C1=(0.1734 - 0.000393*T)*Math.sin(M*dr) + 0.0021*Math.sin(2*dr*M);
            C1 = C1 - 0.4068*Math.sin(Mpr*dr) + 0.0161*Math.sin(dr*2*Mpr);
            C1 = C1 - 0.0004*Math.sin(dr*3*Mpr);
            C1 = C1 + 0.0104*Math.sin(dr*2*F) - 0.0051*Math.sin(dr*(M+Mpr));
            C1 = C1 - 0.0074*Math.sin(dr*(M-Mpr)) + 0.0004*Math.sin(dr*(2*F+M));
            C1 = C1 - 0.0004*Math.sin(dr*(2*F-M)) - 0.0006*Math.sin(dr*(2*F+Mpr));
            C1 = C1 + 0.0010*Math.sin(dr*(2*F-Mpr)) + 0.0005*Math.sin(dr*(2*Mpr+M));
            double deltat;
            if (T < -11) {
                deltat= 0.001 + 0.000839*T + 0.0002261*T2 - 0.00000845*T3 - 0.000000081*T*T3;
            } else {
                deltat= -0.000278 + 0.000265*T + 0.000262*T2;
            };
            double JdNew = Jd1 + C1 - deltat;
            return JdNew;
        }
        public static int INT(double d) {
            return (int)Math.floor(d);
        }
        public static double getSunLongitude(int dayNumber, double timeZone) {
            return SunLongitude(dayNumber - 0.5 - timeZone/24);
        }
        public static int getNewMoonDay(int k, double timeZone) {
            double jd = NewMoon(k);
            return INT(jd + 0.5 + timeZone / 24);
        }
        public static int getLunarMonth11(int yy, double timeZone) {
            double off = jdFromDate(31, 12, yy) - 2415021.076998695;
            int k = INT(off / 29.530588853);
            int nm = getNewMoonDay(k, timeZone);
            int sunLong = INT(getSunLongitude(nm, timeZone)/30);
            if (sunLong >= 9) {
                nm = getNewMoonDay(k-1, timeZone);
            }
            return nm;
        }
        public static int getLeapMonthOffset(int a11, double timeZone) {
            int k = INT(0.5 + (a11 - 2415021.076998695) / 29.530588853);
            int last; // Month 11 contains point of sun longutide 3*PI/2 (December solstice)
            int i = 1; // We start with the month following lunar month 11
            int arc = INT(getSunLongitude(getNewMoonDay(k+i, timeZone), timeZone)/30);
            do {
                last = arc;
                i++;
                arc = INT(getSunLongitude(getNewMoonDay(k+i, timeZone), timeZone)/30);
            } while (arc != last && i < 14);
            return i-1;
        }
        /**
         *
         * @param dd
         * @param mm
         * @param yy
         * @param timeZone
         * @return array of [lunarDay, lunarMonth, lunarYear, leapOrNot]
         */
        public static int[] convertSolar2Lunar(int dd, int mm, int yy, double timeZone) {
            int lunarDay, lunarMonth, lunarYear, lunarLeap;
            int dayNumber = jdFromDate(dd, mm, yy);
            int k = INT((dayNumber - 2415021.076998695) / 29.530588853);
            int monthStart = getNewMoonDay(k + 1, timeZone);
            if (monthStart > dayNumber) {
                monthStart = getNewMoonDay(k, timeZone);
            }
            int a11 = getLunarMonth11(yy, timeZone);
            int b11 = a11;
            if (a11 >= monthStart) {
                lunarYear = yy;
                a11 = getLunarMonth11(yy-1, timeZone);
            } else {
                lunarYear = yy+1;
                b11 = getLunarMonth11(yy+1, timeZone);
            }
            lunarDay = dayNumber-monthStart+1;
            int diff = INT((monthStart - a11)/29);
            lunarLeap = 0;
            lunarMonth = diff+11;
            if (b11 - a11 > 365) {
                int leapMonthDiff = getLeapMonthOffset(a11, timeZone);
                if (diff >= leapMonthDiff) {
                    lunarMonth = diff + 10;
                    if (diff == leapMonthDiff) {
                        lunarLeap = 1;
                    }
                }
            }
            if (lunarMonth > 12) {
                lunarMonth = lunarMonth - 12;
            }
            if (lunarMonth >= 11 && diff < 4) {
                lunarYear -= 1;
            }
            return new int[]{lunarDay, lunarMonth, lunarYear, lunarLeap};
        }
        public static int[] convertLunar2Solar(int lunarDay, int lunarMonth, int lunarYear, int lunarLeap, double timeZone) {
            int a11, b11;
            if (lunarMonth < 11) {
                a11 = getLunarMonth11(lunarYear-1, timeZone);
                b11 = getLunarMonth11(lunarYear, timeZone);
            } else {
                a11 = getLunarMonth11(lunarYear, timeZone);
                b11 = getLunarMonth11(lunarYear+1, timeZone);
            }
            int k = INT(0.5 + (a11 - 2415021.076998695) / 29.530588853);
            int off = lunarMonth - 11;
            if (off < 0) {
                off += 12;
            }
            if (b11 - a11 > 365) {
                int leapOff = getLeapMonthOffset(a11, timeZone);
                int leapMonth = leapOff - 2;
                if (leapMonth < 0) {
                    leapMonth += 12;
                }
                if (lunarLeap != 0 && lunarMonth != leapMonth) {
                    System.out.println("Invalid input!");
                    return new int[]{0, 0, 0};
                } else if (lunarLeap != 0 || off >= leapOff) {
                    off += 1;
                }
            }
            int monthStart = getNewMoonDay(k+off, timeZone);
            return jdToDate(monthStart+lunarDay-1);
        }


    private static int GetYearCode(int year)
    {
        return yearsCode[year - 1800];
    }

    public static int GetMonthLength(int year, int month, int leapMonth)
    {
        if (leapMonth > 0)
        {
            if (month == leapMonth) month = 0;
            else if (month > leapMonth) month--;
        }
        return (((GetYearCode(year) >> (16 - month)) & 0x1) == 0 ? 29 : 30);
    }

}

