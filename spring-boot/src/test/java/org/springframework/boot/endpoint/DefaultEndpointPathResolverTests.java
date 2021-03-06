/*
 * Copyright 2012-2017 the original author or authors.
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

package org.springframework.boot.endpoint;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Tests for {@link DefaultEndpointPathResolver}.
 *
 * @author Madhura Bhave
 */
public class DefaultEndpointPathResolverTests {

	private DefaultEndpointPathResolver resolver = new DefaultEndpointPathResolver();

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void resolveShouldThrowException() throws Exception {
		this.thrown.expect(UnsupportedOperationException.class);
		this.resolver.resolvePath("my-id");
	}
}
