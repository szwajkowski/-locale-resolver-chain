package pl.szwajkowski.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Locale;

/**
 * Created by Łukasz on 2015-05-19.
 */
@Component("localeResolver")
public class AggregatingLocaleResolver implements LocaleResolver {

	private final List<LocaleResolver> resolvers;

	@Autowired
	public AggregatingLocaleResolver(List<LocaleResolver> resolvers) {
		this.resolvers = resolvers;
	}

	@Override
	public Locale resolveLocale(HttpServletRequest request) {
		Locale locale = null;
		for (LocaleResolver resolver : resolvers) {
			locale = resolver.resolveLocale(request);
			if (locale != null) {
				break;
			}
		}
		return locale;
	}
	@Override
	public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {
		LocaleContextHolder.setLocale(locale);

	}
}
