package pl.szwajkowski.service;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * Created by Łukasz on 2015-05-19.
 */
@Component
@Order(1)
public class LocaleChanger implements LocaleResolver {

	@Override
	public Locale resolveLocale(HttpServletRequest request) {
		return StringUtils.parseLocaleString(request.getHeader(HttpHeaders.ACCEPT_LANGUAGE));
	}
	@Override
	public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {
		throw new UnsupportedOperationException();
	}
}
