/**
 * Copyright 2009-2018 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.model.filter;

import java.util.Locale;
import org.primefaces.util.LangUtils;

public class ContainsFilterConstraint implements FilterConstraint {

    @Override
    public boolean applies(Object value, Object filter, Locale locale) {
        String filterText = (filter == null) ? null : filter.toString().trim().toLowerCase(locale);

        if (LangUtils.isValueEmpty(filterText)) {
            return true;
        }

        if (value == null) {
            return false;
        }

        return value.toString().toLowerCase(locale).contains(filterText);
    }
}
