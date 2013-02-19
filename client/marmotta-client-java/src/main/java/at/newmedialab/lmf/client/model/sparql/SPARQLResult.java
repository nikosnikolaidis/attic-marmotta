/**
 * Copyright (C) 2013 Salzburg Research.
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
package at.newmedialab.lmf.client.model.sparql;

import at.newmedialab.lmf.client.model.rdf.RDFNode;

import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * Provides a list of result bindings and information about the available fields.
 * 
 * @author Sebastian Schaffert
 */
public class SPARQLResult extends LinkedList<Map<String,RDFNode>> {
    
    private static final long serialVersionUID = -527039638847863378L;
    
    private Set<String> fieldNames;

    /**
     * Constructs an empty list.
     */
    public SPARQLResult(Set<String> fieldNames) {
        this.fieldNames = fieldNames;
    }


    public Set<String> getFieldNames() {
        return fieldNames;
    }
    
}