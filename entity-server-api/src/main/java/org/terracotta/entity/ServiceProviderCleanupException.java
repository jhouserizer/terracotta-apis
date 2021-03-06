/*
 *
 *  The contents of this file are subject to the Terracotta Public License Version
 *  2.0 (the "License"); You may not use this file except in compliance with the
 *  License. You may obtain a copy of the License at
 *
 *  http://terracotta.org/legal/terracotta-public-license.
 *
 *  Software distributed under the License is distributed on an "AS IS" basis,
 *  WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 *  the specific language governing rights and limitations under the License.
 *
 *  The Covered Software is Entity API.
 *
 *  The Initial Developer of the Covered Software is
 *  Terracotta, Inc., a Software AG company
 *
 */
package org.terracotta.entity;


/**
 * An exception type thrown by {@link ServiceProvider#prepareForSynchronization()} to describe why the provider's
 * state could not be cleared.
 */
public class ServiceProviderCleanupException extends Exception {
  private static final long serialVersionUID = 1L;

  public ServiceProviderCleanupException(String s) {
    super(s);
  }

  public ServiceProviderCleanupException(String s, Throwable throwable) {
    super(s, throwable);
  }
}
