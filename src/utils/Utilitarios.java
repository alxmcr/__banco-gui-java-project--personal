package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Utilitarios {

	/**
	 * Format date: yyyy-mm-dd
	 * 
	 * @param fechaNacimientoStr
	 * @return
	 */
	public static Calendar convertStringToCalendar(String fechaNacimientoStr, String style) {

		Calendar date = null;
		Date fechaNac = null;

		if (fechaNacimientoStr != null) {
			SimpleDateFormat formato = new SimpleDateFormat(style);
			try {
				fechaNac = formato.parse(fechaNacimientoStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (fechaNac != null) {
			date = Calendar.getInstance();
			date.setTime(fechaNac);
		}

		return date;
	}

	public static String showCalendar(String style, Calendar calendar) {

		String calendarStr = null;

		if (calendar != null) {

			SimpleDateFormat format1 = new SimpleDateFormat(style);
			calendarStr = format1.format(calendar.getTime());
		}

		return calendarStr;
	}

}
