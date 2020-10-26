package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    LocalDate labourDayThisYear =  LocalDate.of(date.getYear(), 5, 1);
    LocalDate labourDayNextYear = labourDayThisYear.plusYears(1);

    if (date.isBefore(labourDayThisYear)) {
      return labourDayThisYear.getDayOfYear() - date.getDayOfYear();
    } else {
      return labourDayThisYear.lengthOfYear()- date.getDayOfYear()+labourDayNextYear.getDayOfYear();
    }
  }
}
