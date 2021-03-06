/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.thinkbiganalytics.guava;

/*-
 * #%L
 * kylo-commons-util7
 * %%
 * Copyright (C) 2017 - 2018 ThinkBig Analytics, a Teradata Company
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.common.base.Predicate;

/**
 * Abstract implementation of {@link Predicate}.
 *
 * <p>Derived class needs to implement the {@link #test} method.
 *
 * <p>Helps with the transition to {@code java.util.function.Predicate},
 * which was introduced in JDK 1.8, and is required in Guava 21.0 and higer, but still works on JDK 1.7.
 *
 * @param <T> the type of the input to the predicate
 * @implNote Copied from Apache licensed org/apache/calcite/runtime/PredicateImpl.java
 */
public abstract class PredicateImpl<T> implements Predicate<T> {

    public final boolean apply(T input) {
        return test(input);
    }

    /**
     * Overrides {@code java.util.function.Predicate#test} in JDK8 and higher.
     */
    public abstract boolean test(T t);
}
