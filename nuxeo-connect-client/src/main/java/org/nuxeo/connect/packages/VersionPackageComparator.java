/*
 * (C) Copyright 2011-2012 Nuxeo SA (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     Thierry Delprat, jcarsique
 *
 */
package org.nuxeo.connect.packages;

import java.util.Comparator;

import org.nuxeo.connect.update.Package;

/**
 * Compares {@link Package} by ID (name+version)
 *
 * @since 1.3
 */
public class VersionPackageComparator implements Comparator<Package> {

    @Override
    public int compare(Package p1, Package p2) {
        return p1.getId().compareToIgnoreCase(p2.getId());
    }

}
