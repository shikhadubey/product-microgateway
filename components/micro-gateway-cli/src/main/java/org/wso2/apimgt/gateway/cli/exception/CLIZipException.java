/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.wso2.apimgt.gateway.cli.exception;

/**
 * Thrown to indicate that an exception occurred while zipping operations in the cli.
 */
public class CLIZipException extends RuntimeException {

    /**
     * Creates a CLIZipException using error message and a throwable.
     * 
     * @param message error message
     * @param e throwable
     */
    public CLIZipException(String message, Throwable e) {
        super(message, e);
    }
}
