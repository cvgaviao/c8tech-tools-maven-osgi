/**
 * ======================================================================
 * Copyright © 2015-2019, Cristiano V. Gavião.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * =======================================================================
 */
package br.com.c8tech.tools.maven.osgi.lib.mojo.incremental.internal;

import java.net.URL;

import io.takari.incrementalbuild.spi.AbstractBuildContext;
import io.takari.incrementalbuild.spi.DefaultBuildContextState;
import io.takari.incrementalbuild.spi.DefaultResourceMetadata;

public class DefaultURLResourceMetadata
        extends DefaultResourceMetadata<URL> {

    public DefaultURLResourceMetadata(AbstractBuildContext context,
            DefaultBuildContextState state, URL resource) {
        super(context, state, resource);
    }

}
