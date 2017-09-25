/*******************************************************************************
 * OpenEMS - Open Source Energy Management System
 * Copyright (c) 2016, 2017 FENECON GmbH and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * Contributors:
 *   FENECON GmbH - initial API and implementation and initial documentation
 *******************************************************************************/
package io.openems.api.doc;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import io.openems.api.security.User;

@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface ChannelInfo {

	public static final String DEFAULT_DESCRIPTION = "";
	public static final String DEFAULT_TITLE = "";
	public static final boolean DEFAULT_IS_OPTIONAL = false;
	public static final boolean DEFAULT_IS_ARRAY = false;
	public static final User DEFAULT_ACCESS_LEVEL = User.ADMIN;
	public static final String DEFAULT_VALUE = "";

	String title() default DEFAULT_TITLE;

	String description() default DEFAULT_DESCRIPTION;

	Class<?> type();

	boolean isOptional() default DEFAULT_IS_OPTIONAL;

	boolean isArray() default DEFAULT_IS_ARRAY;

	User accessLevel() default User.ADMIN;

	/**
	 * String is interpreted as a JsonElement
	 *
	 * @return
	 */
	String defaultValue() default DEFAULT_VALUE;
}