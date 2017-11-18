/*
 * Copyright (c) 2011-2017 Pivotal Software Inc, All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package reactor.ipc.netty.http.server;

import io.netty.bootstrap.ServerBootstrap;
import reactor.core.publisher.Mono;
import reactor.ipc.netty.Connection;
import reactor.ipc.netty.tcp.TcpServer;

import java.util.Objects;

/**
 * @author Stephane Maldini
 */
abstract class HttpServerOperator extends HttpServer {

	final HttpServer source;

	HttpServerOperator(HttpServer source) {
		this.source = Objects.requireNonNull(source, "source");
	}

	@Override
	protected TcpServer tcpConfiguration() {
		return source.tcpConfiguration();
	}
}