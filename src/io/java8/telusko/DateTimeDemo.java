package io.java8.telusko;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class DateTimeDemo {

	public static void main(String[] args) {

		LocalDate d = LocalDate.now();

		System.out.println(d);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate df = LocalDate.now();
		String dateWithFormat = formatter.format(df);
		System.out.println("Date With Format :" + dateWithFormat);

		LocalDate d1 = LocalDate.of(1993, Month.APRIL, 12);
		System.out.println(d1);

		LocalTime t = LocalTime.now();
		System.out.println(t);

		LocalTime t1 = LocalTime.of(12, 35, 10, 999);
		System.out.println(t1);

		LocalTime t2 = LocalTime.now(ZoneId.of("America/Toronto"));
		System.out.println("America/Toronto :" + t2);

		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt); // Human Readable

		Instant i = Instant.now();
		System.out.println(i); // Machine Readable

		for (String s : TimeZone.getAvailableIDs()) {
			System.out.println(s);
		}

		for (String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
	}

}
