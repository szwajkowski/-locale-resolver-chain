package pl.szwajkowski.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * Created by Łukasz on 2015-05-19.
 */
@Component
@Order(2)
public class DomainLocaleResolver implements LocaleResolver{

	@Override
	public Locale resolveLocale(HttpServletRequest request) {
		if (request.getServerName().contains(Host.ONE.getHost())) {
			return Host.ONE.getDefaultLocale();
		}
		return Locale.ENGLISH;
	}
	@Override
	public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {
		throw new UnsupportedOperationException();
	}
}
