/*
 * Copyright © 2025 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */


package io.cdap.wrangler.parser;

public class ByteSize {
  private final long bytes;

  public ByteSize(String input) {
    input = input.trim().toLowerCase();
    if (input.endsWith("kb")) {
      bytes = (long) (Double.parseDouble(input.replace("kb", "")) * 1024);
    } else if (input.endsWith("mb")) {
      bytes = (long) (Double.parseDouble(input.replace("mb", "")) * 1024 * 1024);
    } else if (input.endsWith("gb")) {
      bytes = (long) (Double.parseDouble(input.replace("gb", "")) * 1024 * 1024 * 1024);
    } else {
      bytes = Long.parseLong(input.replace("b", ""));
    }
  }

  public long getBytes() {
    return bytes;
  }
}
