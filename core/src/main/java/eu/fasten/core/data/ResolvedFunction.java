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
import java.util.Set;

/**
 * A ResolvedFunction represents a function which can be resolved (is part of)
 * within the current package version (i.e., is not a call to a function specified
 * in a dependency).
 */
public class ResolvedFunction extends Function implements Serializable {

    public final PackageVersion pkg;

    public ResolvedFunction(String fqn, Set<ResolvedFunction> resolvedCalls,
                            Set<UnresolvedFunction> unresolvedCalls, PackageVersion pkg) {
        super(fqn, resolvedCalls, unresolvedCalls);
        this.pkg = pkg;
    }
}
