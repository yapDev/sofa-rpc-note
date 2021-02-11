/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fake.me.sofa.rpc.core.exception;

public class SofaTimeOutException extends SofaRpcException {

    private static final long serialVersionUID = 1L;

    public SofaTimeOutException(String message) {
        super(RpcErrorType.CLIENT_TIMEOUT, message);
    }

    public SofaTimeOutException(Throwable cause) {
        super(RpcErrorType.CLIENT_TIMEOUT, cause);
    }

    public SofaTimeOutException(String message, Throwable cause) {
        super(RpcErrorType.CLIENT_TIMEOUT, message, cause);
    }
}
