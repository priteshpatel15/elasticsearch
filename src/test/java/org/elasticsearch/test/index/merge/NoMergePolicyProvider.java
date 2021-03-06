/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.elasticsearch.test.index.merge;

import org.apache.lucene.index.MergePolicy;
import org.apache.lucene.index.NoMergePolicy;
import org.elasticsearch.ElasticsearchException;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.index.merge.policy.AbstractMergePolicyProvider;
import org.elasticsearch.index.store.Store;

/**
 * {@link org.elasticsearch.index.merge.policy.MergePolicyProvider} for lucenes {@link org.apache.lucene.index.NoMergePolicy}
 */
public class NoMergePolicyProvider extends AbstractMergePolicyProvider<MergePolicy> {

    @Inject
    public NoMergePolicyProvider(Store store) {
        super(store);
    }

    @Override
    public MergePolicy getMergePolicy() {
        return NoMergePolicy.INSTANCE;
    }

    @Override
    public void close() throws ElasticsearchException {}
}

