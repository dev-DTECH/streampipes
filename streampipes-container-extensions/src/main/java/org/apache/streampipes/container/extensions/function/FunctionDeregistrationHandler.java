/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.streampipes.container.extensions.function;

import org.apache.streampipes.client.StreamPipesClient;
import org.apache.streampipes.model.function.FunctionDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class FunctionDeregistrationHandler extends RegistrationHandler {

  private static final Logger LOG = LoggerFactory.getLogger(FunctionDeregistrationHandler.class);

  public FunctionDeregistrationHandler(List<FunctionDefinition> functions) {
    super(functions);
  }

  @Override
  protected void performRequest(StreamPipesClient client) {
    client.adminApi().deregisterFunctions(functions);
  }

  @Override
  protected void logSuccess() {
    LOG.info("Successfully deregistered functions {}", functions.toString());
  }
}
