/**
 * ==========================================================================
 * Copyright © 2015-2018 Cristiano Gavião, C8 Technology ME.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Cristiano Gavião (cvgaviao@c8tech.com.br)- initial API and implementation
 * ==========================================================================
 */
package br.com.c8tech.tools.maven.osgi.lib.mojo.filters;

import java.util.Collection;
import java.util.List;

import javax.inject.Named;

import org.apache.maven.artifact.resolver.filter.ArtifactFilter;

public interface FilterFactory {

    @Named("filter.optional")
    ArtifactFilter newFilterAllowOptionalArtifacts();

    @Named("filter.optional")
    ArtifactFilter newFilterDenyOptionalArtifacts();

    @Named("filter.scopes")
    ArtifactFilter newFilterAnyOfTheseScopes(Collection<String> scopes);

    @Named("filter.excludes")
    ArtifactFilter newFilterExcludeTheseArtifacts(
            List<String> excludedArtifacts);
}
