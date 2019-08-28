/*
 * Copyright 2019-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.multitenant.service

/**
 * The client reports changes in terms of modified files ([FsChanges]), but the service needs
 * to operate on changes to the build graph, so we must create a mapping between the two.
 */
interface FsToBuildPackageChangeTranslator {
    /**
     * Parse packages which changed because of changes in filesystem
     * @param generation Base generation upon which filesystem changes are based
     * @param fsChanges Changes in filesystem, like modification of a file
     */
    fun translateChanges(generation: Generation, fsChanges: FsChanges): BuildPackageChanges
}
