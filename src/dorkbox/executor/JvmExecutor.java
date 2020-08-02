/*
 * Copyright 2010 dorkbox, llc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dorkbox.executor;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;

/**
 * This will FORK the java process initially used to start the currently running JVM. Changing the java executable will change this behaviors
 */
public
class JvmExecutor extends ShellExecutor {

    /**
     * Gets the version number.
     */
    public static
    String getVersion() {
        return "1.1";
    }

    /**
     * Reconstructs the path to the JVM used to launch this process. It will always use the "console" version, even on windows.
     */
    public static
    String getJvmPath() {
        throw DEPRECATED_EXCEPTION;
    }

    /**
     * Checks whether a Java Virtual Machine can be located in the supplied path.
     *
     * @param jvmLocation the location of the JVM to check
     */
    private static
    String checkJvmPath(String jvmLocation) {
        throw DEPRECATED_EXCEPTION;
    }

    public
    JvmExecutor() {
        throw DEPRECATED_EXCEPTION;
    }

    public
    JvmExecutor(InputStream in, PrintStream out, PrintStream err) {
        throw DEPRECATED_EXCEPTION;
    }

    public final
    void setMainClass(String mainClass) {
        throw DEPRECATED_EXCEPTION;
    }

    public final
    void setInitialHeapSizeInMegabytes(int startingHeapSizeInMegabytes) {
        throw DEPRECATED_EXCEPTION;
    }

    public final
    void setMaximumHeapSizeInMegabytes(int maximumHeapSizeInMegabytes) {
        throw DEPRECATED_EXCEPTION;
    }

    public final
    void addJvmClasspath(String classpathEntry) {
        throw DEPRECATED_EXCEPTION;
    }

    public final
    void addJvmClasspath(List<String> paths) {
        throw DEPRECATED_EXCEPTION;
    }

    public final
    void addJvmOption(String argument) {
        throw DEPRECATED_EXCEPTION;
    }

    public final
    void addJvmOptions(List<String> paths) {
        throw DEPRECATED_EXCEPTION;
    }

    public final
    void setJarFile(String jarFile) {
        throw DEPRECATED_EXCEPTION;
    }

    private
    String getClasspath() {
        throw DEPRECATED_EXCEPTION;
    }

    /**
     * Specify the JAVA executable to launch this process. By default, this will use the same java executable
     * as was used to start the current JVM.
     */
    public
    void setJava(String javaLocation) {
        throw DEPRECATED_EXCEPTION;
    }

    @SuppressWarnings({"UseBulkOperation", "ManualArrayToCollectionCopy"})
    @Override
    public
    int start() {
        throw DEPRECATED_EXCEPTION;
    }
}
