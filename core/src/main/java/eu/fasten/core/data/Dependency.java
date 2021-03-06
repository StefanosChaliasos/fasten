/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.fasten.core.data;

import java.io.Serializable;

/**
 * A dependency relationship in a package dependency network. A dependency is
 * owned by a {@link PackageVersion} and links the owning package to another
 * package given a {@link Dependency#versionConstraint}. The contents of the
 * {@link Dependency#versionConstraint} is determined by the underlying package
 * network. Most of them just use some form of semantic versioning.
 */
public class Dependency implements Serializable {

    public final Package pkg;
    public final String versionConstraint;

    public Dependency(Package pkg, String versionConstraint) {
        this.pkg = pkg;
        this.versionConstraint = versionConstraint;
    }

    @Override
    public String toString() {
        return "Dependency(" + pkg.toString() + "," + versionConstraint + ")";
    }
}
