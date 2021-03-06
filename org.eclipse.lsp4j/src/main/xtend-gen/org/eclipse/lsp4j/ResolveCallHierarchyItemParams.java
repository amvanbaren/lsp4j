/**
 * Copyright (c) 2016-2018 TypeFox and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */
package org.eclipse.lsp4j;

import com.google.common.annotations.Beta;
import org.eclipse.lsp4j.CallHierarchyDirection;
import org.eclipse.lsp4j.CallHierarchyItem;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * The parameters of a {@code callHierarchy/resolve} request.
 */
@Beta
@SuppressWarnings("all")
public class ResolveCallHierarchyItemParams {
  /**
   * Unresolved item.
   */
  @NonNull
  private CallHierarchyItem item;
  
  /**
   * The number of levels to resolve.
   */
  private int resolve;
  
  /**
   * The direction of calls to resolve.
   */
  @NonNull
  private CallHierarchyDirection direction;
  
  /**
   * Unresolved item.
   */
  @Pure
  @NonNull
  public CallHierarchyItem getItem() {
    return this.item;
  }
  
  /**
   * Unresolved item.
   */
  public void setItem(@NonNull final CallHierarchyItem item) {
    this.item = item;
  }
  
  /**
   * The number of levels to resolve.
   */
  @Pure
  public int getResolve() {
    return this.resolve;
  }
  
  /**
   * The number of levels to resolve.
   */
  public void setResolve(final int resolve) {
    this.resolve = resolve;
  }
  
  /**
   * The direction of calls to resolve.
   */
  @Pure
  @NonNull
  public CallHierarchyDirection getDirection() {
    return this.direction;
  }
  
  /**
   * The direction of calls to resolve.
   */
  public void setDirection(@NonNull final CallHierarchyDirection direction) {
    this.direction = direction;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("item", this.item);
    b.add("resolve", this.resolve);
    b.add("direction", this.direction);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ResolveCallHierarchyItemParams other = (ResolveCallHierarchyItemParams) obj;
    if (this.item == null) {
      if (other.item != null)
        return false;
    } else if (!this.item.equals(other.item))
      return false;
    if (other.resolve != this.resolve)
      return false;
    if (this.direction == null) {
      if (other.direction != null)
        return false;
    } else if (!this.direction.equals(other.direction))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.item== null) ? 0 : this.item.hashCode());
    result = prime * result + this.resolve;
    return prime * result + ((this.direction== null) ? 0 : this.direction.hashCode());
  }
}
