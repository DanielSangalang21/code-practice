package covariantAndContravariant;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import newDateTimeAPI.TimeInterval;

public class GenericClass {
	 public static void main(String[] atgs) {
		 Person e1 = new Person("Leinad",22);
		 Person e2 = new Person("Lein",21);
		 List<Person> per = Arrays.asList(e1,e2);
		 List<? extends Person> emp = per;
		
		 Person p1 = new Person("Daniel",21);
		
			Function<Person, Employee> func = (t) -> {
				return  (Employee) t;
			};
			
		Person p = testFunction(func);
		//System.out.println(p.getAge() + " name:" + p.getName());
		LocalDate date = LocalDate.now();
		LocalDate date2 = LocalDate.of(2014,Month.JANUARY, 10);
		//Duration duration = Duration.between(date2, date);
		//get diff of dates in Period format [8Y6D (8 years, 6 days)] 
		Period period = Period.between(date2, date);
		//get difference between dates in days
		date2.until(date,ChronoUnit.DAYS);
		//SimpleDateFormat sdf = new SimpleDateFormat;
		DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		//System.out.println(date2.format(df));
		//System.out.println(date2.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)));
		
		
		LocalDate date3 = date2.with((w) ->{
			LocalDate dt =(LocalDate) w;
			return dt.plusDays(2);
		});
		//System.out.println(date3);
		//LocalDate t =(LocalDate) TemporalAdjusters.ofDateAdjuster(unaryOperator);
		
		LocalTime time = LocalTime.of(22, 59, 59);
		//System.out.println(time.withMinute(28));
		
		ZoneId.getAvailableZoneIds();
		
		ZonedDateTime z =  ZonedDateTime.of(LocalDateTime.of(1992, 12, 25, 12, 59), ZoneId.of("America/New_York"));
		
		//System.out.println(z.toInstant());
		
		LocalDateTime dt = LocalDateTime.of(2022, 1, 1, 15, 20);
		//System.out.println(dt.atZone(ZoneId.of("UTC")));
		
		//3:30 because of dst which in berlin skipped 2:00 AM
		ZonedDateTime skipped = ZonedDateTime.of(
				 LocalDate.of(2013, 3, 31),
				 LocalTime.of(2, 30),
				 ZoneId.of("Europe/Berlin"));
		System.out.println(skipped);
		Duration.between(z, skipped);
		System.out.println(z.toLocalTime());
		//when using ZonedDateTime don't use Duration instead Period meeting.plus(Period.ofDays(7))
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMM dd yyyy KK:mma eeee zz xxx OOOO");
		System.out.println(z.format(f));
		System.out.println(LocalDateTime.parse("1969-24-12 03:32:00",DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss")));
	 }
	 
	 public static String getName(List<? extends Employee> employees) {
		 employees.get(0).setEmployerName("Daniel");
		 return  employees.get(0).getEmployerName();
	 }
	 
	 public static Person testFunction(Function<? super Employee,? extends Person> func) {
		 return func.apply(new Employee("cha-cha",22,"tera",103));
	 }
	 
	
 
}
