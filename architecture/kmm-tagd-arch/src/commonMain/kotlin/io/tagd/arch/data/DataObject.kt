/*
 * Copyright (C) 2021 The TagD Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.tagd.arch.data

import io.tagd.arch.data.bind.BindableSubject
import io.tagd.core.Copyable
import io.tagd.core.Validatable

open class DataObject : BindableSubject(), Validatable, Copyable {

    enum class CrudOperation(val value: String) {
        CREATE("C"), UPDATE("U"), DELETE("D"), READ("R")
    }

    var crudOperation: CrudOperation = CrudOperation.CREATE

    override fun initialize() {
        crudOperation = CrudOperation.CREATE
    }

    override fun validate() {
        //no-op
    }
}



