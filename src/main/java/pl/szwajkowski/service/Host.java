package pl.szwajkowski.service;

import java.util.Locale;

public enum Host {
	ONE("one.pl", "pl_PL"),
	TWO("two.cz", "cs_CZ"),
	THREE("three.ru", "ru_RU");

	private final String host;

	private final Locale defaultLocale;

	Host(String host, String defaultLocale) {
		this.host = host;
		this.defaultLocale = new Locale(defaultLocale);
	}

	public String getHost() {
		return host;
	}
	public Locale getDefaultLocale() {
		return defaultLocale;
	}
}
