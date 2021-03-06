/**
 * ======================================================================
 * Copyright © 2015-2019, OSGi Alliance, Cristiano V. Gavião.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * =======================================================================
 */
package org.osgi.service.indexer.impl.util;

import java.util.List;

public interface Reporter {
    void error(String s, Object... args);

    void warning(String s, Object... args);

    void progress(String s, Object... args);

    void trace(String s, Object... args);

    List<String> getWarnings();

    List<String> getErrors();

    boolean isPedantic();
}
