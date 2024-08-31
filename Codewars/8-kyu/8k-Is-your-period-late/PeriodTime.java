import java.time.LocalDate;

public class PeriodTime {
  public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
    return today.toEpochDay() - last.toEpochDay() > cycleLength;
  } // periodIsLate()

  public static void main(String[] args) {
    System.out.println(periodIsLate(LocalDate.of(2016, 6, 13), LocalDate.of(2016, 7, 16), 35));
    System.out.println(periodIsLate(LocalDate.of(2016, 6, 13), LocalDate.of(2016, 7, 16), 28));
  } // main
} // PeriodTime
