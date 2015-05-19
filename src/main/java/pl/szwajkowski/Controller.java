package pl.szwajkowski;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Łukasz on 2015-05-19.
 */
@org.springframework.stereotype.Controller
@RequestMapping("/test")
public class Controller {

	@ResponseBody
	@RequestMapping
	public String test() {
		return LocaleContextHolder.getLocale().toString();
	}
}
