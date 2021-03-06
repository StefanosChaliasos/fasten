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
import java.util.Objects;

/**
 * A Package represents an unversioned artifact residing in a package repository.
 */
public class Package implements Serializable {

    public final String repo;
    public final String artifactName;

    public Package(String repo, String artifactName) {
        this.repo = repo;
        this.artifactName = artifactName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Package)) return false;

        var pkg = (Package) obj;

        return Objects.equals(artifactName, pkg.artifactName) && Objects.equals(repo, pkg.repo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artifactName, repo);
    }

    @Override
    public String toString() {
        return "Package(" + artifactName + ")";
    }
}
