/*
 * Copyright (c) 2007, 2017, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package jdk.internal.misc;

import java.io.FileDescriptor;
import java.io.IOException;

/*
 * @author Chris Hegarty
 */

public interface JavaIOFileDescriptorAccess {
    public void set(FileDescriptor fdo, int fd);
    public int get(FileDescriptor fdo);
    public void setAppend(FileDescriptor fdo, boolean append);
    public boolean getAppend(FileDescriptor fdo);
    public void close(FileDescriptor fdo) throws IOException;
    public void registerCleanup(FileDescriptor fdo);

    // Only valid on Windows
    public void setHandle(FileDescriptor fdo, long handle);
    public long getHandle(FileDescriptor fdo);
}
