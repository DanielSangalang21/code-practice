package newDateTimeAPI;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeInterval {
	//private Duration duration;
	private LocalTime from;
	private LocalTime to;
	private long interval;
	
	public LocalTime getFrom() {
		return from;
	}

	public void setFrom(LocalTime from) {
		this.from = from;
	}

	public LocalTime getTo() {
		return to;
	}

	public void setTo(LocalTime to) {
		this.to = to;
	}

	public long getInterval() {
		return interval;
	}

	public void setInterval(long interval) {
		this.interval = interval;
	}

	public TimeInterval(LocalTime from,LocalTime to) {
		this.from = from;
		this.to = to;
		this.interval = ChronoUnit.HOURS.between(from, to);
	}
	
	public TimeInterval() {
		
	}
	
	public boolean checkIfOverLap() {
		if(from.equals(to) || from.isAfter(to)) return true;
		return false;
	}
}
