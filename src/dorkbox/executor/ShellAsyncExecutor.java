/*
 * Copyright 2017 dorkbox, llc
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

public
class ShellAsyncExecutor extends ShellExecutor {
    /**
     * This is a convenience method to easily create a default process. Will immediately return, and does not wait for the process to finish
     *
     * @param executableName the name of the executable to run
     * @param args the arguments for the executable
     *
     * @return true if the process ran successfully (exit value was 0), otherwise false
     */
    public static
    boolean run(String executableName, String... args) {
        throw new RuntimeException(
                "This project has been deprecated for a more fully functional, and improved version via the Dorkbox ProcessExecutor");
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
        throw new RuntimeException(
                "This project has been deprecated for a more fully functional, and improved version via the Dorkbox ProcessExecutor");
    }

    @Override
    public
    int start() {
        throw new RuntimeException(
                "This project has been deprecated for a more fully functional, and improved version via the Dorkbox ProcessExecutor");
    }
}
