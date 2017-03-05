/*
 * Vogon personal finance/expense analyzer.
 * Licensed under Apache license: http://www.apache.org/licenses/LICENSE-2.0
 * Author: Dmitry Zolotukhin <zlogic@gmail.com>
 */
package org.zlogic.vogon.web.configuration;

import org.springframework.stereotype.Service;

/**
 * Various global configuration options
 *
 * @author Dmitry Zolotukhin [zlogic@gmail.com]
 */
@Service
public class VogonConfiguration {

	/**
	 * Allow registration
	 */
	private final static String ALLOW_REGISTRATION = "ALLOW_REGISTRATION";

	/**
	 * Token expires days
	 */
	private final static String TOKEN_EXPIRES_DAYS = "TOKEN_EXPIRES_DAYS";

	/**
	 * Returns true if registration is allowed
	 *
	 * @return true if registration is allowed
	 */
	public boolean isAllowRegistration() {
		String allowRegistration = System.getenv(ALLOW_REGISTRATION);
		if (allowRegistration == null)
			return false;
		return Boolean.parseBoolean(allowRegistration);
	}

	/**
	 * Returns the number of seconds a token lasts before it expires
	 *
	 * @return the number of seconds a token lasts before it expires
	 */
	public int getTokenExpiresSeconds() {
		String tokenExpiresDays = System.getenv(TOKEN_EXPIRES_DAYS);
		if (tokenExpiresDays == null)
			tokenExpiresDays = "14";
		return 60 * 60 * 24 * Integer.parseInt(tokenExpiresDays);
	}
}
