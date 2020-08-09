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

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;

/**
 * If you want to save off the output from the process, set a PrintStream to the following:
 * <pre> {@code
 *
 * ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8196);
 * PrintStream outputStream = new PrintStream(byteArrayOutputStream);
 * ...
 *
 * String output = ShellProcessBuilder.getOutput(byteArrayOutputStream);
 * }</pre>
 */
@SuppressWarnings({"UnusedReturnValue", "unused", "ManualArrayToCollectionCopy", "UseBulkOperation", "Convert2Diamond", "Convert2Lambda",
                   "Anonymous2MethodRef", "WeakerAccess"})
public
class ShellExecutor {

    static final RuntimeException DEPRECATED_EXCEPTION = new RuntimeException("This project has been deprecated for a more functional and greatly improved version via the Dorkbox Executor");


    /**
     * Gets the version number.
     */
    public static
    String getVersion() {
        return "2.0";
    }

    /**
     * This is a convenience method to easily create a default process. Will block until the process is finished running
     *
     * @param executableName the name of the executable to run
     * @param args the arguments for the executable
     *
     * @return true if the process ran successfully (exit value was 0), otherwise false
     */
    public static boolean run(String executableName, String... args) {
        throw DEPRECATED_EXCEPTION;
    }

    /**
     * This is a convenience method to easily create a default process. Will immediately return, and does not wait for the process to finish
     *
     * @param executableName the name of the executable to run
     * @param args the arguments for the executable
     *
     * @return true if the process ran successfully (exit value was 0), otherwise false
     */
    public static
    boolean runShell(String executableName, String... args) {
        throw DEPRECATED_EXCEPTION;
    }

    /**
     * This will cause the spawned process to pipe it's output to a String, so it can be retrieved.
     */
    public
    ShellExecutor() {
        throw DEPRECATED_EXCEPTION;
    }

    public
    ShellExecutor(final PrintStream out) {
        throw DEPRECATED_EXCEPTION;
    }

    public
    ShellExecutor(final InputStream in, final PrintStream out) {
        throw DEPRECATED_EXCEPTION;
    }

    public
    ShellExecutor(final InputStream in, final PrintStream out, final PrintStream err) {
        throw DEPRECATED_EXCEPTION;
    }

    /**
     * Creates extra reader/writer threads for the sub-process. This is useful depending on how the sub-process is designed to run.
     * </p>
     * For a process you want interactive IO with, this is required.
     * </p>
     * For a long-running sub-process, with no interactive IO, this is what you'd want.
     * </p>
     * For a run-and-get-the-results process, this isn't recommended.
     *
     */
    public final
    ShellExecutor createReadWriterThreads() {
        throw DEPRECATED_EXCEPTION;
    }

    /**
     * When launched from eclipse, the working directory is USUALLY the root of the project folder
     */
    public final
    ShellExecutor setWorkingDirectory(final String workingDirectory) {
        throw DEPRECATED_EXCEPTION;
    }

    /**
     * The Shell's execution environment variables. Set to `null` to only use the default environment variables (From what
     * {@link System#getenv} returns)
     */
    public final
    ShellExecutor setEnvironment(final Map<String,String> environment) {
        throw DEPRECATED_EXCEPTION;
    }

    public final
    ShellExecutor addArgument(final String argument) {
        throw DEPRECATED_EXCEPTION;
    }

    public final
    ShellExecutor addArguments(final String... args) {
        throw DEPRECATED_EXCEPTION;
    }

    public final
    ShellExecutor addArguments(final List<String> paths) {
        throw DEPRECATED_EXCEPTION;
    }

    public final
    ShellExecutor setExecutable(final String executableName) {
        throw DEPRECATED_EXCEPTION;
    }

    public
    ShellExecutor setExecutableDirectory(final String executableDirectory) {
        throw DEPRECATED_EXCEPTION;
    }

    /**
     * This will execute as a shell command (bash/cmd/etc) instead of as a forked process.
     */
    public
    ShellExecutor executeAsShellCommand() {
        throw DEPRECATED_EXCEPTION;
    }




    /**
     * Sends all output data for this process to "null" in a cross platform method
     */
    public
    ShellExecutor pipeOutputToNull() throws IllegalArgumentException {
        throw DEPRECATED_EXCEPTION;
    }

    /**
     * @return the executable command issued
     */
    public
    String getCommand() {
        throw DEPRECATED_EXCEPTION;
    }

    public
    int start() {
        throw DEPRECATED_EXCEPTION;
    }

    public
    int start(final boolean waitForProcesses) {
        throw DEPRECATED_EXCEPTION;
    }

    /**
     * There will never be a trailing newline character at the end of this output.
     *
     * @return A string representing the output of the process, null if the thread for this was interrupted or the output wasn't saved
     */
    public
    String getOutput() {
        throw DEPRECATED_EXCEPTION;
    }

    /**
     * Converts the baos to a string in a safe way. There will never be a trailing newline character at the end of this output. This will
     * block until there is a line of input available.
     *
     * @return A string representing the output of the process, null if the thread for this was interrupted or the output wasn't saved
     */
    public
    String getOutputLineBuffered() {
        throw DEPRECATED_EXCEPTION;
    }

    /**
     * Converts the baos to a string in a safe way. There will never be a trailing newline character at the end of this output.
     *
     * @param byteArrayOutputStream the baos that is used in the {@link ShellExecutor#ShellExecutor(PrintStream)} (or similar
     *                              calls)
     *
     * @return A string representing the output of the process, null if the thread for this was interrupted
     */
    public static
    String getOutput(final ByteArrayOutputStream byteArrayOutputStream) {
        throw DEPRECATED_EXCEPTION;
    }

    /**
     * Converts the baos to a string in a safe way. There will never be a trailing newline character at the end of this output. This will
     * block until there is a line of input available.
     *
     * @param byteArrayOutputStream the baos that is used in the {@link ShellExecutor#ShellExecutor(PrintStream)} (or similar
     * calls)
     *
     * @return A string representing the output of the process, null if the thread for this was interrupted
     */
    public static
    String getOutputLineBuffered(final ByteArrayOutputStream byteArrayOutputStream) {
        throw DEPRECATED_EXCEPTION;
    }
}

