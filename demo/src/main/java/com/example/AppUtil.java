package com.example;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.beanutils.BeanComparator;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;


/**
 * ApplicationUtility
 * @author shingo_ito
 *
 */
public class AppUtil {

	private AppUtil() {
		// インスタンス化させないため、privateのコンストラクタを用意
	}
	/**
	 * 
	 * @param list
	 * @return
	 */
	public static <E> boolean isEmptyList(final List<E> list) {
		return list == null || list.isEmpty();
	}
	public static <E> boolean isNotEmptyList(final List<E> list) {
		return !isEmptyList(list);
	}
	/**
	 * 
	 * @param list
	 * @return
	 */
	public static <E> E getFirstElement(final List<E> list) {
		return isEmptyList(list) ? null : list.get(0);
	}
	/**
	 * 
	 * @param list
	 * @param property
	 * @return
	 */
	public static <E> List<E> sortByPropertiy(List<E> list, String property) {
		List<E> ret = new ArrayList<>(list);
		Collections.sort(ret, new BeanComparator<>(property));
		return ret;
	}
	public static <E> List<E> sortDescByPropertiey(List<E>list , String property) {
		List<E> ret = sortByPropertiy(list, property);
		Collections.reverse(ret);
		return ret;
		
	}
	/**
	 * 
	 * @param list
	 * @return
	 */
	public static <E> List<E> getDistinctList(List<E> list) { 
		return list.stream().distinct().collect(Collectors.toList());
	}

	/**
	 * @param str
	 * @return
	 */
	public static boolean isEmptyString(final String str) {
		return StringUtils.isEmpty(str);
	}

	/**
	 * @param str
	 * @return
	 */
	public static boolean isBlankString(final String str) {
		return StringUtils.isBlank(str);
	}

	/**
	 * @param str
	 * @return
	 */
	public static boolean isNumelicString(final String str) {
		if (isEmptyString(str)) {
			return false;
		}
		return StringUtils.isNumeric(str);
	}

	/**
	 * @return
	 */
	public static Date getToday() {
		return DateUtils.truncate(new Date(), Calendar.DATE);
	}

	/**
	 * @return
	 */
	public static Date getNow() {
		return new Date();
	}

	/**
	 * @param date
	 * @return
	 */
	public static Timestamp convertToTimestamp(Date date) {
		return new Timestamp(date.getTime());
	}

	/**
	 * @param date
	 * @param formatString
	 * @return
	 */
	public static String getFormatDate(final Date date, String formatString) {
		return new SimpleDateFormat(formatString).format(date);
	}
	public static <E> boolean isContainsList(final List<E> list, E element) {
		return list.contains(element);
	}

	public static int compareToDate(Date date, Date date2) {
		return date.compareTo(date2);
	}
	public static int compareToTimestamp(Timestamp date, Timestamp date2) {
		return date.compareTo(date2);
	}
}
