package newDateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nextWorkingDay();
		//displayDaysAlive();
		//display13thInCentury();
		//testTimeIntervalClass();
		//America/Los_Angeles
		//UTC
		System.out.println(LocalTime.now().plusHours(10).plusMinutes(30).minusHours(8));
		//LocalDateTime dateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		checkTimeWithOffset(ZoneId.of("America/Los_Angeles"),ZoneId.of("UTC"),LocalTime.of(10, 30));
	}
	
	public static void getProgrammersDay() {
		LocalDate date  = LocalDate.of(1994, 01, 01);
		/*
		 * can be 
		 * date.plusDays(255);
		 */
		 LocalDate resultDate = date.plus(Period.ofDays(255));
		 System.out.println(resultDate);
	}
	
	public static void whatHappens() {
		LocalDate date = LocalDate.of(2000, 2, 29);
		LocalDate plusYears = date.plusYears(4 * 1);
		System.out.println(plusYears);
	}
	
	public static void nextWorkingDay() {
		LocalDate today =  LocalDate.of(2022, 01, 1);
		//today.with(next)
		LocalDate adjusted = today.with(next(today,w -> w.getDayOfWeek().getValue() < 6));
		System.out.println(adjusted);
	}
	
	public static TemporalAdjuster next(LocalDate date,Predicate<LocalDate> predicate) {
		if(predicate.test(date)){
			return date;
		}else {
			return next(date.plusDays(1),predicate);
		}
		
	}
	
	public static void displayDaysAlive() {
		long daysAlive = ChronoUnit.DAYS.between(LocalDate.of(1997, 05, 9), LocalDate.now());
		System.out.println(daysAlive);
	}
	
	public static void display13thInCentury() {
		LocalDate from = LocalDate.of(1901, 1, 1);
		LocalDate to = LocalDate.of(2000, 12, 21);
		List<LocalDate> dates = new ArrayList<>();
		TemporalAdjuster next13th = w -> {
			LocalDate d = (LocalDate) w;
			do {
				if (d.getDayOfWeek().getValue() == 5 && d.getDayOfMonth() == 13) {
					dates.add(d);
					d = d.plusDays(1);
				} else {
					d = d.plusDays(1);
				}
			} while (!d.isEqual(to));
			return d;
		};
		
		from.with(next13th);
		dates.stream().forEach((d) -> System.out.println(d));
	}
	
	 public static void testTimeIntervalClass() {
		 TimeInterval t = new TimeInterval(LocalTime.of(12, 00),LocalTime.of(9, 00));
		 System.out.println(t.checkIfOverLap());
		 System.out.println(t.getInterval());
	 }
	 
	 public static void getOffsets(){
		 
	 }
	 
	 public static void checkTimeWithOffset(ZoneId zoneIdFrom, ZoneId zoneIdto, LocalTime travelTime){
		ZonedDateTime dateTime = ZonedDateTime.now(zoneIdFrom);
		ZonedDateTime arrivalLocal = dateTime.plusHours(10).plusMinutes(30);
		ZonedDateTime arrivalOffset = arrivalLocal.withZoneSameInstant(zoneIdto);
		System.out.println(arrivalOffset);
	 }
}
