/*
 * Copyright(c) 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sastix.cms.common.lock;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * The specific object holds all the information related to a Query Lock.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class QueryLockDTO implements Serializable {
    /**
     * Serial Version UID.
     */
    private static final long serialVersionUID = 3214527307576872325L;

    /**
     * The Unique Identifier that the caller attempts to lock.
     */
    @NotNull
    @JsonProperty("UID")

    private String UID;


}
